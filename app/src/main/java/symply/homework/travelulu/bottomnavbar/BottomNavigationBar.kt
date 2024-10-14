package symply.homework.travelulu.bottomnavbar

import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import symply.homework.travelulu.Screen
import symply.homework.travelulu.commonpresentation.ui.theme.buttonColor
import symply.homework.travelulu.commonpresentation.ui.theme.dividerColor


@Composable
fun BottomNavigationBar(
    modifier: Modifier = Modifier, navController: NavController, items: List<Screen>
) {
    val currentBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = currentBackStackEntry?.destination
    val isInSettingsScreen = currentDestination?.route == Screen.Settings.route
    if (!isInSettingsScreen) {
        BottomNavigation(
            modifier = modifier, contentColor = Color.White, backgroundColor = Color.White
        ) {
            items.forEach { screen ->
                val isSelected = currentDestination?.route == screen.route
                BottomNavigationItem(
                    selectedContentColor = buttonColor,
                    unselectedContentColor = dividerColor,
                    selected = isSelected,
                    onClick = {
                        navController.navigate(screen.route) {
                            popUpTo(navController.graph.startDestinationId) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    },
                    icon = {
                        AnimatedIcon(isSelected, screen.icon)
                    },
                    label = {
                        Text(text = screen.label, modifier = Modifier.padding(bottom = 16.dp))
                    },
                    alwaysShowLabel = true
                )
            }
        }
    }
}
