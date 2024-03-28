package com.example.composepractice

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composepractice.ui.theme.ComposePracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val msg1= stringResource(id = R.string.title)
            val msg2= stringResource(id = R.string.subtitle)
            val msg3= stringResource(id = R.string.paragraph)
            ComposePracticeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    ComposeBasicsImage(
                        msg1,
                        msg2,
                        msg3,
                        modifier=Modifier.padding(16.dp))
                }
            }
        }
    }
}
@Composable
fun ComposeBasicsImage(message1:String,message2:String,message3:String,modifier:Modifier=Modifier){
    val image = painterResource(id = R.drawable.bg_compose_background)

        Column(
        ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier=Modifier.padding(bottom=6.dp).fillMaxWidth()

            )
            Text(
                text = message1,
                textAlign = TextAlign.Start,
                modifier=modifier,
                fontSize = 24.sp
            )
            Text(
                text = message2,
                textAlign = TextAlign.Justify,
                modifier=Modifier.padding(start = 16.dp, end = 16.dp),

            )
            Text(
                text =message3,
                textAlign = TextAlign.Justify,
                modifier=modifier
            )        }



}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposePracticeTheme {
        val msg1= stringResource(id = R.string.title)
        val msg2= stringResource(id = R.string.subtitle)
        val msg3= stringResource(id = R.string.paragraph)
        ComposeBasicsImage(msg1,msg2,msg3,Modifier.padding(16.dp))

    }
}