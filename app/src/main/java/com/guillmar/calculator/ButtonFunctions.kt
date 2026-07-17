package com.guillmar.calculator

import android.content.Context
import androidx.compose.runtime.MutableState

fun onClickBtnNumbers(myContext: Context, num: String, dis: MutableState<String>) {
    if(dis.value == "0") {
        if(num == ".") {
            dis.value += num
            return
        }
        if(num != "0") dis.value = num
        return
    }
    if(num == "." && dis.value.contains(".")) return
    dis.value += num
}
fun onClickBtnType(myContext: Context, type: String, dis: MutableState<String>) {
    when (type) {
        "C" -> {
            dis.value = "0"
            return
        }
        "=" -> {
            dis.value = CalculateString(dis.value, myContext).toString()
            return
        }
        "+" -> {}
        "-" -> {}
        "/" -> {}
        "x" -> {}
    }
    if(dis.value == "0") {
        if(type == ".") return
        if(type != "0") dis.value = type
        return
    }
    if(type == "." && dis.value.contains(".")) return
    dis.value += type
}