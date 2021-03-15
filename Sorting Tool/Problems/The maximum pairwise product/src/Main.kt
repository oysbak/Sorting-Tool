import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    var max = 0
    val size = scanner.nextInt()
    val numbers = IntArray(size)
    for (i in 0 until size) {
        numbers[i] = scanner.nextInt()
        max = if (numbers[i] > max) numbers[i] else max
    }
    var maxSum = 0
    for (number in numbers) {
        val sum = number * max
        maxSum = if (sum > maxSum) sum else maxSum
    }
    println(maxSum)
}
