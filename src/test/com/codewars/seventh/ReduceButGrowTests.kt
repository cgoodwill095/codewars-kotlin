package test.com.codewars.seventh

import main.com.codewars.seventh.ReduceButGrow
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class ReduceButGrowTests {

    var reduceButGrow : ReduceButGrow = ReduceButGrow();

    @Test
    fun exampleTests() {
        assertEquals(6, reduceButGrow.grow(intArrayOf(1, 2, 3)))
        assertEquals(16, reduceButGrow.grow(intArrayOf(4, 1, 1, 1, 4)))
        assertEquals(64, reduceButGrow.grow(intArrayOf(2, 2, 2, 2, 2, 2)))
    }
}