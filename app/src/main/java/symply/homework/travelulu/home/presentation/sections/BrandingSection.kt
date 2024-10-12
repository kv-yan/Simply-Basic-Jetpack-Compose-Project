package symply.homework.travelulu.home.presentation.sections


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import symply.homework.travelulu.R
import symply.homework.travelulu.commonpresentation.ui.theme.titleTextStyle
import symply.homework.travelulu.home.presentation.buttons.OutLineButton
import symply.homework.travelulu.home.presentation.buttons.SolidButton

@Composable
fun BrandingSection(modifier: Modifier = Modifier) {
    Column(modifier) {
        Image(
            painter = painterResource(id = R.drawable.home_branding_image),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )

        Text(
            text = "Plan your\nnext big trip\noverseas.",
            modifier = Modifier
                .fillMaxWidth(),
            fontSize = 38.sp,
            style = titleTextStyle
        )

        Spacer(modifier = Modifier.height(26.dp))

        SolidButton(
            Modifier
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(26.dp))
        OutLineButton(
            Modifier
                .fillMaxWidth()
        )
    }
}