package symply.homework.travelulu.home.presentation.sections

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import symply.homework.travelulu.R
import symply.homework.travelulu.commonpresentation.ui.theme.dividerColor
import symply.homework.travelulu.home.domain.model.StatisticUi
import symply.homework.travelulu.home.presentation.items.StatisticItem

@Composable
fun StatisticSection(modifier: Modifier = Modifier) {
    val statisticsList = listOf(
        StatisticUi(
            icon = painterResource(id = R.drawable.ic_plain),
            number = "23,973",
            description = "Travel to over 23 thousand locations around the world."
        ), StatisticUi(
            icon = painterResource(id = R.drawable.ic_globe),
            number = "82,000",
            description = "Read tens of thousands of reviews of destinations."
        ), StatisticUi(
            icon = painterResource(id = R.drawable.ic_bike),
            number = "4,000,000",
            description = "Visited by millions of travelers every single day."
        )
    )
    LazyColumn(
        modifier
            .border(1.dp, dividerColor)
            .heightIn(min = 0.dp, max = 700.dp)
    ) {
        items(statisticsList.size) {
            StatisticItem(
                statisticUi = statisticsList[it],
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 25.dp, top = 35.dp, bottom = 34.dp)
            )
        }
    }
}

