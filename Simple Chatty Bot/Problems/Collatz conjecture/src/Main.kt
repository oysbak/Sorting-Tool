import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var n = scanner.nextInt()
    print(n)
    while (n > 1) {
        if (n % 2 == 0) {
            n = n / 2
        } else {
            n = 3 * n + 1
        }
        print(" $n")
    }
}
