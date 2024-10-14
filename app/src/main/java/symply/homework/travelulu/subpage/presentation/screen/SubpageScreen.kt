package symply.homework.travelulu.subpage.presentation.screen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import symply.homework.travelulu.commonpresentation.ui.theme.dividerColor
import symply.homework.travelulu.commonpresentation.ui.theme.findTitleTextStyle
import symply.homework.travelulu.home.presentation.actionbar.AppActionBar
import symply.homework.travelulu.home.presentation.sections.InformationSection
import symply.homework.travelulu.subpage.presentation.sections.FindHotelsSection
import symply.homework.travelulu.subpage.presentation.sections.FoundedHotelsSection
import symply.homework.travelulu.subpage.presentation.sections.MessageSection
import symply.homework.travelulu.subpage.presentation.sections.SearchHotelSection

@Preview
@Composable
private fun SubpageScreenPrev() {
    SubpageScreen(
        Modifier
            .fillMaxSize()
            .padding(start = 24.dp)
    )
}

@Composable
fun SubpageScreen(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(start = 24.dp)
    ) {
        item {
            AppActionBar(
                modifier
                    .fillMaxWidth()
                    .padding(end = 24.dp)
            )
        }

        item {
            Spacer(modifier = Modifier.height(22.dp))
            SubpageScreenContent(Modifier.fillMaxWidth())
        }
    }
}

@Composable
private fun SubpageScreenContent(modifier: Modifier = Modifier) {
    Text(
        text = "Find deals on hotels, homes and much more...",
        style = findTitleTextStyle,
        modifier = modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp)
    )

    FindHotelsSection(
        modifier
            .fillMaxWidth()
            .padding(end = 24.dp)
    )

    HorizontalDivider(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 53.dp, bottom = 43.dp, end = 24.dp),
        thickness = 1.dp,
        color = dividerColor
    )

    SearchHotelSection(
        Modifier
            .fillMaxWidth()
            .padding(end = 24.dp)
    )
    Spacer(modifier = Modifier.height(48.dp))

    FoundedHotelsSection()

    Spacer(modifier = Modifier.height(43.dp))

    MessageSection(
        modifier
            .fillMaxWidth()
            .padding(end = 24.dp)
    )

    Spacer(modifier = Modifier.height(34.dp))

    InformationSection(
        Modifier
            .fillMaxWidth()
            .padding(end = 24.dp)
    )

}
