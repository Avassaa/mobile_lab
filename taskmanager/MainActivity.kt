package com.example.taskmanager

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Task_Manager_App()
                }
            }
        }
    }
}
@Composable
fun Task_Manager_App(){
    Task_Manager(
        painterResource(id = R.drawable.ic_task_completed),
        stringResource(id =R.string.notification),
        stringResource(id = R.string.feedback)
    )
}

@Composable
fun Task_Manager(image_name:Painter,main_text:String,sub_text:String,modifier:Modifier=Modifier) {
    val image= image_name

   Column(
       verticalArrangement = Arrangement.Center,
        horizontalAlignment=Alignment.CenterHorizontally
   ) {
       Image(
           painter = image,
           contentDescription = null,
           modifier=modifier
               .align(Alignment.CenterHorizontally),
           alpha=0.95f
       )
       Text(
           text = main_text,
           modifier = modifier
               .padding(top = 24.dp, bottom = 8.dp)
               .align(Alignment.CenterHorizontally),
           fontSize = 36.sp,
           fontWeight = FontWeight.Bold,
           textAlign = TextAlign.Center
       )
       Text(
           text = sub_text,
           modifier = modifier,
           fontSize = 16.sp
       )
   }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskManagerTheme {
        Task_Manager_App()
    }
}