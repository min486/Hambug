package desktop.hambug.ui

import androidx.compose.ui.graphics.vector.ImageVector
import desktop.hambug.ui.iconpack.Bell
import desktop.hambug.ui.iconpack.Burger
import desktop.hambug.ui.iconpack.Chat
import desktop.hambug.ui.iconpack.Home
import desktop.hambug.ui.iconpack.Map
import desktop.hambug.ui.iconpack.Menu
import desktop.hambug.ui.iconpack.User
import kotlin.collections.List as ____KtList

public object IconPack

private var __Icons: ____KtList<ImageVector>? = null

public val IconPack.Icons: ____KtList<ImageVector>
  get() {
    if (__Icons != null) {
      return __Icons!!
    }
    __Icons= listOf(User, Home, Map, Bell, Burger, Chat, Menu)
    return __Icons!!
  }
