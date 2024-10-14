package symply.homework.travelulu.home.presentation.sections

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import symply.homework.travelulu.R
import symply.homework.travelulu.commonpresentation.ui.theme.actionBarTitleTextStyle
import symply.homework.travelulu.commonpresentation.ui.theme.contactTitleTextStyle
import symply.homework.travelulu.commonpresentation.ui.theme.titleTextStyle
import symply.homework.travelulu.commonpresentation.ui.theme.toolDetailsTextStyle
import symply.homework.travelulu.commonpresentation.ui.theme.userFeedbackVisitedTextStyle
import symply.homework.travelulu.home.presentation.buttons.OutLineButton

private const val contactUsBannerText =
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac ullamcorper magna, ac laoreet ex. Integer a consequat lectus. Nullam tortor sem\n" + "\nCopyright 2021, All Rights Reserved."
private const val locationText =
    "22 Street Address,, Suburb Address\nMain City, PO Box, Country\n\n08 8888 88888"

@Preview
@Composable
private fun InformationSectionPrev() {
    val scrollState = rememberScrollState()
    InformationSection(
        Modifier
            .fillMaxWidth()
            .verticalScroll(scrollState)
    )
}

@Composable
fun InformationSection(modifier: Modifier = Modifier) {
    Column(
        modifier.heightIn(min = 0.dp, max = 10000.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ContactUsBanner(modifier)

        Spacer(modifier = Modifier.height(54.dp))

        ContactInfo()
    }
}

@Composable
private fun ContactUsBanner(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier.padding(16.dp), shape = RoundedCornerShape(25.dp)
    ) {
        Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            Image(
                painter = painterResource(id = R.drawable.information_banner_bg),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )

            Column(Modifier.fillMaxWidth()) {
                Text(
                    text = "Need more information to get started?",
                    style = titleTextStyle,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    fontSize = 48.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(23.dp)
                )

                OutLineButton(
                    text = "CONTACT US",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 30.dp),
                    strokeColor = Color.White,
                    textColor = Color.White
                )
            }
        }
    }
}

@Composable
fun ContactInfo() {
    Text(text = "Travelulu", style = actionBarTitleTextStyle)

    Spacer(modifier = Modifier.height(24.dp))

    Text(
        text = contactUsBannerText,
        style = toolDetailsTextStyle,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .padding(horizontal = 12.dp)
            .fillMaxWidth()
    )

    Spacer(modifier = Modifier.height(70.dp))
    Text(text = "Contact", style = contactTitleTextStyle)

    Spacer(modifier = Modifier.height(23.dp))
    Text(text = "travelulu@website.com", style = userFeedbackVisitedTextStyle)

    Spacer(modifier = Modifier.height(24.dp))
    Text(
        text = locationText,
        style = toolDetailsTextStyle,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .padding(horizontal = 12.dp)
            .fillMaxWidth()
    )

    Spacer(modifier = Modifier.height(37.dp))
}