package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.colorspace.ColorSpace
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            TextViewStyle()


//
////            Adding Modifier
//
//            Column(modifier =  Modifier.fillMaxHeight(0.5f)
//                .fillMaxWidth()
//                .background(Color.Green)
//                .border(5.dp, Color.DarkGray)
//                .padding(5.dp)
//                .border(5.dp, Color.Blue)
//                .padding(5.dp)
//                .border(5.dp,Color.Magenta)
//                .offset(10.dp,10.dp)
//
//            ) {
//
//                Text(
//                    text = "Hello",
//                    fontSize = 18.sp,
//                    modifier = Modifier
//                        .padding(5.dp)
//                        .offset(30.dp,30.dp)
//                        .border(10.dp, Color.Red)
//                        .padding(10.dp)
//                        .clickable {  }
//                )
//
//                Text(
//                    text = "Azam", fontSize = 18.sp
//                )
//                Text(
//                    text = "Khan", fontSize = 18.sp
//                )
//            }


            /*Adding Row and Column*/
//            Row(
//                modifier = Modifier.fillMaxWidth()
//                    .height(300.dp)
//                    .background(Color.Green),
//                horizontalArrangement =  Arrangement.SpaceAround,
//                verticalAlignment = Alignment.CenterVertically,
//            ) {
//                Text(text = "Hello",
//                fontSize = 18.sp,
//                modifier = Modifier.height(200.dp).background(Color.White)
//                    .padding())
//
//                Text(text = "Azam",
//                    fontSize = 18.sp)
//                Text(text = "Khan",
//                    fontSize = 18.sp)
//            }
        }
    }
}






