package desktop.hambug.ui.iconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import desktop.hambug.ui.IconPack

public val IconPack.Burger: ImageVector
    get() {
        if (_burger != null) {
            return _burger!!
        }
        _burger = Builder(name = "Burger", defaultWidth = 800.0.dp, defaultHeight = 800.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(15.0f, 15.0f)
                lineToRelative(3.379f, -3.379f)
                arcToRelative(2.121f, 2.121f, 0.0f, false, true, 1.5f, -0.621f)
                horizontalLineTo(20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(4.515f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.242f, 1.757f)
                lineTo(15.0f, 15.0f)
                close()
                moveTo(3.0f, 15.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineTo(6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveToRelative(-4.623f, 0.0f, -8.432f, 1.756f, -8.942f, 6.0f)
                curveToRelative(-0.066f, 0.55f, 0.39f, 1.0f, 0.942f, 1.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(0.552f, 0.0f, 1.008f, -0.45f, 0.942f, -1.0f)
                curveToRelative(-0.51f, -4.244f, -4.319f, -6.0f, -8.942f, -6.0f)
                close()
                moveTo(7.001f, 8.0f)
                horizontalLineTo(7.0f)
                moveToRelative(8.001f, -1.0f)
                horizontalLineTo(15.0f)
                moveToRelative(-2.999f, 1.0f)
                horizontalLineTo(12.0f)
            }
        }
        .build()
        return _burger!!
    }

private var _burger: ImageVector? = null
