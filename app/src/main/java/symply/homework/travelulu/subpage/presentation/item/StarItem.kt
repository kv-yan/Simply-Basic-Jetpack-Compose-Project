package symply.homework.travelulu.subpage.presentation.item

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import symply.homework.travelulu.commonpresentation.ui.theme.dividerColor
import symply.homework.travelulu.commonpresentation.ui.theme.featureDetailsTextStyle
import symply.homework.travelulu.commonpresentation.ui.theme.redButtonColor
import symply.homework.travelulu.commonpresentation.ui.theme.statisticDetailsColor

@Composable
fun HotelStars(
    modifier: Modifier = Modifier,
    rating: Double = 4.5,
    maxRating: Int = 5,
) {
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = "$rating/$maxRating",
            style = featureDetailsTextStyle,
            fontSize = 12.sp,
            color = statisticDetailsColor,
            modifier = Modifier.padding(end = 4.dp)
        )

        for (i in 1..maxRating) {
            val currentStarRating = when {
                i <= rating -> 1f // Full star
                i - 1 < rating && i > rating -> (rating - (i - 1)).toFloat() // Fractional star (clip portion)
                else -> 0f // Empty star
            }

            Box(
                modifier = Modifier
                    .size(24.dp)
                    .clipStar(currentStarRating) // Clip the star based on the current portion
            ) {
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = null,
                    tint = if (currentStarRating > 0) redButtonColor else dividerColor,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}

// Extension function to clip the star based on the rating
fun Modifier.clipStar(fraction: Float): Modifier = this.then(
    Modifier.drawWithContent {
        if (fraction in 0f..1f) {
            val width = size.width * fraction
            clipRect(right = width) {
                this@drawWithContent.drawContent()
            }
        } else {
            drawContent() // Draw full or empty star
        }
    }
)
