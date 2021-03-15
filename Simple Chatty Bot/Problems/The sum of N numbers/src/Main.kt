import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    var sum = 0
    val n = scanner.nextInt()
    for (i in 1..n) {
        sum += scanner.nextInt()
    }
    print(sum)
}
