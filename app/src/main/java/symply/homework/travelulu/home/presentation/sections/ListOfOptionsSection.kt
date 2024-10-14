package symply.homework.travelulu.home.presentation.sections

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import symply.homework.travelulu.R
import symply.homework.travelulu.home.presentation.items.OptionItem
import symply.homework.travelulu.home.presentation.items.ToolSectionItem

@Composable
fun ListOfOptionsSection(modifier: Modifier) {
    ToolSectionItem(
        modifier = modifier,
        title = "Use our assortment of travel plan tools"
    ) {
        LazyColumn(Modifier.heightIn(0.dp, 1500.dp)) {
            item {
                Image(
                    painter = painterResource(id = R.drawable.options_image),
                    contentDescription = null,
                    contentScale = ContentScale.FillHeight,
                    modifier = Modifier
                        .fillMaxWidth().heightIn(min = 250.dp)
                        .padding(horizontal = 31.dp)
                )
                Spacer(modifier = Modifier.height(70.dp))
            }

            item {
                Column(
                    Modifier.fillMaxWidth()
                ) {
                    repeat(6) {
                        OptionItem(
                            Modifier
                                .fillMaxWidth()
                                .padding(bottom = if (it == 5) 0.dp else 40.dp), it
                        )
                    }
                }
            }
        }
    }
}