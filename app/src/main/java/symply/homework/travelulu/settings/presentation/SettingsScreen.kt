package symply.homework.travelulu.settings.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import symply.homework.travelulu.commonpresentation.ui.theme.dividerColor
import symply.homework.travelulu.commonpresentation.ui.theme.settingItemClosedColor
import symply.homework.travelulu.settings.domain.model.SettingUi
import symply.homework.travelulu.settings.presentation.actionbar.SettingsActionBar
import symply.homework.travelulu.settings.presentation.items.SettingItem

@Composable
fun SettingsScreen(modifier: Modifier = Modifier, onBackClick: () -> Unit) {
    val settingUiList = listOf(
        SettingUi("Home", emptyList()),
        SettingUi(
            "Services",
            mutableListOf("Planning", "Financing", "Purchasing", "Reviewing", "Flying")
        ),
        SettingUi(
            "Continents",
            mutableListOf("Planning", "Financing", "Purchasing", "Reviewing", "Flying")
        ),
        SettingUi("Contact", emptyList()),
        SettingUi("Privacy", emptyList()),
    )

    LazyColumn(
        Modifier
            .background(settingItemClosedColor)
            .fillMaxSize()
    ) {
        item {
            Spacer(modifier = Modifier.height(22.dp))
            SettingsActionBar(
                onBackClick = onBackClick,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp)
            )
            Spacer(modifier = Modifier.height(26.dp))
            HorizontalDivider(Modifier.fillMaxWidth(), thickness = 1.dp, color = dividerColor)
        }
        items(settingUiList) {
            SettingItem(settingUi = it, modifier = Modifier.fillMaxWidth())
        }
    }
}


@Preview
@Composable
private fun SettingsScreenPrev() {
    SettingsScreen(Modifier.fillMaxSize()) {}
}