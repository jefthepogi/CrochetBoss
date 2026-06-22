package com.example.crochetboss.ui.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

object AppIcons {
    @Suppress("CheckReturnValue")
    public val home: ImageVector
        get() {
            if (_home != null) {
                return _home!!
            }
            _home =
                ImageVector.Builder(
                    name = "home",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
                )
                    .apply {
                        path(
                            fill = SolidColor(Color.Black),
                            fillAlpha = 1f,
                            stroke = null,
                            strokeAlpha = 1f,
                            strokeLineWidth = 1f,
                            strokeLineCap = StrokeCap.Butt,
                            strokeLineJoin = StrokeJoin.Bevel,
                            strokeLineMiter = 1f,
                            pathFillType = PathFillType.Companion.NonZero,
                        ) {
                            moveTo(6.05f, 19f)
                            horizontalLineTo(9.12f)
                            verticalLineTo(12.79f)
                            horizontalLineToRelative(5.77f)
                            verticalLineTo(19f)
                            horizontalLineToRelative(3.07f)
                            verticalLineTo(10.05f)
                            lineTo(12f, 5.56f)
                            lineTo(6.05f, 10.05f)
                            verticalLineTo(19f)
                            close()
                            moveTo(4.4f, 20.65f)
                            verticalLineTo(9.22f)
                            lineTo(12f, 3.51f)
                            lineToRelative(7.6f, 5.71f)
                            verticalLineTo(20.65f)
                            horizontalLineTo(13.23f)
                            verticalLineTo(14.44f)
                            horizontalLineTo(10.77f)
                            verticalLineToRelative(6.21f)
                            horizontalLineTo(4.4f)
                            close()
                            moveTo(12f, 12.28f)
                            close()
                        }
                    }
                    .build()
            return _home!!
        }
    private var _home: ImageVector? = null

    @Suppress("CheckReturnValue")
    public val search: ImageVector
        get() {
            if (_search != null) {
                return _search!!
            }
            _search =
                ImageVector.Builder(
                    name = "search",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
                )
                    .apply {
                        path(
                            fill = SolidColor(Color.Black),
                            fillAlpha = 1f,
                            stroke = null,
                            strokeAlpha = 1f,
                            strokeLineWidth = 1f,
                            strokeLineCap = StrokeCap.Butt,
                            strokeLineJoin = StrokeJoin.Bevel,
                            strokeLineMiter = 1f,
                            pathFillType = PathFillType.Companion.NonZero,
                        ) {
                            moveTo(19.6f, 21f)
                            lineTo(13.3f, 14.7f)
                            quadToRelative(-0.75f, 0.6f, -1.72f, 0.95f)
                            reflectiveQuadTo(9.5f, 16f)
                            quadTo(6.78f, 16f, 4.89f, 14.11f)
                            quadTo(3f, 12.23f, 3f, 9.5f)
                            quadTo(3f, 6.77f, 4.89f, 4.89f)
                            reflectiveQuadTo(9.5f, 3f)
                            reflectiveQuadToRelative(4.61f, 1.89f)
                            reflectiveQuadTo(16f, 9.5f)
                            quadToRelative(0f, 1.1f, -0.35f, 2.07f)
                            reflectiveQuadTo(14.7f, 13.3f)
                            lineTo(21f, 19.6f)
                            lineTo(19.6f, 21f)
                            close()
                            moveTo(9.5f, 14f)
                            quadToRelative(1.88f, 0f, 3.19f, -1.31f)
                            reflectiveQuadTo(14f, 9.5f)
                            reflectiveQuadTo(12.69f, 6.31f)
                            reflectiveQuadTo(9.5f, 5f)
                            reflectiveQuadTo(6.31f, 6.31f)
                            reflectiveQuadTo(5f, 9.5f)
                            reflectiveQuadToRelative(1.31f, 3.19f)
                            reflectiveQuadTo(9.5f, 14f)
                            close()
                        }
                    }
                    .build()
            return _search!!
        }
    private var _search: ImageVector? = null

}
