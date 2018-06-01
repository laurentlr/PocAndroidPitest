package com.russier.laurent.pocandroidpitest

import org.assertj.core.api.Assertions.assertThat
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.jetbrains.spek.api.dsl.xit
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
object CalculatorSpec : Spek({

    given("a calculator") {
        val calculator = Calculator()

        given("2 numbers") {
            val a = 1
            val b = 2

            on("sum") {
                val sum = calculator.sum(a, b)

                it("should return their sum") {
                    assertThat(sum).isEqualTo(3)
                }

                xit("should fail") {
                    assertThat(true).isFalse()
                }

            }
        }
    }
})