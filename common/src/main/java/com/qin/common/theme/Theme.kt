package com.qin.common.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*

@Composable
fun MyTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) DarkColorPalette else LightColorPalette
    ProvideJetsnackColors(colors) {
        MaterialTheme(
            colors = defaultColors(darkTheme),
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }
}

@Composable
fun ProvideJetsnackColors(colors: MyColors, content: @Composable () -> Unit) {
    val rememberedColors = remember { colors.copy() }.apply { update(colors) }
    CompositionLocalProvider(LocalJetsnackColors provides rememberedColors, content = content)
}

private val LocalJetsnackColors = staticCompositionLocalOf { LightColorPalette }

object MyTheme {
    val colors: MyColors
        @Composable
        get() = LocalJetsnackColors.current
}
