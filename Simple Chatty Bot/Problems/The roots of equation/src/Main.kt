import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    val d = scanner.nextInt()

    for (x in 1..1000) {
        if (a * x * x * x + b * x * x + c * x + d == 0) {
            println(x)
        }
    }
}
