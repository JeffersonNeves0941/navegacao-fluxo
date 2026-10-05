package com.example.navegacaofluxo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navegacaofluxo.screen.loginScreen
import com.example.navegacaofluxo.screen.menuScreen
import com.example.navegacaofluxo.screen.pedidoScreen
import com.example.navegacaofluxo.screen.perfilScreen
import com.example.navegacaofluxo.ui.theme.NavegacaoFluxoTheme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavegacaoFluxoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "Login"
                    ) {
                        composable(route = "Login") {
                            loginScreen(modifier = Modifier.padding(innerPadding))
                        }

                        composable(route = "Menu") {
                            menuScreen(modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = "Perfil") {
                            perfilScreen(modifier = Modifier.padding(innerPadding))

                        }
                        composable(route = "Pedido") {
                            pedidoScreen(modifier = Modifier.padding(innerPadding))

                        }

                    }
                }
            }
        }

    }
}

