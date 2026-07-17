package com.guillmar.calculator

import android.content.Context
import java.util.Stack

fun CalculateString(numbers: String?, myContext: Context): Double {
    if(numbers == null || numbers.isEmpty() || numbers == "0") return 0.0

    val stack = Stack<Double>()
    var currentNumber: Double = 0.0
    var lastOperator: Char = '+'

    for(i in 1..numbers.length) {
        if(Character.isDigit(numbers.get(i - 1))) {
            currentNumber = currentNumber * 10 + (numbers.get(i - 1).digitToInt())
        }
        if(!Character.isDigit(numbers.get(i - 1)) || i == numbers.length) {
            if(lastOperator == '+') {
                stack.push(currentNumber)
            } else if(lastOperator == '-') {
                stack.push(-currentNumber)
            } else if(lastOperator == '*') {
                stack.push(stack.pop() * currentNumber)
            } else if(lastOperator == '/') {
                stack.push(stack.pop() / currentNumber)
            }
            lastOperator = numbers.get(i - 1)
            currentNumber = 0.0
        }
    }

    var result: Double = 0.0
    while(!stack.isEmpty()) {
        result += stack.pop()
    }
    return result
}