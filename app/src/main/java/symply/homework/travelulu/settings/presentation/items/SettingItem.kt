package symply.homework.travelulu.settings.presentation.items

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import symply.homework.travelulu.commonpresentation.ui.theme.settingItemClosedColor
import symply.homework.travelulu.commonpresentation.ui.theme.settingItemOpenedColor
import symply.homework.travelulu.commonpresentation.ui.theme.settingItemSubTitleTextStyle
import symply.homework.travelulu.commonpresentation.ui.theme.settingItemTitleTextStyle
import symply.homework.travelulu.commonpresentation.ui.theme.settingTitleColor
import symply.homework.travelulu.settings.domain.model.SettingUi


@Composable
fun SettingItem(modifier: Modifier = Modifier, settingUi: SettingUi) {
    val (title, subTitles) = settingUi
    val hasSubTitles = subTitles.isNotEmpty()
    var expanded by rememberSaveable { mutableStateOf(false) }



    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(if (expanded) settingItemOpenedColor else settingItemClosedColor)
    ) {
        Row(modifier = Modifier.height(90.dp), verticalAlignment = Alignment.CenterVertically) {
            Box(modifier = Modifier.width(90.dp), contentAlignment = Alignment.CenterEnd) {

                if (hasSubTitles) {
                    IconButton(onClick = { expanded = !expanded }) {
                        Icon(
                            imageVector = if (expanded)  Icons.Default.KeyboardArrowDown else Icons.AutoMirrored.Filled.KeyboardArrowRight,
                            contentDescription = null,
                            tint = settingTitleColor
                        )
                    }
                }

            }
            Text(text = title, style = settingItemTitleTextStyle)
        }

        if (hasSubTitles) {
            AnimatedVisibility(visible = expanded) {
                Column {

                    subTitles.forEach {
                        Row(
                            modifier = Modifier.height(90.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Spacer(modifier = Modifier.width(90.dp))
                            Text(
                                text = it,
                                modifier = Modifier.height(70.dp),
                                style = settingItemSubTitleTextStyle
                            )

                        }
                    }
                }
            }
        }
    }
}
