package symply.homework.travelulu.home.presentation.buttons

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import symply.homework.travelulu.commonpresentation.ui.theme.blueButtonColor
import symply.homework.travelulu.commonpresentation.ui.theme.buttonTextStyle

@Preview
@Composable
private fun ButtonPrev() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(25.dp)
    ) {
        SolidButton(Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(26.dp))
        OutLineButton(Modifier.fillMaxWidth())
    }
}

@Composable
fun SolidButton(modifier: Modifier = Modifier ,text: String = "BEGIN PLANS", textColor: Color = Color.White, containerColor: Color = blueButtonColor) {
    Button(
        modifier = modifier,
        onClick = {},
        colors = ButtonDefaults.buttonColors(containerColor = containerColor)
    ) {
        Text(
            text = text,
            modifier = Modifier.padding(8.dp),
            style = buttonTextStyle,
            color = textColor
        )
    }

}

@Composable
fun OutLineButton(
    modifier: Modifier = Modifier,
    text: String = "REVIEW PLANS",
    textColor: Color = blueButtonColor,
    strokeColor: Color = blueButtonColor
) {
    OutlinedButton(
        modifier = modifier,
        onClick = { /*TODO*/ },
        border = BorderStroke(1.dp, strokeColor),
    ) {
        Text(
            modifier = Modifier.padding(8.dp),
            text = text,
            style = buttonTextStyle,
            color = textColor,
        )
    }

}