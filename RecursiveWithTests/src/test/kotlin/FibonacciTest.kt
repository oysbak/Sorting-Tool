import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FibonacciTest {

    @Test
    fun fibonacci() {
        assertEquals(0, fibonacci(1))
        assertEquals(1, fibonacci(2))
        assertEquals(1, fibonacci(3))
        assertEquals(2, fibonacci(4))
        assertEquals(3, fibonacci(5))
        assertEquals(5, fibonacci(6))
        assertEquals(8, fibonacci(7))
    }
}
