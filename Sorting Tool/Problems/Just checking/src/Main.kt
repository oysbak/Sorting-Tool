import java.util.*

fun main() {
    // write your code here
    val input = Scanner(System.`in`)
    val numbers = IntArray(input.nextInt()) { input.nextInt() }
    val n = input.nextInt()
    val m = input.nextInt()
    var message = "NO"
    for (i in 0..numbers.size - 2) {
        if (numbers[i] == n && numbers[i + 1] == m || numbers[i] == m && numbers[i + 1] == n
        ) {
            message = "YES"
        }
    }
    println(message)
}
