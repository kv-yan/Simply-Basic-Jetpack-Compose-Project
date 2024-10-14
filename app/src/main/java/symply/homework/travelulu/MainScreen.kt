package symply.homework.travelulu

import android.app.Activity
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import symply.homework.travelulu.bottomnavbar.BottomNavigationBar
import symply.homework.travelulu.commonpresentation.ui.theme.settingItemClosedColor
import symply.homework.travelulu.home.presentation.screen.HomeScreen
import symply.homework.travelulu.settings.presentation.SettingsScreen
import symply.homework.travelulu.subpage.presentation.screen.SubpageScreen

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    val items = listOf(Screen.Home, Screen.Subpage, Screen.Settings)

    val currentBackStackEntry by navController.currentBackStackEntryAsState()
    val isInSettingScreen = currentBackStackEntry?.destination?.route == Screen.Settings.route

    SetSystemBarsColor(
        isInSettingScreen = isInSettingScreen,
        navigationBarColor = MaterialTheme.colorScheme.background,
        settingScreenColor = settingItemClosedColor,
        defaultScreenColor = MaterialTheme.colorScheme.background
    )


    Scaffold(containerColor = if (!isInSettingScreen) MaterialTheme.colorScheme.background else settingItemClosedColor,
        bottomBar = {
            BottomNavigationBar(
                navController = navController, items = items
            )
        }) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Subpage.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Home.route) { HomeScreen() }
            composable(Screen.Settings.route) {
                SettingsScreen {
                    navController.popBackStack()
                }
            }
            composable(Screen.Subpage.route) {
                SubpageScreen()
            }
        }
    }
}

@Composable
fun SetSystemBarsColor(
    isInSettingScreen: Boolean,
    navigationBarColor: Color,
    settingScreenColor: Color,
    defaultScreenColor: Color
) {
    val view = LocalView.current
    val activity = LocalContext.current as Activity

    if (!view.isInEditMode) {
        val window = activity.window
        val insetsController = WindowCompat.getInsetsController(window, view)

        // Set navigation bar color
        window.navigationBarColor =
            if (isInSettingScreen) settingScreenColor.toArgb() else navigationBarColor.toArgb()
        insetsController.isAppearanceLightNavigationBars =
            isInSettingScreen // True if black icons are required

        // Set status bar color
        window.statusBarColor =
            if (isInSettingScreen) settingScreenColor.toArgb() else defaultScreenColor.toArgb()
        insetsController.isAppearanceLightStatusBars = !isInSettingScreen
    }
}