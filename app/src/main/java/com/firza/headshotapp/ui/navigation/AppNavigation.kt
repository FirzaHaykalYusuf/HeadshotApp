package com.firza.headshotapp.ui.navigation

import MainScreen
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.firza.headshotapp.ui.screens.CameraScreen
import com.firza.headshotapp.ui.screens.FormScreen
import com.firza.headshotapp.ui.viewmodels.SharedViewModel
import com.google.mlkit.vision.segmentation.SegmentationMask

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppNavigation(sharedViewModel: SharedViewModel) {
    val navController = rememberNavController()
    val showSidebar = remember { mutableStateOf(false) }
    val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Headshot App") },
                navigationIcon = {
                    if (currentRoute == "main") {
                        IconButton(onClick = { showSidebar.value = !showSidebar.value }) {
                            Icon(Icons.Filled.Menu, contentDescription = "Menu")
                        }
                    } else {
                        IconButton(onClick = { navController.navigate("main") }) {
                            Icon(Icons.Filled.ArrowBack, contentDescription = "Back")
                        }
                    }
                }
            )
        }
    ) { innerPadding ->
        Row(modifier = Modifier.fillMaxSize()) {
            if (showSidebar.value) {
                Sidebar(navController, showSidebar)
            }
            Box(modifier = Modifier.padding(innerPadding)) {
                NavHost(navController, startDestination = "main") {
                    composable("main") { MainScreen(navController) }
                    composable("camera") {
                        CameraScreen(navController, LocalLifecycleOwner.current, sharedViewModel)
                    }
                    composable("formScreen") {
                        val formViewModel: SharedViewModel = viewModel()
                        FormScreen(navController, formViewModel)
                    }
                }
            }
        }
    }
}

@Composable
fun Sidebar(navController: NavController, showSidebar: MutableState<Boolean>) {
    Column(modifier = Modifier.width(120.dp).padding(top = 64.dp, start = 16.dp, end = 16.dp, bottom = 16.dp)) {
        Text("Home", modifier = Modifier
            .clickable {
                navController.navigate("main")
                showSidebar.value = true // Show sidebar on the main screen
            }
            .padding(8.dp))

        Text("Camera", modifier = Modifier
            .clickable {
                navController.navigate("camera")
                showSidebar.value = false // Hide sidebar on other screens
            }
            .padding(8.dp))

//        Text("Form", modifier = Modifier
//            .clickable {
//                navController.navigate("formScreen")
//                showSidebar.value = false // Hide sidebar on other screens
//            }
//            .padding(8.dp))
    }
}