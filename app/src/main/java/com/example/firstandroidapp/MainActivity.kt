package com.example.firstandroidapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import com.example.firstandroidapp.ui.theme.FirstAndroidAppTheme
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MYLOG", "onCreate")
        enableEdgeToEdge()
        setContent {
            FirstAndroidAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(red = 0.3f, green = 0.3f, blue = 0.3f)
                ) {
                    MyCard()
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("MYLOG", "onStart")
    }

    override fun onResume() {
        Log.d("MYLOG", "onResume")
        super.onResume()
    }
    override fun onPause() {
        super.onPause()
        Log.d("MYLOG", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MYLOG", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MYLOG", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MYLOG", "onRestart")
    }
}



@Composable
fun MyCard() {
    Box(
        modifier = Modifier.fillMaxSize() // Занимает весь экран
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(start = 10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            val image = painterResource(R.drawable.cpp)
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
            )
            Text(
                text = stringResource(R.string.my_name),
                modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 35.sp
            )
            Text(
                text = stringResource(R.string.cpp_developer),
                fontSize = 20.sp
            )

//        Text(
//            text = "Телефон: +79213591464",
//            modifier = Modifier.padding(top = 100.dp, bottom = 8.dp),
//        )
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp) // Добавим небольшой отступ от краев экрана
        ) {

            // Основной контейнер для двух колонок
            Row(
                modifier = Modifier
                    .align(Alignment.BottomCenter) // Выравнивание по нижнему центру
                    .fillMaxWidth(), // Заполняет всю ширину экрана
                horizontalArrangement = Arrangement.Center, // Центрируем все содержимое в строке
            ) {
                // Первая колонка с иконками
                Column(
                    modifier = Modifier
                        .weight(0.8f)// Занимает 50% ширины экрана
                        .align(Alignment.CenterVertically) // Выравниваем по центру по вертикали
                        .padding(end = 16.dp) // Отступ справа
                ) {
                    Row(
                        modifier = Modifier
                            .padding(vertical = 5.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        val image = painterResource(R.drawable.phone)
                        Image(
                            painter = image,
                            contentDescription = null,
                            modifier = Modifier
                                .size(25.dp) // Устанавливаем размер изображения
                                .padding(end = 5.dp) // Отступ между картинкой и текстом
                        )
                    }
                    Row(
                        modifier = Modifier
                            .padding(vertical = 5.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        val image = painterResource(R.drawable.telegram)
                        Image(
                            painter = image,
                            contentDescription = null,
                            modifier = Modifier
                                .size(25.dp)
                                .padding(end = 5.dp)
                        )
                    }
                    Row(
                        modifier = Modifier
                            .padding(vertical = 5.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        val image = painterResource(R.drawable.mail)
                        Image(
                            painter = image,
                            contentDescription = null,
                            modifier = Modifier
                                .size(25.dp)
                                .padding(end = 5.dp)
                        )
                    }
                }

                // Вторая колонка с текстами
                Column(
                    modifier = Modifier
                        .weight(1.2f) // Занимает 50% ширины экрана
                        .align(Alignment.CenterVertically) // Центрируем по вертикали
                        //.padding(start = 16.dp) // Отступ слева
                ) {
                    Row(
                        modifier = Modifier
                            .padding(5.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start // Центрируем текст
                    ) {
                        Text(
                            text = stringResource(R.string.phone_text),
                            textAlign = TextAlign.Center,
                            fontSize = 16.sp
                        )
                    }
                    Row(
                        modifier = Modifier
                            .padding(5.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Text(
                            text = stringResource(R.string.tg_text),
                            textAlign = TextAlign.Center,
                            fontSize = 16.sp
                        )
                    }
                    Row(
                        modifier = Modifier
                            .padding(5.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Text(
                            text = stringResource(R.string.mail_text),
                            textAlign = TextAlign.Center,
                            fontSize = 16.sp
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = message,
            fontSize = 70.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center,
            color = Color.White
        )
        Text(
            text = from,
            fontSize = 36.sp,
            color = Color.White,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FirstAndroidAppTheme {
        MyCard()
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.fon);
    Box(modifier) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Greeting(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}
