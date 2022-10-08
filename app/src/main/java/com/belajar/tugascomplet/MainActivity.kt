package com.belajar.tugascomplet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.belajar.tugascomplet.ui.theme.TugasCompletTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TugasCompletTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TugasCompleteGambar()
                }
            }
        }
    }
}

@Composable
fun TugasCompleteGambar() {
    val image = painterResource(id = R.drawable.ic_task_completed)

    Column (content = {
        Image(painter = image, contentDescription = null)
        Text(text = stringResource(id = R.string.task_completed),
            fontSize = 24.sp,
            modifier = Modifier.padding(0.dp,24.dp,0.dp,8.dp)
        )
        Text(text = stringResource(id = R.string.nice_work),
            fontSize = 24.sp
        )
    }, modifier = Modifier.fillMaxHeight().fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center)

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TugasCompletPreview() {
    TugasCompletTheme {
        TugasCompleteGambar()
    }
}