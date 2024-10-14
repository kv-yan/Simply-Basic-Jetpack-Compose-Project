package symply.homework.travelulu.subpage.presentation.sections

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import symply.homework.travelulu.commonpresentation.ui.theme.redButtonColor
import symply.homework.travelulu.home.presentation.buttons.SolidButton

@Composable
fun FindHotelsSection(modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.spacedBy(16.dp), modifier = modifier) {
        AppOutlinedTextField(modifier = Modifier.fillMaxWidth(),
            title = "Where are you going?",
            isShowingTrailingIcon = true,
            trailingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                        contentDescription = null
                    )
                }
            })


        AppOutlinedTextField(modifier = Modifier.fillMaxWidth(),
            title = "Check-in - Check-out",
            isShowingTrailingIcon = true,
            trailingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                        contentDescription = null
                    )
                }
            })

        AppOutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            title = "2 adults - 0 children",
            isShowingTrailingIcon = true,
            trailingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                        contentDescription = null
                    )
                }
            })

        SolidButton(modifier = Modifier.fillMaxWidth(), text = "Search", containerColor = redButtonColor)
    }
}

@Composable
fun AppOutlinedTextField(
    modifier: Modifier = Modifier,
    title: String,
    textColor: Color = Color.Black,
    isShowingLeadingIcon: Boolean = false,
    isShowingTrailingIcon: Boolean = false,
    borderColor: Color = Color.Black,
    containerColor: Color = Color.Transparent,
    trailingIcon: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
) {
    var textFieldValue by remember { mutableStateOf(TextFieldValue(title)) }
    OutlinedTextField(
        modifier = modifier,
        value = textFieldValue,
        onValueChange = { textFieldValue = it },
        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = containerColor, unfocusedContainerColor = containerColor,
            focusedTextColor = textColor, unfocusedTextColor = textColor,
            focusedBorderColor = borderColor, unfocusedBorderColor = borderColor,
        ),
        shape = RoundedCornerShape(14.dp),
        singleLine = true,
        leadingIcon = if (isShowingLeadingIcon) leadingIcon else null,
        trailingIcon = if (isShowingTrailingIcon) trailingIcon else null,
    )
}