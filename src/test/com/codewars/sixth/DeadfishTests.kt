package test.com.codewars.sixth

import main.com.codewars.sixth.DeadfishInterpreter
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DeadfishTests {

    @Test
    fun exampleTests() {
        val deadfishInterpretor: DeadfishInterpreter = DeadfishInterpreter()
        assertEquals(listOf(8, 64), deadfishInterpretor.parse("iiisdoso"))
        assertEquals(listOf(8, 64, 3600), deadfishInterpretor.parse("iiisdosodddddiso"))
    }

}