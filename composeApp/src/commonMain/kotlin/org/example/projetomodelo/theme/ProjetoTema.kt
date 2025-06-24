package org.example.projetomodelo.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun extendedColor(light: Color, dark: Color): Color{
    return if(isSystemInDarkTheme()) dark else light
}

val ColorScheme.extraColor: Color @Composable get() = extendedColor(
    light = Color(0xFFC6C6C6),
    dark = Color(0xFFFFFFF)
)

val Shapes = Shapes(
    extraSmall = RoundedCornerShape(5.dp),
    medium = RoundedCornerShape(15.dp)
)

var LightColorTheme = lightColorScheme(
    primary = Primary,
    surface = Surface,
    surfaceContainerLowest = SurfaceLowest,
    background = Background,
    onSurface = OnSurface,
    onSurfaceVariant =  OnSurfaceVariant
)

var DarkColorTheme = darkColorScheme(
    primary = PrimaryDark,
    surface = Surface,
    surfaceContainerLowest = SurfaceLowest,
    background = Background,
    onSurface = OnSurface,
    onSurfaceVariant =  OnSurfaceVariant
)

@Composable
fun ProjetoTema(
    content: @Composable () -> Unit
){
    var theme = if(isSystemInDarkTheme()) DarkColorTheme else LightColorTheme

    MaterialTheme(
        colorScheme =  theme,
        typography = Typography,
        content = content
    )

}

