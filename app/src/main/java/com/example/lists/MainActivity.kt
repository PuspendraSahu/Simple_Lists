package com.example.lists

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            val scrollState = rememberScrollState()
//
//            Column (modifier = Modifier.verticalScroll(scrollState)){
//                for (i in 1..100){
//
//                    Text(
//                        text = "item $i",
//                        fontSize = 30.sp,
//                        fontWeight = FontWeight.Black,
//                        textAlign = TextAlign.Center,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(24.dp)
//                    )
//
//                }
//            }

//            LazyColumn(modifier = Modifier.background(Color.Black)){
//
//                items(5000){
//
//                    Text(
//                        text = "I LOVE CODING $it",
//                        fontWeight = FontWeight.Light,
//                        color = androidx.compose.ui.graphics.Color.Green,
//                        fontSize = 22.sp,
//                        textAlign = TextAlign.Center,
//                        modifier = Modifier
//                            .fillMaxSize()
//                            .padding(20.dp)
//                        )
//
//                }
//            }

            LazyColumn(modifier = Modifier.fillMaxWidth().background(Color.Gray)){

               itemsIndexed(listOf("Puspendra", "Sahu", "is",
                   "A Passionate", "Android Dev","Puspendra", "Sahu", "is",
                   "A Passionate", "Android Dev","Puspendra", "Sahu", "is",
                "A Passionate", "Android Dev","Puspendra", "Sahu", "is",
                "A Passionate", "Android Dev",)

               ){index, string ->
                   Text(
                       text = string,
                       fontWeight = FontWeight.Black,
                       color = Color.Black,
                       fontSize = 22.sp,
                       textAlign = TextAlign.Center,
                       modifier = Modifier
                           .fillMaxSize()
                           .padding(20.dp)
                   )

               }
            }

        }
    }
}
