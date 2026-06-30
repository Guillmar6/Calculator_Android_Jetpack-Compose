package com.guillmar.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.guillmar.calculator.ui.theme.CalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var displayNums by remember { mutableStateOf("0") }
            CalculatorTheme() {
                Column(
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.background)
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.End
                ) {
                    Text(
                        displayNums,
                        color = MaterialTheme.colorScheme.secondary,
                        fontSize = 100.sp,
                        modifier = Modifier
                    )
                    BtnNumbers()
                }
            }
        }
    }
}

@Composable
fun BtnNumbers() {
    val modifierWeight = 1f
    val modifierAspectRatio = 1f
    val textSize = 12.sp
    Column(
        modifier = Modifier
            .aspectRatio(1f / 1.25f)
    ) {
        Row() {
            Button(
                onClick = {
                    onClickBtnType('C')
                },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) {
                Text(
                    "C",
                    fontSize = textSize
                )
            }
            Button(
                onClick = {
                    onClickBtnType('n')
                },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) {
                Text(
                    "-/+",
                    fontSize = textSize
                )
            }
            Button(
                onClick = {
                    onClickBtnType('%')
                },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) {
                Text(
                    "%",
                    fontSize = textSize
                )
            }
            Button(
                onClick = {
                    onClickBtnType('/')
                },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) {
                Text(
                    "/",
                    fontSize = textSize
                )
            }
        }

        Row() {
            Button(
                onClick = { onClickBtnNumbers(7) },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) { Text(
                "7",
                fontSize = textSize
            ) }
            Button(
                onClick = { onClickBtnNumbers(8) },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) { Text(
                "8",
                fontSize = textSize
            ) }
            Button(
                onClick = { onClickBtnNumbers(9) },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) {
                Text(
                    "9",
                    fontSize = textSize
                ) }
            Button(
                onClick = { onClickBtnType('x') },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) {
                Text(
                    "x",
                    fontSize = textSize
                )
            }
        }

        Row() {
            Button(
                onClick = { onClickBtnNumbers(4) },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) { Text(
                "4",
                fontSize = textSize
            ) }
            Button(
                onClick = { onClickBtnNumbers(5) },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) { Text(
                "5",
                fontSize = textSize
            ) }
            Button(
                onClick = { onClickBtnNumbers(6) },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) { Text(
                "6",
                fontSize = textSize
            ) }
            Button(
                onClick = { onClickBtnType('-') },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) {
                Text(
                    "-",
                    fontSize = textSize
                )
            }
        }

        Row() {
            Button(
                onClick = { onClickBtnNumbers(1) },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) { Text(
                "1",
                fontSize = textSize
            ) }
            Button(
                onClick = { onClickBtnNumbers(2) },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) { Text(
                "2",
                fontSize = textSize
            ) }
            Button(
                onClick = { onClickBtnNumbers(3) },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) { Text(
                "3",
                fontSize = textSize
            ) }
            Button(
                onClick = { onClickBtnType('+') },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) {
                Text(
                    "+",
                    fontSize = textSize
                )
            }
        }

        Row() {
            Button(
                onClick = { onClickBtnNumbers(0) },
                modifier = Modifier
                    .weight(2f)
                    .aspectRatio(1f / 0.5f)
            ) { Text(
                "0",
                fontSize = textSize
            ) }
            Button(
                onClick = { onClickBtnDec(".") },
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
            ) { Text(
                ".",
                fontSize = textSize
            ) }
            Button(
                onClick = { onClickBtnType('=') },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) {
                Text(
                    "=",
                    fontSize = textSize
                )
            }
        }
    }
}

fun onClickBtnNumbers(num: Int) {}
fun onClickBtnDec(dec: String) {}
fun onClickBtnType(type: Char) {}