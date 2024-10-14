package symply.homework.travelulu.settings.presentation.actionbar

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import symply.homework.travelulu.commonpresentation.ui.theme.settingActionBarColor
import symply.homework.travelulu.commonpresentation.ui.theme.settingTitleColor
import symply.homework.travelulu.commonpresentation.ui.theme.settingsActionBarTextStyle

@Composable
fun SettingsActionBar(modifier: Modifier = Modifier, onBackClick: () -> Unit) {
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        IconButton(onClick = onBackClick) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = "Back",
                tint = settingTitleColor
            )
        }

        Text(text = "Travelulu", modifier = Modifier.fillMaxWidth(), style = settingsActionBarTextStyle)
    }
}