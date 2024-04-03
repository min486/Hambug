package desktop.hambug.ui.iconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import desktop.hambug.ui.IconPack

public val IconPack.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 800.0.dp, defaultHeight = 800.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.56f, 2.171f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.12f, 0.0f)
                lineToRelative(-8.0f, 5.4f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 8.4f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                lineTo(20.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(21.0f, 8.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.44f, -0.829f)
                close()
                moveTo(14.0f, 20.0f)
                lineTo(10.0f, 20.0f)
                lineTo(10.0f, 14.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(19.0f, 20.0f)
                lineTo(16.0f, 20.0f)
                lineTo(16.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(9.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                lineTo(5.0f, 20.0f)
                lineTo(5.0f, 8.932f)
                lineToRelative(7.0f, -4.725f)
                lineToRelative(7.0f, 4.725f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
