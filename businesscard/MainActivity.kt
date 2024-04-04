package com.example.businesscard

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
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp(){
    val background: Painter=painterResource(R.drawable.background)

    Image(
        modifier = Modifier.fillMaxSize(),
        painter = background,
        contentDescription = null,
        contentScale= ContentScale.Crop

    )
    Box(Modifier.fillMaxSize()){

        Column(modifier=Modifier.fillMaxSize(),verticalArrangement = Arrangement.Center){

            BusinessCardInfo(
                name = stringResource(id = R.string.name_title),
                title = stringResource(id = R.string.position),

                )
            BusinessCardContactInfo(
                phoneNo = stringResource(id = R.string.phone_number) ,
                socialMedia = stringResource(id =R.string.social_media),
                email = stringResource(id =R.string.email),



            )
        }
    }

}

@Composable
fun BusinessCardInfo(name: String,title:String ,modifier: Modifier = Modifier) {

    Box() {


        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()

        ) {



            Text(
                text = name,
                modifier = modifier
                    .align(Alignment.CenterHorizontally),
                fontWeight = FontWeight.Bold,
                fontSize = 33.sp,
                textAlign = TextAlign.Center
            )
            Text(
                text = title,
                modifier = modifier
                    .align(Alignment.CenterHorizontally),
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                textAlign = TextAlign.Center

            )

        }
    }
}
@Composable
fun BusinessCardContactInfo(phoneNo:String,socialMedia:String,email:String,modifier:Modifier=Modifier){
    Column(modifier=Modifier.fillMaxWidth(),verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {

        Text(

            text = phoneNo ,
            modifier=modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            maxLines=1,
        )
        Text(
            text = socialMedia,
            modifier=modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            maxLines=1

        )
        Text(
            text = email,
            modifier=modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            maxLines=1


        )
    }
    Column(){

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCardApp()
    }
}