package symply.homework.travelulu.bottomnavbar

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import symply.homework.travelulu.commonpresentation.ui.theme.buttonColor
import symply.homework.travelulu.commonpresentation.ui.theme.dividerColor

@Composable
fun AnimatedIcon(isSelected: Boolean, icon: ImageVector) {
    AnimatedVisibility(visible = isSelected) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.size(30.dp),
            tint = if (isSelected) buttonColor else dividerColor
        )
    }
    if (!isSelected) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.size(24.dp),
            tint = if (isSelected) buttonColor else dividerColor

        )
    }
}

