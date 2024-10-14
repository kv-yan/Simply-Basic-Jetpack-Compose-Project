package symply.homework.travelulu.home.presentation.items


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import symply.homework.travelulu.commonpresentation.ui.theme.dividerColor
import symply.homework.travelulu.commonpresentation.ui.theme.statisticDescriptionTextStyle
import symply.homework.travelulu.commonpresentation.ui.theme.statisticIconColor
import symply.homework.travelulu.commonpresentation.ui.theme.statisticNumberTextStyle
import symply.homework.travelulu.home.domain.model.StatisticUi


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
            Spacer(modifier = Modifier.height(15.dp))
            Text(
                text = statisticUi.description,
                style = statisticDescriptionTextStyle,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 20.dp)
            )
        }
    }
    HorizontalDivider(modifier = Modifier.fillMaxWidth(), thickness = 1.dp, color = dividerColor)
}