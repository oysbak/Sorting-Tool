import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class ProbabilityTest {

    @Test
    fun isCertainTest() {
        assertTrue(Probability(1.0).isCertain())
    }
}
