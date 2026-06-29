package com.guillmar.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.guillmar.calculator.ui.theme.CalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorTheme() {
                Column(
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.background)
                        .fillMaxSize()
                ) {
                    BtnNumbers()
                }
            }
        }
    }
}

@Composable
fun BtnNumbers() {
    Column() {
        Row() {
            Button(
                onClick = { OnClickBtnNumbers(1) },
                modifier = Modifier
                    .size(100.dp)
            ) { Text("1") }
            Button(
                onClick = { OnClickBtnNumbers(2) },
                modifier = Modifier
                    .size(100.dp)
            ) { Text("2") }
            Button(
                onClick = { OnClickBtnNumbers(3) },
                modifier = Modifier
                    .size(100.dp)
            ) { Text("3") }
        }
    }
}

fun OnClickBtnNumbers(num: Int) {}