package org.example.projetomodelo.login

import ProjetoLink
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import org.example.projetomodelo.design_system.ProjetoButton
import org.example.projetomodelo.design_system.ProjetoTextField

@Composable
fun LoginScreen(){

    var emailText by remember { mutableStateOf("") }
    var passwordText by remember { mutableStateOf("") }

    Scaffold (
        modifier = Modifier
            .fillMaxSize(),
        contentWindowInsets = WindowInsets.statusBars
    ){
        innerPadding ->
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .clip(
                        RoundedCornerShape(
                            topStart = 15.dp,
                            topEnd = 10.dp
                        ))
                    .background(MaterialTheme.colorScheme.surfaceContainerLowest)
                    .padding(
                        horizontal = 16.dp,
                        vertical = 24.dp
                    )
                    .consumeWindowInsets(WindowInsets.navigationBars),
                    verticalArrangement = Arrangement.spacedBy(32.dp)
                    //.padding(top =48.dp)

            ){
                LoginHeaderSection(
                    modifier = Modifier.fillMaxWidth()
                )

                LoginFormSection(
                    emailText = emailText,
                    onEmailTextChange = { emailText = it },
                    passordText = passwordText,
                    onPasswordTextChange = {passwordText = it},
                    modifier = Modifier.fillMaxWidth()
                )
            }
    }
}

@Composable
fun LoginHeaderSection(
    modifier: Modifier = Modifier
){
    Column (
        modifier = modifier
    ){
        Text(
            text= "Log in",
            style= MaterialTheme.typography.titleLarge
        )
        Text(
            text= "Capture seus pensamentos....",
            style= MaterialTheme.typography.bodyMedium
        )
    }
}

@Composable
fun LoginFormSection(
    emailText: String,
    onEmailTextChange: (String) -> Unit,
    passordText: String,
    onPasswordTextChange: (String) -> Unit,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
    ){
        ProjetoTextField(
            text = emailText,
            onValueChange = onEmailTextChange,
            label = "Email",
            hint = "email@email.com.br",
            isInputSecret = false,
            modifier = Modifier
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        ProjetoTextField(
            text = passordText,
            onValueChange = onPasswordTextChange,
            label = "Senha",
            hint = "Senha",
            isInputSecret = true,
            modifier = Modifier
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(24.dp))
        ProjetoButton(
            text = "Log In",
            onClick = {},
            modifier=Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        ProjetoLink(
            text = "Não possui senha?",
            onClick = {},
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )

    }
}