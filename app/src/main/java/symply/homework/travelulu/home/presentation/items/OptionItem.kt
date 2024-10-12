package symply.homework.travelulu.home.presentation.items

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import symply.homework.travelulu.commonpresentation.ui.theme.optionItemBackgroundColor
import symply.homework.travelulu.commonpresentation.ui.theme.optionItemStrokeColor
import symply.homework.travelulu.commonpresentation.ui.theme.optionItemTextStyle

private val optionDetails = "Lorem ipsum dolor sit\namet, consectetur ds."

@Preview
@Composable
private fun OptionItemPrev() {
    Column(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 31.dp)
    ) {
        repeat(6) { index ->
            OptionItem(
                index = index,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 40.dp)
            )
        }
    }
}

@Composable
fun OptionItem(modifier: Modifier = Modifier, index: Int) {
    val isEven = index % 2 == 0
    Row(modifier = modifier) {
        if (!isEven) {
            Spacer(modifier = Modifier.padding(start = 30.dp))
        }
        OptionItemArrow()
        Spacer(modifier = Modifier.padding(4.dp))

        Text(text = optionDetails, style = optionItemTextStyle, modifier = Modifier.fillMaxWidth())
    }
}

@Composable
private fun OptionItemArrow() {

    Box(
        modifier = Modifier
            .size(60.dp)
            .background(color = optionItemBackgroundColor, shape = CircleShape)
            .padding(8.dp)
            .background(color = optionItemStrokeColor, shape = CircleShape)
            .padding((1.5).dp)
            .background(color = Color.White, shape = CircleShape),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
            contentDescription = null,
            tint = optionItemStrokeColor
        )
    }
}