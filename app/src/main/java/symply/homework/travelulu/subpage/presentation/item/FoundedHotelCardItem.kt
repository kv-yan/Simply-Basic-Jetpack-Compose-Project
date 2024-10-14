package symply.homework.travelulu.subpage.presentation.item

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import symply.homework.travelulu.R
import symply.homework.travelulu.commonpresentation.ui.theme.blueButtonColor
import symply.homework.travelulu.commonpresentation.ui.theme.dividerColor
import symply.homework.travelulu.commonpresentation.ui.theme.foundedHotelTitleTextStyle
import symply.homework.travelulu.commonpresentation.ui.theme.toolDetailsTextStyle
import symply.homework.travelulu.home.presentation.buttons.OutLineButton

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun FoundedHotelCardItem(hotelRating: Double = 5.0) {
    val imageList = listOf<Int>(
        R.drawable.founded_hotel_image,
        R.drawable.founded_hotel_image,
        R.drawable.founded_hotel_image,
    )
    val pagerState = rememberPagerState(initialPage = 0, pageCount = { imageList.size })

    HorizontalPager(
        state = pagerState,
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(end = 40.dp)
    ) {
        Surface(shape = RoundedCornerShape(16.dp), modifier = Modifier.size(272.dp, 204.dp)) {
            Image(
                painter = painterResource(id = imageList[it]),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds
            )
        }
    }
    Spacer(modifier = Modifier.height(31.dp))
    HotelStars(Modifier.fillMaxWidth(), rating = hotelRating, maxRating = 5)

    Spacer(modifier = Modifier.height(24.dp))
    Text(
        text = "Estate de la Newcastle",
        style = foundedHotelTitleTextStyle
    )

    Spacer(modifier = Modifier.height(8.dp))
    Text(
        text = "Newcastle City Centre, Newcastle upon Tyne 0.1km from centre",
        style = toolDetailsTextStyle
    )
    Spacer(modifier = Modifier.height(8.dp))

    ShowOnMapItem(location = "Show on map")
    Spacer(modifier = Modifier.height(8.dp))


    Text(
        text = "Show on map Situated in Newcastle City Centre, Maldron Hotel features free WiFi and a private court yard.",
        style = toolDetailsTextStyle
    )
    Spacer(modifier = Modifier.height(24.dp))

    OutLineButton(text = "Make a booking", textColor = blueButtonColor, strokeColor = dividerColor)
}
