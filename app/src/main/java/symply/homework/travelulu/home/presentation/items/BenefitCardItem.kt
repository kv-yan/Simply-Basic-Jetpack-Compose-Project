package symply.homework.travelulu.home.presentation.items

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import symply.homework.travelulu.commonpresentation.ui.theme.blueButtonColor
import symply.homework.travelulu.commonpresentation.ui.theme.dividerColor
import symply.homework.travelulu.commonpresentation.ui.theme.featureDetailsTextStyle
import symply.homework.travelulu.commonpresentation.ui.theme.featureTitleTextStyle
import symply.homework.travelulu.home.domain.model.BenefitUi
import symply.homework.travelulu.home.presentation.buttons.OutLineButton

private val featureDetailText = "orem ipsum dolor sit amet, consectetur adipiscing elit. "


@Composable
fun BenefitCardItem(modifier: Modifier = Modifier, benefitUi: BenefitUi) {
    Surface(
        modifier = modifier,
        color = Color.Transparent,
        shape = RoundedCornerShape(12.dp),
        border = BorderStroke(1.dp, dividerColor)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Spacer(modifier = Modifier.height(53.dp))
            Image(
                painter = benefitUi.icon,
                contentDescription = null,
                modifier = Modifier.size(300.dp, 180.dp)
            )

            Text(text = benefitUi.title, style = featureTitleTextStyle)

            Spacer(modifier = Modifier.height(7.dp))

            Text(
                text = featureDetailText,
                style = featureDetailsTextStyle,
                modifier = Modifier.padding(horizontal = 25.dp)
            )

            Spacer(modifier = Modifier.height(32.dp))

            OutLineButton(
                modifier = Modifier.fillMaxWidth(0.7f),
                text = "LEARN MORE",
                textColor = blueButtonColor,
                strokeColor = dividerColor
            )

            Spacer(modifier = Modifier.height(61.dp))
        }
    }
}
