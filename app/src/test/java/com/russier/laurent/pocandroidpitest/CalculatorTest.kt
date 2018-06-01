package com.russier.laurent.pocandroidpitest

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class CalculatorTest {

    @Test
    fun multiplication() {
        val calculator = Calculator()

        val res = calculator.multiplication(2, 2)

        assertThat(res).isEqualTo(4)
    }
}