package symply.homework.travelulu

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import symply.homework.travelulu.bottomnavbar.BottomNavigationBar
import symply.homework.travelulu.commonpresentation.ui.theme.settingItemClosedColor
import symply.homework.travelulu.home.presentation.screen.HomeScreen
import symply.homework.travelulu.settings.presentation.SettingsScreen

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    val items = listOf(Screen.Home, Screen.Settings)

    val currentBackStackEntry by navController.currentBackStackEntryAsState()
    val isInSettingScreen = currentBackStackEntry?.destination?.route == Screen.Settings.route



    Scaffold(containerColor = if (!isInSettingScreen) MaterialTheme.colorScheme.background else settingItemClosedColor,
        bottomBar = {
            BottomNavigationBar(
                navController = navController,
                items = items
            )
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Home.route) { HomeScreen() }
            composable(Screen.Settings.route) {
                SettingsScreen {
                    navController.popBackStack()
                }
            }
        }
    }
}
