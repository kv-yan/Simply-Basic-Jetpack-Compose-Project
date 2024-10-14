package symply.homework.travelulu.subpage.presentation.item

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import symply.homework.travelulu.commonpresentation.ui.theme.searchFieldLabelTextStyle
import symply.homework.travelulu.subpage.presentation.sections.AppOutlinedTextField


@Composable
fun SearchFieldItem(
    modifier: Modifier = Modifier,
    label: String,
    searchText: String,
    isShowingTrailingIcon: Boolean,
    isShowingLeadingIcon: Boolean,
    leadingIcon: @Composable () -> Unit = {},
    trailingIcon: @Composable () -> Unit = {},
) {
    Text(text = label, style = searchFieldLabelTextStyle)
    AppOutlinedTextField(
        title = searchText,
        modifier = modifier,
        textColor = Color.Black,
        borderColor = Color.Transparent,
        containerColor = Color.White,
        isShowingTrailingIcon = isShowingTrailingIcon,
        isShowingLeadingIcon = isShowingLeadingIcon,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon
    )
}