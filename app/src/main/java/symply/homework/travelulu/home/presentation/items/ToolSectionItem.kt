package symply.homework.travelulu.home.presentation.items

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import symply.homework.travelulu.commonpresentation.ui.theme.subtitleTextStyle
import symply.homework.travelulu.commonpresentation.ui.theme.toolDetailsTextStyle
import symply.homework.travelulu.commonpresentation.ui.theme.toolTitleTextStyle

private val detailsText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque pulvinar lorem justo, Lorem ipsum dolor sit amet, consectetur "


@Composable
fun ToolSectionItem(
    modifier: Modifier = Modifier,
    title: String,
    featuresContent: @Composable () -> Unit
) {
    Column(modifier) {
        Text(text = "Tool list", style = subtitleTextStyle)
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = title,
            style = toolTitleTextStyle,
            modifier = Modifier.padding(bottom = 24.dp, end = 25.dp)
        )
        Text(
            text = detailsText,
            style = toolDetailsTextStyle,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        featuresContent()
    }
}


