package symply.homework.travelulu.subpage.presentation.item


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import symply.homework.travelulu.commonpresentation.ui.theme.blueButtonColor
import symply.homework.travelulu.commonpresentation.ui.theme.dividerColor


@Composable
fun DividerWithCircleImage(modifier: Modifier) {
    Row(
        modifier = modifier, verticalAlignment = Alignment.CenterVertically
    ) {
        HorizontalDivider(
            modifier = Modifier
                .weight(1f)
                .padding(end = 45.dp),
            color = dividerColor,
            thickness = 1.dp
        )

        Box(
            modifier = Modifier
                .size(40.dp)
                .border(
                    BorderStroke(1.dp, blueButtonColor), shape = CircleShape
                ), contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Rounded.KeyboardArrowDown,
                contentDescription = "Dropdown",
                tint = Color(0xFF6200EA),
                modifier = Modifier.size(24.dp)
            )
        }

        HorizontalDivider(
            modifier = Modifier
                .weight(1f)
                .padding(start = 45.dp),
            color = dividerColor,
            thickness = 1.dp
        )
    }
}
