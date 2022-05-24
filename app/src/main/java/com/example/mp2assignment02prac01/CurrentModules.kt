package com.example.mp2assignment02prac01

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.outlined.ExitToApp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlin.system.exitProcess

@Composable
fun CurrentModules(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.TopCenter,
    ) {

        val displayDialog = remember { mutableStateOf(false) }


        if (displayDialog.value) {
            AlertDialog(
                onDismissRequest = {
                    displayDialog.value = false
                },

                title = {
                    Text(
                        text = "Leaving now?",
                        fontSize = 18.sp,
                        color = Color.DarkGray,
                        fontWeight = FontWeight.Normal,
                    )
                },

                confirmButton = {
                    Button(
                        shape = RoundedCornerShape(20.dp),
                        colors = ButtonDefaults.buttonColors(Color.Blue),
                        onClick = {
                            displayDialog.value = false
                        }

                    ) {
                        Text(
                            text = "No",
                            color = Color.White
                        )
                    }
                }, dismissButton = {
                    TextButton(
                        shape = RoundedCornerShape(20.dp),
                        colors = ButtonDefaults.buttonColors(Color.Blue),
                        onClick = {
                            exitProcess(0)
                        }
                    ) { Text("Yes", color = Color.White)
                    }
                },
                contentColor = Color.White,
                shape = RoundedCornerShape(18.dp)
            )

        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            IconButton(
                onClick = { navController.navigate(route = Screen.Details.route) },
                modifier = Modifier
                    .padding(start = 0.dp)
            ) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = null,
                    tint = Color.Blue
                )
            }

            Text(
                text = "Current Modules",
                fontStyle = FontStyle.Normal,
                fontSize = 16.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.graphicsLayer{
                    translationX = 380f
                    translationY = 35f
                }
            )
        }
        Column(
            modifier = Modifier
                .height(680.dp)
                .padding(30.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {

            Card(
                modifier = Modifier
                    .width(340.dp)
                    .height(200.dp)
                    .padding(10.dp),
                shape = RoundedCornerShape(12.dp),
                elevation = 10.dp
            ) {

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "ICT electives - ICE362S",
                        modifier = Modifier.padding(10.dp),
                        fontStyle = FontStyle.Normal,
                        color = Color.DarkGray,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold)

                    Row(modifier = Modifier
                        .graphicsLayer {
                            translationX = -200f
                            translationY = 70f
                        }
                    ){
                        Icon(painter = painterResource(id = R.drawable.ic_duration),
                            contentDescription = null, modifier = Modifier
                                    .size(25.dp))

                        Text(
                            text ="Semester",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Light)
                    }

                    Row(modifier = Modifier
                        .graphicsLayer {
                            translationX = -110f
                            translationY = 100f
                        }
                    ){
                        Icon(painter = painterResource(id = R.drawable.ic_description_black_24dp),
                            contentDescription = null, modifier = Modifier
                                .size(25.dp))

                        Text(
                            text ="Theory & Practical",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Light)
                    }
                }
            }

            Card(
                modifier = Modifier
                    .width(340.dp)
                    .height(200.dp)
                    .padding(10.dp),
                shape = RoundedCornerShape(12.dp),
                elevation = 10.dp
            ) {

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Professional Practice - PFP362S",
                        modifier = Modifier.padding(10.dp),
                        fontStyle = FontStyle.Normal,
                        color = Color.DarkGray,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold)

                    Row(modifier = Modifier
                        .graphicsLayer {
                            translationX = -200f
                            translationY = 70f
                        }
                    ){
                        Icon(painter = painterResource(id = R.drawable.ic_duration),
                            contentDescription = null, modifier = Modifier
                                .size(25.dp))

                        Text(
                            text ="Semester",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Light)
                    }

                    Row(modifier = Modifier
                        .graphicsLayer {
                            translationX = -110f
                            translationY = 100f
                        }
                    ){
                        Icon(painter = painterResource(id = R.drawable.ic_description_black_24dp),
                            contentDescription = null, modifier = Modifier
                                .size(25.dp))

                        Text(
                            text ="Theory & Practical",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Light)
                    }
                }
            }

            Card(
                modifier = Modifier
                    .width(340.dp)
                    .height(200.dp)
                    .padding(10.dp),
                shape = RoundedCornerShape(12.dp),
                elevation = 10.dp
            ) {

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Applications Development Practice - ADP262S",
                        modifier = Modifier.padding(10.dp),
                        fontStyle = FontStyle.Normal,
                        color = Color.DarkGray,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold)

                    Row(modifier = Modifier
                        .graphicsLayer {
                            translationX = -200f
                            translationY = 70f
                        }
                    ){
                        Icon(painter = painterResource(id = R.drawable.ic_duration),
                            contentDescription = null, modifier = Modifier
                                .size(25.dp))

                        Text(
                            text ="Semester",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Light)
                    }

                    Row(modifier = Modifier
                        .graphicsLayer {
                            translationX = -110f
                            translationY = 100f
                        }
                    ){
                        Icon(painter = painterResource(id = R.drawable.ic_description_black_24dp),
                            contentDescription = null, modifier = Modifier
                                .size(25.dp))

                        Text(
                            text ="Theory & Practical",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Light)
                    }
                }
            }

            Card(
                modifier = Modifier
                    .width(340.dp)
                    .height(200.dp)
                    .padding(10.dp),
                shape = RoundedCornerShape(12.dp),
                elevation = 10.dp
            ) {

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally)
                {

                    Text(
                        text = "Project Management - PRM362S",
                        modifier = Modifier.padding(10.dp),
                        fontStyle = FontStyle.Normal,
                        color = Color.DarkGray,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Row(modifier = Modifier
                        .graphicsLayer {
                            translationX = -200f
                            translationY = 70f
                        }
                    ){
                        Icon(painter = painterResource(id = R.drawable.ic_duration),
                            contentDescription = null, modifier = Modifier
                                .size(25.dp))
                        Text(
                            text ="Semester",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Light)
                    }

                    Row(modifier = Modifier
                        .graphicsLayer {
                            translationX = -220f
                            translationY = 100f
                        }
                    ){
                        Icon(painter = painterResource(id = R.drawable.ic_description_black_24dp),
                            contentDescription = null, modifier = Modifier
                                .size(25.dp))

                        Text(
                            text ="Theory",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Light)
                    }

                }
            }
        }

        Button(
            onClick = { displayDialog.value = true },
            modifier = Modifier
                .width(350.dp)
                .height(75.dp)
                .graphicsLayer { translationY = 1800f },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Blue,
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(12.dp), elevation = ButtonDefaults.elevation(
                defaultElevation = 25.dp,
                pressedElevation = 25.dp,
                disabledElevation = 25.dp
            )
        ) {

            Text(
                text = "Goodbye",
                fontStyle = FontStyle.Normal,
                fontSize = 16.sp,
                fontWeight = FontWeight.Light
            )

            Icon(imageVector = Icons.Outlined.ExitToApp,
                contentDescription = null,
                modifier = Modifier.padding(start = 10.dp))
        }
    }
}
