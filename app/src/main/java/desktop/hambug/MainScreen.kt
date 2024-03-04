package desktop.hambug

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import desktop.hambug.ui.main.MainBurgerScreen
import desktop.hambug.ui.main.MainCommunityScreen
import desktop.hambug.ui.main.MainHomeScreen
import desktop.hambug.ui.main.MainMapScreen
import desktop.hambug.ui.main.MainMyScreen
import desktop.hambug.utils.NavigationUtils

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen() {

    val snackbarHostState = remember { SnackbarHostState() }
    val navController = rememberNavController()

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        bottomBar = {
            MainBottomBar(navController, currentRoute)
        }
    ) {
        MainNavScreen(navController)
    }
}

@Composable
fun MainBottomBar(navController: NavHostController, currentRoute: String?) {
    val bottomNavigationItems = listOf(
        MainNav.Home,
        MainNav.Map,
        MainNav.Burger,
        MainNav.Community,
        MainNav.My,
    )

    NavigationBar(

    ) {
        bottomNavigationItems.forEach { item ->
            NavigationBarItem(
                selected = currentRoute == item.route,
                onClick = {
                    NavigationUtils.navigate(
                        navController, item.route,
                        navController.graph.startDestinationRoute
                    )
                },
                icon = { /*TODO*/ })
        }
    }
}

@Composable
fun MainNavScreen(navController: NavHostController) {
    NavHost(navController = navController, startDestination = MainNav.Home.route) {
        composable(
            route = MainNav.Home.route
        ) {
            MainHomeScreen(navController)
        }
        composable(
            route = MainNav.Map.route
        ) {
            MainMapScreen()
        }
        composable(
            route = MainNav.Burger.route
        ) {
            MainBurgerScreen(navController)
        }
        composable(
            route = MainNav.Community.route
        ) {
            MainCommunityScreen()
        }
        composable(
            route = MainNav.My.route
        ) {
            MainMyScreen()
        }
    }
}