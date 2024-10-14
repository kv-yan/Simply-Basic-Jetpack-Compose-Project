package symply.homework.travelulu.home.presentation.sections

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import symply.homework.travelulu.R
import symply.homework.travelulu.commonpresentation.ui.theme.dividerColor
import symply.homework.travelulu.commonpresentation.ui.theme.userFeedbackImageBackgroundColor
import symply.homework.travelulu.commonpresentation.ui.theme.userFeedbackTextStyle
import symply.homework.travelulu.commonpresentation.ui.theme.userFeedbackTitleTextStyle
import symply.homework.travelulu.commonpresentation.ui.theme.userFeedbackVisitedTextStyle
import symply.homework.travelulu.home.presentation.items.ToolSectionItem

private val userFeedbackText =
    "“Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque pulvinar lorem justo, id faucibus mi.”"

@Preview(showSystemUi = true)
@Composable
private fun FeedbackPrev() {
    UserFeedbackSection()
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun UserFeedbackSection(modifier: Modifier = Modifier) {
    val pagerState = rememberPagerState(initialPage = 0, pageCount = { 3 })
    ToolSectionItem(modifier = modifier, title = "Use our assortment of travel plan tools") {
        HorizontalPager(state = pagerState, contentPadding = PaddingValues(16.dp)) {
            UserFeedbackItem()
        }
    }
}

@Composable
fun UserFeedbackItem(modifier: Modifier = Modifier) {
    Box(modifier = modifier.padding(top = 54.dp, end = 16.dp)) {
        Surface(
            modifier = Modifier.size(369.dp, 359.dp),
            shape = RoundedCornerShape(12.dp),
            border = BorderStroke(1.dp, color = dividerColor)
        ) {

            Column(
                modifier = Modifier.padding(vertical = 31.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(45.dp))
                Text(text = "Joe Blo", style = userFeedbackTitleTextStyle)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Visited: France", style = userFeedbackVisitedTextStyle)
                Spacer(modifier = Modifier.height(22.dp))
                HorizontalDivider(
                    Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 49.dp),
                    thickness = 1.dp,
                    color = dividerColor
                )

                Spacer(modifier = Modifier.height(21.dp))

                Text(
                    text = userFeedbackText,
                    style = userFeedbackTextStyle,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 49.dp)
                )
            }

        }
        Column(
            Modifier
                .fillMaxWidth()
                .offset(y = (-45).dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.user_feedback_image),
                contentDescription = null,
                modifier = Modifier
                    .size(95.dp)
                    .background(color = userFeedbackImageBackgroundColor, shape = CircleShape)
            )
        }
    }
}