package com.guillmar.calculator

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.guillmar.calculator.ui.theme.CalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val myContext = LocalContext.current
            val displayScrollState = rememberScrollState()
            var displayNums: MutableState<String> = remember { mutableStateOf("0") }

            LaunchedEffect(displayNums.value) {
                displayScrollState.animateScrollTo(displayScrollState.maxValue)
            }

            CalculatorTheme() {
                Column(
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.background)
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.End
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Text(
                            displayNums.value,
                            color = MaterialTheme.colorScheme.secondary,
                            fontSize = 100.sp,
                            textAlign = TextAlign.End,
                            maxLines = 1,
                            modifier = Modifier
                                .background(Color.Blue)
                                .fillMaxWidth()
                                .weight(1f)
                                .horizontalScroll(displayScrollState)
                        )
                        BtnNumbers(myContext, displayNums)
                    }
                }
            }
        }
    }
}

@Composable
fun BtnNumbers(myContext: Context, dis: MutableState<String>) {
    val modifierWeight = 1f
    val modifierAspectRatio = 1f
    val textSize = 12.sp
    Column(
        modifier = Modifier
            .aspectRatio(1f / 1.25f)
            .background(Color.Cyan)
    ) {
        Spacer(
            modifier = Modifier
                .height(10.dp)
        )
        Row() {
            Spacer(
                modifier = Modifier
                    .width(10.dp)
            )
            Button(
                onClick = {
                    onClickBtnType(myContext, 'C', dis)
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
            Spacer(
                modifier = Modifier
                    .width(10.dp)
            )
            Button(
                onClick = {
                    onClickBtnType(myContext, 'n', dis)
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
            Spacer(
                modifier = Modifier
                    .width(10.dp)
            )
            Button(
                onClick = {
                    onClickBtnType(myContext, '%', dis)
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
            Spacer(
                modifier = Modifier
                    .width(10.dp)
            )
            Button(
                onClick = {
                    onClickBtnType(myContext, '/', dis)
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
            Spacer(
                modifier = Modifier
                    .width(10.dp)
            )
        }
        Spacer(
            modifier = Modifier
                .height(10.dp)
        )
        Row() {
            Spacer(
                modifier = Modifier
                    .width(10.dp)
            )
            Button(
                onClick = { onClickBtnNumbers(myContext, "7", dis) },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) { Text(
                "7",
                fontSize = textSize
            ) }
            Spacer(
                modifier = Modifier
                    .width(10.dp)
            )
            Button(
                onClick = { onClickBtnNumbers(myContext, "8", dis) },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) { Text(
                "8",
                fontSize = textSize
            ) }
            Spacer(
                modifier = Modifier
                    .width(10.dp)
            )
            Button(
                onClick = { onClickBtnNumbers(myContext, "9", dis) },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) {
                Text(
                    "9",
                    fontSize = textSize
                )
            }
            Spacer(
                modifier = Modifier
                    .width(10.dp)
            )
            Button(
                onClick = { onClickBtnType(myContext, 'x', dis) },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) {
                Text(
                    "x",
                    fontSize = textSize
                )
            }
            Spacer(
                modifier = Modifier
                    .width(10.dp)
            )
        }
        Spacer(
            modifier = Modifier
                .height(10.dp)
        )
        Row() {
            Spacer(
                modifier = Modifier
                    .width(10.dp)
            )
            Button(
                onClick = { onClickBtnNumbers(myContext, "4", dis) },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) { Text(
                "4",
                fontSize = textSize
            ) }
            Spacer(
                modifier = Modifier
                    .width(10.dp)
            )
            Button(
                onClick = { onClickBtnNumbers(myContext, "5", dis) },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) { Text(
                "5",
                fontSize = textSize
            ) }
            Spacer(
                modifier = Modifier
                    .width(10.dp)
            )
            Button(
                onClick = { onClickBtnNumbers(myContext, "6", dis) },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) { Text(
                "6",
                fontSize = textSize
            ) }
            Spacer(
                modifier = Modifier
                    .width(10.dp)
            )
            Button(
                onClick = { onClickBtnType(myContext, '-', dis) },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) {
                Text(
                    "-",
                    fontSize = textSize
                )
            }
            Spacer(
                modifier = Modifier
                    .width(10.dp)
            )
        }
        Spacer(
            modifier = Modifier
                .height(10.dp)
        )
        Row() {
            Spacer(
                modifier = Modifier
                    .width(10.dp)
            )
            Button(
                onClick = { onClickBtnNumbers(myContext, "1", dis) },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) { Text(
                "1",
                fontSize = textSize
            ) }
            Spacer(
                modifier = Modifier
                    .width(10.dp)
            )
            Button(
                onClick = { onClickBtnNumbers(myContext, "2", dis) },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) { Text(
                "2",
                fontSize = textSize
            ) }
            Spacer(
                modifier = Modifier
                    .width(10.dp)
            )
            Button(
                onClick = { onClickBtnNumbers(myContext, "3", dis) },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) { Text(
                "3",
                fontSize = textSize
            ) }
            Spacer(
                modifier = Modifier
                    .width(10.dp)
            )
            Button(
                onClick = { onClickBtnType(myContext, '+', dis) },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) {
                Text(
                    "+",
                    fontSize = textSize
                )
            }
            Spacer(
                modifier = Modifier
                    .width(10.dp)
            )
        }
        Spacer(
            modifier = Modifier
                .height(10.dp)
        )
        Row() {
            Spacer(
                modifier = Modifier
                    .width(10.dp)
            )
            Button(
                onClick = { onClickBtnNumbers(myContext, "0", dis) },
                modifier = Modifier
                    .weight(2f)
                    .aspectRatio(1f / 0.5f)
            ) { Text(
                "0",
                fontSize = textSize
            ) }
            Spacer(
                modifier = Modifier
                    .width(10.dp)
            )
            Button(
                onClick = { onClickBtnNumbers(myContext, ".", dis) },
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
            ) { Text(
                ".",
                fontSize = textSize
            ) }
            Spacer(
                modifier = Modifier
                    .width(10.dp)
            )
            Button(
                onClick = { onClickBtnType(myContext, '=', dis) },
                modifier = Modifier
                    .weight(modifierWeight)
                    .aspectRatio(modifierAspectRatio)
            ) {
                Text(
                    "=",
                    fontSize = textSize
                )
            }
            Spacer(
                modifier = Modifier
                    .width(10.dp)
            )
        }
        Spacer(
            modifier = Modifier
                .height(10.dp)
        )
    }
}

fun onClickBtnNumbers(myContext: Context, num: String, dis: MutableState<String>) {
    if(dis.value == "0") {
        if(num == ".") return
        if(num != "0") dis.value = num
        return
    }
    if(num == "." && dis.value.contains(".")) return
    dis.value += num
}
fun onClickBtnType(myContext: Context, type: Char, dis: MutableState<String>) {
    when {
        type == 'C' -> {dis.value = "0"}
        type == '=' -> {}
        type == '+' -> {}
        type == '-' -> {}
        type == '/' -> {}
        type == 'x' -> {}
    }
}