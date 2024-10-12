package symply.homework.travelulu.home.presentation.items

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import symply.homework.travelulu.R

@Preview
@Composable
private fun TestPrev() {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(40.dp)) {
        BorderedBoxWithImage()
    }
}

@Composable
fun BorderedBoxWithImage() {


    Box(
        modifier = Modifier
            .size(200.dp) // Size of the box
            .border(2.dp, Color.Gray, RoundedCornerShape(10.dp)) // Box with border
            .padding(top = 40.dp), // Padding to give space for the image
        contentAlignment = Alignment.Center // Center content inside the box
    ) {
        // Background or content inside the box can go here

        Text("Box Content", fontSize = 16.sp) // Example content
    }
    Image(
        painter = painterResource(id = R.drawable.benefit_flights), // Replace with your image
        contentDescription = "Top Image",
        modifier = Modifier.fillMaxWidth()
            .size(80.dp) // Size of the image
            .offset(y = (-240).dp) // Offset the image to overlap the box border
    )

    // Image at the top center of the border, overlapping slightly
}
