fun main() {
    // Check the first character of the input
    // (I too wanted to be different😀)
    println(
        when (readLine()!!.first()) {
            '0' -> "zero"
            '-' -> "negative"
            else -> "positive"
        }
    )
}
