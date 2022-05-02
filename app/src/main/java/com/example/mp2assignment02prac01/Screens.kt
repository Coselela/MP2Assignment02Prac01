package com.example.mp2assignment02prac01

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Info
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun WelcomeScreen(onNavigation:() -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

            Text(
                text = "Welcome to my Jetpack Compose journey",
                fontStyle = FontStyle.Normal,
                color = Color.Blue,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )


            val displayDialog = remember { mutableStateOf(false) }
            val mainButtonColor = ButtonDefaults.buttonColors(
                backgroundColor = Color.Blue,
                contentColor = MaterialTheme.colors.surface
            )
            Row {
                Button(
                    colors = mainButtonColor,
                    onClick = { displayDialog.value = true },
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier.padding(10.dp)
                ) {
                    Text(text = "INFO")
                    Icon(
                        imageVector = Icons.Outlined.Info,
                        contentDescription = null,
                        modifier = Modifier.padding(start = 5.dp)
                    )
                }
            }

            if (displayDialog.value) {
                AlertDialog(
                    onDismissRequest = {
                        displayDialog.value = false
                    },

                    title = {
                        Text(
                            text = "My Journey",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Black,
                        )
                    },
                    text = {
                        Text(
                            text = "I think Jetpack Compose is the future of Android UI Design considering how much convenience it brings in builing UI. " +
                                    "My journey has been a very interesting one in learning how to build Android UI with Jetpack Compose. " +
                                    "The more I learn how to use Jetpack Compose, the more interesting it becomes. I've enjoyed my journey so far.",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal
                        )
                    },

                    confirmButton = {
                        Button(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 0.dp, end = 0.dp, top = 1.dp),
                            shape = RoundedCornerShape(20.dp),
                            colors = ButtonDefaults.buttonColors(Color.Blue),
                            onClick = {
                                displayDialog.value = false
                            }

                        ) {
                            Text(
                                text = "DISMISS",
                                color = Color.White
                            )
                        }
                    },

                    shape = RoundedCornerShape(25.dp),
                    backgroundColor = Color.White,
                    contentColor = Color.Black
                )
            }

        Button(
            onClick = { onNavigation() },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier.padding(5.dp)
        ){
            Text(text = "MY DETAILS", color = Color.White)
        }
    }
}


@Composable
fun MyDetails(onNavigation:() -> Unit) {
    Surface(color = Color.White,modifier = Modifier.fillMaxSize()){


            Box(contentAlignment = Alignment.TopCenter) {
                Card(
                    backgroundColor = Color.Blue,
                    shape = RoundedCornerShape(0.dp),
                    modifier = Modifier
                        .width(500.dp)
                        .height(600.dp)
                ) {
                    Text(text = "")
                }

                Button(
                    onClick = { onNavigation() },
                    colors = ButtonDefaults.buttonColors(Color.White),
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier.padding(5.dp)
                ){
                    Text(text = "BACK", color = Color.Blue)
                }
            }

            Box(
                contentAlignment = Alignment.BottomCenter
            ) {
                Card(
                    shape = RoundedCornerShape(0.dp), modifier = Modifier
                        .width(500.dp)
                        .height(500.dp)
                ) {
                    Column() {
                        Text(text = "Coselela Nomdidi", fontSize = 18.sp,
                            fontWeight = FontWeight.Black, color = Color.Blue)
                        Text(text = "Std No.: 217086578", fontSize = 18.sp,
                            fontWeight = FontWeight.Black, color = Color.Blue)
                        Text(text = "Course: ICT - Applications Development", fontSize = 18.sp,
                            fontWeight = FontWeight.Black, color = Color.Blue )
                        Text(text = "Faculty: Informatics & Design", fontSize = 18.sp,
                            fontWeight = FontWeight.Black, color = Color.Blue)

                    }
                }



                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(Color.Blue),
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier.padding(5.dp)
                ){
                    Text(text = "MODULES", color = Color.White)
                }
            }

    }

}

