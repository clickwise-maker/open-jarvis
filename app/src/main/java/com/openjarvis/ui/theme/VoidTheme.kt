package com.openjarvis.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

object VoidColor {
    val Void = Color(0xFF0A0A0F)
    val TextPrimary = Color(0xFFEAEAF2)
    val TextSecondary = Color(0xFF9A9AAB)
    val TextDisabled = Color(0xFF55556A)
    val Violet = Color(0xFF7C4DFF)
    val VioletDim = Color(0xFF3D2A75)
    val Cyan = Color(0xFF03DAC6)
    val Green = Color(0xFF4CAF50)
    val Red = Color(0xFFF44336)
    val Amber = Color(0xFFFFC107)
    val BorderGlow = Color(0x667C4DFF)
    val BorderSubtle = Color(0xFF2A2A35)
    val Void600 = Color(0xFF23232E)
    val Void700 = Color(0xFF1E1E28)
    val Void800 = Color(0xFF171720)
    val Void900 = Color(0xFF12121A)
    val Void950 = Color(0xFF0A0A0F)
}

private val VoidScheme = darkColorScheme(
    primary = VoidColor.Violet,
    secondary = VoidColor.Cyan,
    background = VoidColor.Void,
    surface = VoidColor.Void,
    error = VoidColor.Red,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = VoidColor.TextPrimary,
    onSurface = VoidColor.TextPrimary,
    onError = Color.White
)

@Composable
fun OpenJarvisTheme(content: @Composable () -> Unit) {
    MaterialTheme(colorScheme = VoidScheme, content = content)
}
