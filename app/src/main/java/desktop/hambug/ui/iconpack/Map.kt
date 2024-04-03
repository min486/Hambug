package desktop.hambug.ui.iconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import desktop.hambug.ui.IconPack

public val IconPack.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 800.0.dp, defaultHeight = 800.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.7f, 15.0f)
                curveTo(4.0338f, 15.6353f, 3.0f, 16.5205f, 3.0f, 17.4997f)
                curveTo(3.0f, 19.4329f, 7.0294f, 21.0f, 12.0f, 21.0f)
                curveTo(16.9706f, 21.0f, 21.0f, 19.4329f, 21.0f, 17.4997f)
                curveTo(21.0f, 16.5205f, 19.9662f, 15.6353f, 18.3f, 15.0f)
                moveTo(12.0f, 9.0f)
                horizontalLineTo(12.01f)
                moveTo(18.0f, 9.0f)
                curveTo(18.0f, 13.0637f, 13.5f, 15.0f, 12.0f, 18.0f)
                curveTo(10.5f, 15.0f, 6.0f, 13.0637f, 6.0f, 9.0f)
                curveTo(6.0f, 5.6863f, 8.6863f, 3.0f, 12.0f, 3.0f)
                curveTo(15.3137f, 3.0f, 18.0f, 5.6863f, 18.0f, 9.0f)
                close()
                moveTo(13.0f, 9.0f)
                curveTo(13.0f, 9.5523f, 12.5523f, 10.0f, 12.0f, 10.0f)
                curveTo(11.4477f, 10.0f, 11.0f, 9.5523f, 11.0f, 9.0f)
                curveTo(11.0f, 8.4477f, 11.4477f, 8.0f, 12.0f, 8.0f)
                curveTo(12.5523f, 8.0f, 13.0f, 8.4477f, 13.0f, 9.0f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
