package test.com.codewars.seventh

import main.com.codewars.seventh.Evaporator
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EvaporatorTests {


    val evaporator: Evaporator = Evaporator()
    @Test
    fun testFixed() {
        assertEquals(22, evaporator.evaporator(10.0,10.0,10.0))
        assertEquals(29, evaporator.evaporator(10.0,10.0,5.0))
        assertEquals(59, evaporator.evaporator(100.0,5.0,5.0))

    }
}