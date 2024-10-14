package symply.homework.travelulu.subpage.presentation.sections

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import symply.homework.travelulu.commonpresentation.ui.theme.dividerColor
import symply.homework.travelulu.commonpresentation.ui.theme.featureTitleTextStyle
import symply.homework.travelulu.subpage.presentation.item.DividerWithCircleImage
import symply.homework.travelulu.subpage.presentation.item.FoundedHotelCardItem

@Preview
@Composable
fun FoundedHotelsSectionPrev() {
    FoundedHotelsSection()
}

@Composable
fun FoundedHotelsSection() {
    FoundedHotelsSectionContent()
}

@Composable
private fun FoundedHotelsSectionContent() {
    Text(text = "254 Properties Found", style = featureTitleTextStyle)
    Spacer(modifier = Modifier.height(34.dp))

    FoundedHotelCardItem(hotelRating = 4.8)
    Spacer(modifier = Modifier.height(34.dp))

    HorizontalDivider(
        modifier = Modifier
            .height(1.dp)
            .padding(end = 31.dp),
        color = dividerColor,
        thickness = 1.dp
    )
    Spacer(modifier = Modifier.height(34.dp))

    FoundedHotelCardItem(hotelRating = 4.5)
    Spacer(modifier = Modifier.height(34.dp))
    HorizontalDivider(
        modifier = Modifier
            .height(1.dp)
            .padding(end = 31.dp),
        color = dividerColor,
        thickness = 1.dp
    )
    Spacer(modifier = Modifier.height(34.dp))

    FoundedHotelCardItem(hotelRating = 3.3)

    Spacer(modifier = Modifier.height(52.dp))

    DividerWithCircleImage(
        Modifier
            .padding(end = 31.dp)
            .fillMaxWidth())

}