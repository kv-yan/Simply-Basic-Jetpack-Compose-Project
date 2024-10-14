package symply.homework.travelulu.subpage.presentation.sections

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.rounded.ThumbUp
import androidx.compose.material.icons.rounded.Warning
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp


@Composable
fun MessageSection(modifier: Modifier = Modifier) {
    val goodMessageBorderColor = Color(0xFF00BA88)
    val goodMessageContainerColor = Color(0xFFF2FFFB)
    val warningMessageBorderColor = Color(0xFFED2E7E)
    val warningMessageContainerColor = Color(0xFFFFF3F8)
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        InfoCard(
            icon = Icons.Rounded.ThumbUp,
            message = "Lock in a great price for your upcoming stay. Get instant confirmation with FREE cancellation on most rooms!",
            borderColor = goodMessageBorderColor,
            backgroundColor = goodMessageContainerColor,
        )

        InfoCard(
            icon = Icons.Rounded.Warning,
            message = "From 6 April 2022, your chosen cancellation policy will apply, regardless of Coronavirus. We recommend booking a free cancellation option in case your travel plans need to change.",
            borderColor = warningMessageBorderColor,
            backgroundColor = warningMessageContainerColor,
        )
    }

}

@Composable
fun InfoCard(
    icon: ImageVector,
    message: String,
    borderColor: Color,
    backgroundColor: Color,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = backgroundColor, shape = RoundedCornerShape(8.dp))
            .border(
                width = 2.dp,
                color = borderColor,
                shape = RoundedCornerShape(8.dp)
            )
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color.Black,
            modifier = with(Modifier) { size(24.dp) }
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = message,
            modifier = Modifier.weight(1f),
            color = borderColor
        )


        IconButton(onClick = {}) {
            Icon(
                imageVector = Icons.Default.Close,
                contentDescription = "Close",
                tint = Color.Black
            )
        }
    }
}

