package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SetQuadrant_App()
                }
            }
        }
    }
}
@Composable
fun SetQuadrant_App(){
    val title1= stringResource(id = R.string.text_comp)
    val text1= stringResource(id = R.string.disp_text)
    val title2= stringResource(id = R.string.img_comp)
    val text2= stringResource(id = R.string.creates_comp)
    val title3= stringResource(id = R.string.row_comp)
    val text3= stringResource(id = R.string.a_lay)
    val title4= stringResource(id = R.string.column_comp)
    val text4= stringResource(id = R.string.a_layout_ver)


    SetQuadrant(title1,text1,title2,text2,title3,text3,title4,text4)
}



    @Composable
    fun SetQuadrant(title1:String, text1:String, title2:String, text2:String, title3:String, text3:String, title4:String, text4:String) {
        Column(Modifier.fillMaxSize()) {
            Row(Modifier.weight(1f)) {
                Column(Modifier.weight(1f).background(Color(0xFFF6EDFF)).fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = title1, modifier = Modifier.padding(bottom=16.dp))
                    Text(text = text1, modifier = Modifier.padding(bottom=16.dp))
                }
                Column(
                    Modifier
                        .weight(1f).background(Color(0xFFB69DF8)).fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = title2, modifier = Modifier.padding(bottom=16.dp), textAlign = TextAlign.Justify)
                    Text(text = text2, modifier = Modifier.padding(bottom=16.dp), textAlign = TextAlign.Justify)
                }
            }
            Row(Modifier.weight(1f)) {
                Column(Modifier.weight(1f).background(Color(0xFFD0BCFF)).fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = title3, modifier = Modifier.padding(bottom=16.dp), textAlign = TextAlign.Justify)
                    Text(text = text3, modifier = Modifier.padding(bottom=16.dp), textAlign = TextAlign.Justify)
                }
                Column(Modifier.weight(1f).background(Color(0xFFEADDFF)).fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = title4, modifier = Modifier.padding(bottom=16.dp), textAlign = TextAlign.Justify)
                    Text(text = text4, modifier = Modifier.padding(bottom=16.dp), textAlign = TextAlign.Justify)
                }
            }
        }
    }








@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
       SetQuadrant_App()
    }
}