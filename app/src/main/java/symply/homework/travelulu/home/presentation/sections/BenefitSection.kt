package symply.homework.travelulu.home.presentation.sections

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import symply.homework.travelulu.R
import symply.homework.travelulu.home.domain.model.BenefitUi
import symply.homework.travelulu.home.presentation.itemlist.BenefitsCardList

@Composable
fun BenefitSection(modifier: Modifier = Modifier) {

    val benefitUiList = listOf(
        BenefitUi(icon = painterResource(id = R.drawable.benefit_time), title = "Plan Trip Dates"),
        BenefitUi(icon = painterResource(id = R.drawable.benefit_flights), title = "Pay For Your Flights"),
        BenefitUi(icon = painterResource(id = R.drawable.benefit_finance), title = "Plan Your Finances")
    )

    BenefitsCardList(modifier = modifier, benefitUiList = benefitUiList)
}