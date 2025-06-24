package org.example.projetomodelo.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import modelomaterialtheme3.composeapp.generated.resources.Res
import modelomaterialtheme3.composeapp.generated.resources.inter
import modelomaterialtheme3.composeapp.generated.resources.space_grotestk_bold
import org.jetbrains.compose.resources.Font
import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color

val SpaceGrotesk @Composable get() = FontFamily(
    Font(
        resource = Res.font.space_grotestk_bold,
        weight = FontWeight.Bold
    )
)

val Inter @Composable get() = FontFamily(
    Font(
        resource = Res.font.inter,
        weight = FontWeight.Normal
    ),
    Font(
        resource = Res.font.inter,
        weight = FontWeight.Medium
    )
)

val Typography: Typography @Composable get() = Typography(
    bodyLarge = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Normal,
        fontSize = 17.sp,
        lineHeight = 24.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Medium,
        fontSize = 15.sp,
        lineHeight = 20.sp
    )
    ,
    bodySmall = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        lineHeight = 20.sp
    ),
    titleLarge = TextStyle(
        fontFamily = SpaceGrotesk,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
        lineHeight = 36.sp
        //,background = Color.Red

    ),
    titleMedium = TextStyle(
        fontFamily = SpaceGrotesk,
        fontWeight = FontWeight.Medium,
        fontSize = 15.sp,
        lineHeight = 20.sp
    )
    ,
    titleSmall = TextStyle(
        fontFamily = SpaceGrotesk,
        fontWeight = FontWeight.Medium,
        fontSize = 17.sp,
        lineHeight = 20.sp
    )
)
