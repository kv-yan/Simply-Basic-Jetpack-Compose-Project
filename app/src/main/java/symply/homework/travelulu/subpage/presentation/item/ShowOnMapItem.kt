package symply.homework.travelulu.subpage.presentation.item


import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import symply.homework.travelulu.commonpresentation.ui.theme.foundedHotelTitleTextStyle
import symply.homework.travelulu.commonpresentation.ui.theme.statisticIconColor

@Composable
fun ShowOnMapItem(modifier: Modifier = Modifier, location: String) {
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        Icon(
            imageVector = Icons.Default.LocationOn,
            contentDescription = null,
            tint = statisticIconColor
        )
        Spacer(modifier = Modifier.height(24.dp))
        Text(text = location, style = foundedHotelTitleTextStyle)
    }
}