package symply.homework.travelulu.home.presentation.sections

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import symply.homework.travelulu.R
import symply.homework.travelulu.home.presentation.items.ToolSectionItem


@Preview
@Composable
private fun TravelPlanSectionPreview() {
    TravelPlanSection(Modifier.fillMaxSize())
}

@Composable
fun TravelPlanSection(modifier: Modifier = Modifier) {
    ToolSectionItem(title = "Use our assortment of travel plan tools", modifier = modifier) {
        ImageHorizontalPager()
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ImageHorizontalPager(modifier: Modifier = Modifier) {
    val imageList = listOf<Int>(
        R.drawable.travel_plan_1,
        R.drawable.travel_plan_2,
    )
    val pagerState = rememberPagerState(initialPage = 0, pageCount = { imageList.size })

    HorizontalPager(
        state = pagerState,
        modifier = modifier,
        contentPadding = PaddingValues(start = 0.dp, end = 24.dp)
    ) {
        Surface(shape = RoundedCornerShape(16.dp), modifier = Modifier.size(303.dp, 324.dp)) {
            Image(
                painter = painterResource(id = imageList[it]),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds
            )
        }
    }
}