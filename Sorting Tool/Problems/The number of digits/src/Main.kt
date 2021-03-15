fun main() {
    // put your code here
    val number = readLine()!!.toInt()
    print(
        when (number) {
            in 1 until 10 -> 1
            in 10 until 100 -> 2
            in 100 until 1_000 -> 3
            in 1_000 until 10_000 -> 4
            else -> 0
        }
    )
}