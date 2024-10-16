package symply.homework.travelulu.home.presentation.screen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import symply.homework.travelulu.home.presentation.actionbar.AppActionBar
import symply.homework.travelulu.home.presentation.sections.BenefitSection
import symply.homework.travelulu.home.presentation.sections.BrandingSection
import symply.homework.travelulu.home.presentation.sections.InformationSection
import symply.homework.travelulu.home.presentation.sections.ListOfOptionsSection
import symply.homework.travelulu.home.presentation.sections.StatisticSection
import symply.homework.travelulu.home.presentation.sections.TravelPlanSection
import symply.homework.travelulu.home.presentation.sections.UserFeedbackSection

@Preview(showSystemUi = true)
@Composable
private fun HomePrev() {
    HomeScreen(Modifier.fillMaxSize())
}

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    ScreenContent(modifier = modifier)
}

@Composable
private fun ScreenContent(modifier: Modifier = Modifier) {
    LazyColumn(modifier) {
        item {
            AppActionBar(
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 31.dp)
            )
        }

        item {
            BrandingSection(
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 40.dp)
            )
            Spacer(modifier = Modifier.height(87.dp))
        }
        item {
            StatisticSection(
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 30.dp)
            )
            Spacer(modifier = Modifier.height(44.dp))
        }

        item {
            BenefitSection(
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 31.dp)
            )
            Spacer(modifier = Modifier.height(53.dp))
        }

        item {
            TravelPlanSection(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 31.dp, end = 0.dp)
            )
            Spacer(modifier = Modifier.height(69.dp))
        }

        item {
            ListOfOptionsSection(
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 31.dp)
            )
            Spacer(modifier = Modifier.height(61.dp))
        }

        item {
            UserFeedbackSection(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 31.dp, end = 0.dp)

            )
            Spacer(modifier = Modifier.height(54.dp))
        }

        item {
            InformationSection(
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 31.dp)
            )
        }
    }
}



