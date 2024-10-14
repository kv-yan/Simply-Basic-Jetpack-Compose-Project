package symply.homework.travelulu.home.presentation.actionbar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import symply.homework.travelulu.commonpresentation.ui.theme.blueButtonColor
import symply.homework.travelulu.commonpresentation.ui.theme.dividerColor
import symply.homework.travelulu.commonpresentation.ui.theme.homeActionBarTextStyle

@Composable
fun AppActionBar(modifier: Modifier = Modifier) {
    Spacer(modifier = Modifier.height(22.dp))
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = "Travelulu",
            style = homeActionBarTextStyle
        )
        Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd) {
            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "Menu",
                    tint = blueButtonColor
                )
            }
        }
    }
    Spacer(modifier = Modifier.height(26.dp))
    HorizontalDivider(Modifier.fillMaxWidth(), thickness = 1.dp, color = dividerColor)
}