package symply.homework.travelulu.home.presentation.itemlist

import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import symply.homework.travelulu.home.domain.model.BenefitUi
import symply.homework.travelulu.home.presentation.items.BenefitCardItem
import symply.homework.travelulu.home.presentation.items.ToolSectionItem

@Composable
fun BenefitsCardList(modifier: Modifier = Modifier, benefitUiList: List<BenefitUi>) {
    ToolSectionItem(
        modifier = modifier,
        title = "Use our assortment of travel plan tools"
    ) {
        LazyColumn(Modifier.heightIn(0.dp, 4500.dp)) {
            items(benefitUiList) {
                BenefitCardItem(benefitUi = it, modifier = Modifier.padding(bottom = 36.dp))
            }
        }
    }
}