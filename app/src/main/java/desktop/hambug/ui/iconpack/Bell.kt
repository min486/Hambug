package desktop.hambug.ui.iconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import desktop.hambug.ui.IconPack

public val IconPack.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 800.0.dp, defaultHeight = 800.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.85f, 28.13f)
                lineToRelative(-0.34f, -0.3f)
                arcTo(14.37f, 14.37f, 0.0f, false, true, 30.0f, 24.9f)
                arcToRelative(12.63f, 12.63f, 0.0f, false, true, -1.35f, -4.81f)
                verticalLineTo(15.15f)
                arcTo(10.81f, 10.81f, 0.0f, false, false, 19.21f, 4.4f)
                verticalLineTo(3.11f)
                arcToRelative(1.33f, 1.33f, 0.0f, true, false, -2.67f, 0.0f)
                verticalLineTo(4.42f)
                arcTo(10.81f, 10.81f, 0.0f, false, false, 7.21f, 15.15f)
                verticalLineToRelative(4.94f)
                arcTo(12.63f, 12.63f, 0.0f, false, true, 5.86f, 24.9f)
                arcToRelative(14.4f, 14.4f, 0.0f, false, true, -2.47f, 2.93f)
                lineToRelative(-0.34f, 0.3f)
                verticalLineToRelative(2.82f)
                horizontalLineTo(32.85f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.32f, 32.0f)
                arcToRelative(2.65f, 2.65f, 0.0f, false, false, 5.25f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(36.0f)
                horizontalLineToRelative(-36.0f)
                close()
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
