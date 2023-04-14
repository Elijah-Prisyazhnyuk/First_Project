package com.example.firstproject

import kotlin.math.roundToInt

class Pricing {
}

fun main() {
    val num = 12.5493
    println("roundToInt: " + ((num * 100.0).roundToInt() / 100.0).toString())
}