package desktop.hambug

import desktop.hambug.NavigationRouteName.MAIN_BURGER
import desktop.hambug.NavigationRouteName.MAIN_COMMUNITY
import desktop.hambug.NavigationRouteName.MAIN_HOME
import desktop.hambug.NavigationRouteName.MAIN_MAP
import desktop.hambug.NavigationRouteName.MAIN_MY

sealed class MainNav(val route: String) {
    object Home : MainNav(MAIN_HOME)
    object Map : MainNav(MAIN_MAP)
    object Burger : MainNav(MAIN_BURGER)
    object Community : MainNav(MAIN_COMMUNITY)
    object My : MainNav(MAIN_MY)
}

object NavigationRouteName {
    const val MAIN_HOME = "main_home"
    const val MAIN_MAP = "main_map"
    const val MAIN_BURGER = "main_burger"
    const val MAIN_COMMUNITY = "main_community"
    const val MAIN_MY = "main_my"
}
