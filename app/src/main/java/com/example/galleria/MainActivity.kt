package com.example.galleria

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.galleria.ui.theme.GalleriaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GalleriaTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {

                }
            }
        }
    }
}
@Composable
fun MolduraImagem(
    idImage:Int,
    idDescricao:Int
)
{
    Card() {
   Column() {
      Image(
          painter = painterResource(id =idImage),
          contentDescription =null,

      )
       Text(
           text = stringResource(idDescricao),
           fontSize = 22.sp,
           fontFamily = FontFamily.Monospace,
           textAlign = TextAlign.Center,
           fontWeight = FontWeight.Black

           )

       
   }
        
    }

}
@Preview
@Composable
fun PreviewMoldura(){

    MolduraImagem(
        idImage =R.drawable.gaaaatoooooo,
        idDescricao = R.string.descricao_imagem
    )
    MolduraImagem(
        idImage =R.drawable.gaaaat,
        idDescricao = R.string.descricao_imagem
    )

}