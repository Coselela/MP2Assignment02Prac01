package com.example.mp2assignment02prac01

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.outlined.ArrowForward
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController

@Composable
fun MyDetails(navController: NavController){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center,
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(350.dp)
                .graphicsLayer {
                    translationX = -0f
                    translationY = -800f
                }
                .background(Color.Blue)
        )

        IconButton(onClick = { navController.navigate(route = Screen.Home.route) },
            modifier = Modifier
                .padding(start = 0.dp)
                .graphicsLayer {
                    translationX = -480f
                    translationY = -1000f
                }) {
            Icon(imageVector = Icons.Filled.ArrowBack,
                contentDescription = null,
                tint = Color.White
            )
        }

        Card(
            modifier = Modifier
                .size(110.dp)
                .testTag(tag = "circle")
                .graphicsLayer {
                    translationX = -0f
                    translationY = -850f
                },
            shape = CircleShape,
            elevation = 10.dp
        ){
            Image(
                painter = painterResource(id = R.drawable.me2),
                contentDescription = null,
                modifier = Modifier.fillMaxSize())
        }

        Text(text = "Coselela Nomdidi",
            modifier = Modifier
                .graphicsLayer {
                    translationX = -0f
                    translationY = -650f },
            fontStyle = FontStyle.Normal,
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Text(text = "217086578",
            modifier = Modifier
                .graphicsLayer {
                    translationX = 0f
                    translationY = -580f },
            fontStyle = FontStyle.Normal,
            color = Color.White,
            fontSize = 17.sp,
            fontWeight = FontWeight.Light
        )

        Icon(imageVector = Icons.Outlined.Star,
            contentDescription = null,
            modifier = Modifier
                .size(17.dp)
                .padding(start = 0.dp)
                .graphicsLayer {
                    translationX = 0f
                    translationY = -500f
                },
            tint = Color.White)

        Icon(imageVector = Icons.Outlined.Star,
            contentDescription = null,
            modifier = Modifier
                .size(17.dp)
                .padding(start = 0.dp)
                .graphicsLayer {
                    translationX = -55f
                    translationY = -500f
                },
            tint = Color.White
        )
        Icon(imageVector = Icons.Outlined.Star,
            contentDescription = null,
            modifier = Modifier
                .size(17.dp)
                .padding(start = 0.dp)
                .graphicsLayer {
                    translationX = -110f
                    translationY = -500f
                },
            tint = Color.White
        )

        Icon(painter = painterResource(id = R.drawable.ic_star_half_black_24dp),
            contentDescription = null,
            modifier = Modifier
                .size(17.dp)
                .padding(start = 0.dp)
                .graphicsLayer {
                    translationX = 55f
                    translationY = -500f
                },
            tint = Color.White)

        Icon(painter = painterResource(id = R.drawable.ic_star_border_black_24dp),
            contentDescription = null,
            modifier = Modifier
                .size(17.dp)
                .padding(start = 0.dp)
                .graphicsLayer {
                    translationX = 110f
                    translationY = -500f
                },
            tint = Color.White)

        Button(
            onClick = { navController.navigate(route = Screen.Home.route) },
            modifier = Modifier
                .width(350.dp)
                .height(75.dp)
                .zIndex(2f)
                .graphicsLayer {
                    translationX = -0f
                    translationY = -320f
                },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White, contentColor = Color.DarkGray),
            shape = RoundedCornerShape(12.dp), elevation = ButtonDefaults.elevation(
                defaultElevation = 25.dp,
                pressedElevation = 25.dp,
                disabledElevation = 25.dp)
        ){
            Icon(imageVector = Icons.Outlined.Home,
                contentDescription = null,
                modifier = Modifier.graphicsLayer { translationX = -5f })
            Text(text = "Back to Home", modifier = Modifier.padding(start = 10.dp),
                fontStyle = FontStyle.Normal,
                color = Color.DarkGray,
                fontSize = 16.sp,
                fontWeight = FontWeight.Light)
        }

        Card(
            modifier = Modifier
                .width(340.dp)
                .height(200.dp)
                .zIndex(2f)
                .graphicsLayer {
                    translationX = -0f
                    translationY = 100f
                },
            shape = RoundedCornerShape(12.dp),
            elevation = 10.dp
        ){

            Column( modifier = Modifier.fillMaxSize())
            {

                Text(text = "Course Details", modifier = Modifier.padding(10.dp),
                    fontStyle = FontStyle.Normal,
                    color = Color.DarkGray,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold)

                Icon(painter = painterResource(id = R.drawable.ic_description_black_24dp),
                    contentDescription = "Description",
                    modifier = Modifier
                        .graphicsLayer {
                            translationX = 850f
                            translationY = -100f},  tint = Color.DarkGray)

                Icon(painter = painterResource(id = R.drawable.ic_school_black_24dp),
                    contentDescription = "School",
                    modifier = Modifier.padding(10.dp),
                    tint = Color.DarkGray)

                Text(text = "ICT - Applications Development",
                    modifier = Modifier
                        .graphicsLayer {
                            translationX = 110f
                            translationY = -90f},
                    fontStyle = FontStyle.Normal,
                    color = Color.DarkGray,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Light)

                Icon(painter = painterResource(id = R.drawable.ic_faculty),
                    contentDescription = "School",
                    modifier = Modifier
                        .padding(10.dp)
                        .graphicsLayer {
                            translationY = -80f
                        },
                    tint = Color.DarkGray)

                Text(text = "Faculty of Informatics & Design", modifier = Modifier.graphicsLayer {
                    translationX = 110f
                    translationY = -170f},
                    fontStyle = FontStyle.Normal,
                    color = Color.DarkGray,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Light)
            }
        }

        Button( onClick = { navController.navigate(route = Screen.Modules.route) },
            modifier = Modifier
                .width(340.dp)
                .height(80.dp)
                .zIndex(2f)
                .graphicsLayer {
                    translationX = -0f
                    translationY = 550f
                },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue, contentColor = Color.White),
            shape = RoundedCornerShape(12.dp), elevation = ButtonDefaults.elevation(
                defaultElevation = 15.dp,
                pressedElevation = 15.dp,
                disabledElevation = 15.dp),
        ){
            Text(text = "Current Modules",
                fontStyle = FontStyle.Normal,
                fontSize = 16.sp,
                fontWeight = FontWeight.Light)

            Icon(painter = painterResource(id = R.drawable.ic_book_black_24dp),
                modifier = Modifier.padding(start = 10.dp),
                contentDescription = null)

            Icon(imageVector = Icons.Outlined.ArrowForward,
                contentDescription = null,
                modifier = Modifier.padding(start = 30.dp))
        }

        Card(
            modifier = Modifier
                .width(100.dp)
                .height(95.dp)
                .zIndex(2f)
                .graphicsLayer {
                    translationX = -320f
                    translationY = 850f
                },
            shape = RoundedCornerShape(12.dp),

            elevation = 10.dp
        ){
            Icon(
                painter = painterResource(id = R.drawable.ic_icons8_linkedin_2),
                contentDescription = null, modifier = Modifier.size(150.dp), tint = Color.Blue)
        }

        Card(
            modifier = Modifier
                .width(100.dp)
                .height(95.dp)
                .zIndex(2f)
                .graphicsLayer {
                    translationX = 0f
                    translationY = 850f
                },
            shape = RoundedCornerShape(12.dp),
            elevation = 10.dp
        ){
            Icon(
                painter = painterResource(id = R.drawable.ic_icons8_twitter),
                contentDescription = null, modifier = Modifier.size(50.dp), tint = Color.Blue)
        }

        Card(
            modifier = Modifier
                .width(100.dp)
                .height(95.dp)
                .zIndex(2f)
                .graphicsLayer {
                    translationX = 320f
                    translationY = 850f
                },
            shape = RoundedCornerShape(12.dp),
            elevation = 10.dp
        ){
            Icon(
                painter = painterResource(id = R.drawable.ic_icons8_instagram),
                contentDescription = null, modifier = Modifier.size(150.dp), tint = Color.Blue)
        }
    }
}