package desktop.hambug

import androidx.compose.ui.graphics.vector.ImageVector
import desktop.hambug.NavigationRouteName.MAIN_BURGER
import desktop.hambug.NavigationRouteName.MAIN_COMMUNITY
import desktop.hambug.NavigationRouteName.MAIN_HOME
import desktop.hambug.NavigationRouteName.MAIN_MAP
import desktop.hambug.NavigationRouteName.MAIN_MY
import desktop.hambug.ui.IconPack
import desktop.hambug.ui.iconpack.Burger
import desktop.hambug.ui.iconpack.Chat
import desktop.hambug.ui.iconpack.Home
import desktop.hambug.ui.iconpack.Map
import desktop.hambug.ui.iconpack.User

sealed class MainNav(val route: String, val icon: ImageVector, val label: String) {
    object Home : MainNav(MAIN_HOME, IconPack.Home, NavigationLabelName.MAIN_HOME)
    object Burger : MainNav(MAIN_BURGER, IconPack.Burger, NavigationLabelName.MAIN_BURGER)
    object Community : MainNav(MAIN_COMMUNITY, IconPack.Chat, NavigationLabelName.MAIN_COMMUNITY)
    object Map : MainNav(MAIN_MAP, IconPack.Map, NavigationLabelName.MAIN_MAP)
    object My : MainNav(MAIN_MY, IconPack.User, NavigationLabelName.MAIN_MY)
}

object NavigationRouteName {
    const val MAIN_HOME = "main_home"
    const val MAIN_BURGER = "main_burger"
    const val MAIN_COMMUNITY = "main_community"
    const val MAIN_MAP = "main_map"
    const val MAIN_MY = "main_my"
}

object NavigationLabelName {
    const val MAIN_HOME = "홈"
    const val MAIN_BURGER = "버거정보"
    const val MAIN_COMMUNITY = "커뮤니티"
    const val MAIN_MAP = "매장찾기"
    const val MAIN_MY = "MY"
}