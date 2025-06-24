package org.example.projetomodelo

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import modelomaterialtheme3.composeapp.generated.resources.Res
import modelomaterialtheme3.composeapp.generated.resources.compose_multiplatform
import org.example.projetomodelo.theme.ProjetoTema
import org.example.projetomodelo.theme.extraColor

@Composable
@Preview
fun App() {
    ProjetoTema {
        var showContent by remember { mutableStateOf(false) }
        Column(
            modifier = Modifier
                .safeContentPadding() //tira a margem em volta da tela
                .fillMaxSize()
                .clip(MaterialTheme.shapes.medium)
                .background(
                    MaterialTheme.colorScheme.extraColor
                )
            ,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(onClick = { showContent = !showContent }) {
                Text("Click me!",
                    style = MaterialTheme.typography.bodyMedium)
            }
            AnimatedVisibility(showContent) {
                val greeting = remember { Greeting().greet() }
                Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painterResource(Res.drawable.compose_multiplatform), null)
                    Text("Compose: $greeting")
                }
            }
        }
    }
}