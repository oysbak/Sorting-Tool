fun main() {
    // put your code here
    println(
        when (readLine()!!.toInt()) {
            in arrayOf(0, 1, 2, 3, 5, 8, 13, 21, 34, 55) -> "F"
            in arrayOf(0, 1, 3, 6, 10, 15, 21, 28, 36, 45) -> "T"
            in arrayOf(1, 10, 100, 1_000, 10_000, 100_000) -> "P"
            else -> "N"
        }
    )
}