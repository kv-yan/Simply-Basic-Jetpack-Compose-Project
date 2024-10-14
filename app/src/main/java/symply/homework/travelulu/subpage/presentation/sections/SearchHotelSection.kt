package symply.homework.travelulu.subpage.presentation.sections

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import symply.homework.travelulu.R
import symply.homework.travelulu.commonpresentation.ui.theme.dividerColor
import symply.homework.travelulu.commonpresentation.ui.theme.redButtonColor
import symply.homework.travelulu.commonpresentation.ui.theme.statisticNumberColor
import symply.homework.travelulu.commonpresentation.ui.theme.subtitleTextStyle
import symply.homework.travelulu.home.presentation.buttons.SolidButton
import symply.homework.travelulu.subpage.presentation.item.SearchFieldItem

@Preview
@Composable
private fun SearchHotelSectionPrev() {
    SearchHotelSection(
        Modifier
            .fillMaxWidth()
            .padding(31.dp)
    )
}

@Composable
fun SearchHotelSection(modifier: Modifier = Modifier) {
    SearchHotelSectionContent(modifier)
}

@Composable
private fun SearchHotelSectionContent(modifier: Modifier = Modifier) {
    Surface(modifier, color = statisticNumberColor, shape = RoundedCornerShape(14.dp)) {
        Column(
            Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(13.dp)
        ) {
            Text(text = "Search", style = subtitleTextStyle, fontSize = 24.sp)
            Spacer(modifier = Modifier.height(16.dp))

            SearchFieldItem(
                modifier = Modifier.fillMaxWidth(),
                label = "Destination/property name",
                searchText = "Gold Coast",
                isShowingTrailingIcon = true,
                isShowingLeadingIcon = true,
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        tint = Color.Black
                    )
                },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowDown,
                        contentDescription = null,
                        tint = dividerColor
                    )
                }
            )


            SearchFieldItem(
                modifier = Modifier.fillMaxWidth(),
                label = "Check-in date",
                searchText = "Check-in date",
                isShowingTrailingIcon = true,
                isShowingLeadingIcon = true,
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_callendar),
                        contentDescription = null,
                        tint = Color.Black
                    )
                },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowDown,
                        contentDescription = null,
                        tint = dividerColor
                    )
                }
            )


            SearchFieldItem(
                modifier = Modifier.fillMaxWidth(),
                label = "Check-out date",
                searchText = "Check-out date",
                isShowingTrailingIcon = true,
                isShowingLeadingIcon = true,
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_callendar),
                        contentDescription = null,
                        tint = Color.Black
                    )
                },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowDown,
                        contentDescription = null,
                        tint = dividerColor
                    )
                }
            )
            SearchFieldItem(
                modifier = Modifier.fillMaxWidth(),
                label = "Travellers",
                searchText = "2 adults - 0 childern",
                isShowingTrailingIcon = false,
                isShowingLeadingIcon = true,
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        tint = Color.Black
                    )
                },
                trailingIcon = {}
            )
            Spacer(modifier = Modifier.height(16.dp))
            SolidButton(
                modifier = Modifier.fillMaxWidth(),
                text = "Search",
                containerColor = redButtonColor
            )
            Spacer(modifier = Modifier.height(21.dp))
        }
    }
}

