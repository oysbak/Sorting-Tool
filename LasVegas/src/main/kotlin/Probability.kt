class Probability (private val fraction: Double) {
    fun isCertain(): Boolean {
        return fraction >= 1
    }
}
