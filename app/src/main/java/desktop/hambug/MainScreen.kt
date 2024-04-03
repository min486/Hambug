package desktop.hambug

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import desktop.hambug.ui.IconPack
import desktop.hambug.ui.iconpack.Bell
import desktop.hambug.ui.iconpack.Menu
import desktop.hambug.ui.main.MainBurgerScreen
import desktop.hambug.ui.main.MainCommunityScreen
import desktop.hambug.ui.main.MainHomeScreen
import desktop.hambug.ui.main.MainMapScreen
import desktop.hambug.ui.main.MainMyScreen
import desktop.hambug.ui.theme.HambugRed
import desktop.hambug.ui.theme.HambugYellow
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
        topBar = { MainHeader(navController, currentRoute )},
        bottomBar = { MainBottomBar(navController, currentRoute) }
    ) {
        Surface(modifier = Modifier.padding(top = it.calculateTopPadding())) {
            MainNavScreen(navController)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainHeader(navController: NavHostController, currentRoute: String?) {
    CenterAlignedTopAppBar(
        title = {
            Image(
                modifier = Modifier.width(52.dp),
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "logo"
            )
        },
        navigationIcon = {
            IconButton(
                onClick = {

                },
                modifier = Modifier.width(52.dp)
            ) {
                Icon(
                    imageVector = IconPack.Menu,
                    contentDescription = "menu",
                    tint = Color.White,
                    modifier = Modifier.width(32.dp)
                )
            }
        },
        actions = {
            IconButton(
                onClick = {

                },
                modifier = Modifier.width(52.dp)
            ) {
                Icon(
                    imageVector = IconPack.Bell,
                    contentDescription = "bell",
                    tint = Color.White,
                    modifier = Modifier.width(24.dp)
                )
            }
        },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = Color.Black
        )
    )
}

@Composable
fun MainBottomBar(navController: NavHostController, currentRoute: String?) {
    val bottomNavigationItems = listOf(
        MainNav.Home,
        MainNav.Burger,
        MainNav.Community,
        MainNav.Map,
        MainNav.My,
    )

    NavigationBar(
        containerColor = Color.White,
        contentColor = Color.Black
    ) {
        bottomNavigationItems.forEach { item ->
            NavigationBarItem(
                label = {
                    Text(text = item.label)
                },
                selected = currentRoute == item.route,
                onClick = {
                    NavigationUtils.navigate(
                        navController, item.route,
                        navController.graph.startDestinationRoute
                    )
                },
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = "icon",
                        modifier = Modifier.width(28.dp)
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = HambugRed,
                    selectedTextColor = HambugRed,
                    unselectedIconColor = Color.Black,
                    unselectedTextColor = Color.Black,
                    indicatorColor = Color.White
                )
            )
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