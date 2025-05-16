package desktop.hambug.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import desktop.hambug.ui.home.MainScreen

@Composable
fun HambugNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = HambugScreens.MainScreen.name
    ) {
        composable(HambugScreens.MainScreen.name) {
            MainScreen(navController = navController)
        }
    }
}