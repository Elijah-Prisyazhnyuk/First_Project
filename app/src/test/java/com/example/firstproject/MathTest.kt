package com.example.firstproject

import org.junit.Assert.assertEquals
import org.junit.Test

class MathTest {
    @Test
    fun addTest()
    {
        assertEquals(2, 1+1)
    }

    //Тест для функции деления
    @Test
    fun substractTest()
    {
        assertEquals(2, 4/2)
    }
}