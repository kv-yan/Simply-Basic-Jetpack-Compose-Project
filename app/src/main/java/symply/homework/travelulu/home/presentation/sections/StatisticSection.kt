package symply.homework.travelulu.home.presentation.sections

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import symply.homework.travelulu.R
import symply.homework.travelulu.commonpresentation.ui.theme.dividerColor
import symply.homework.travelulu.commonpresentation.ui.theme.statisticDescriptionTextStyle
import symply.homework.travelulu.commonpresentation.ui.theme.statisticIconColor
import symply.homework.travelulu.commonpresentation.ui.theme.statisticNumberTextStyle
import symply.homework.travelulu.home.domain.model.StatisticUi

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

@Composable
fun StatisticItem(modifier: Modifier = Modifier, statisticUi: StatisticUi) {
    Row(
        modifier = modifier, verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = statisticUi.icon,
            contentDescription = null,
            tint = statisticIconColor,
            modifier = Modifier.size(35.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(text = statisticUi.number, style = statisticNumberTextStyle)
            Text(text = statisticUi.description, style = statisticDescriptionTextStyle)
        }
    }
    HorizontalDivider(modifier = Modifier.fillMaxWidth(), thickness = 1.dp, color = dividerColor)
}