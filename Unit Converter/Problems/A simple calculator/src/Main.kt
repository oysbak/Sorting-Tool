import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val num1 = scanner.nextLong()
    val op = scanner.next()
    val num2 = scanner.nextLong()

    when (op) {
        "+" -> println(num1 + num2)
        "-" -> println(num1 - num2)
        "*" -> println(num1 * num2)
        "/" -> {
            if (num2 == 0L) {
                println("Division by 0!")
            } else {
                println(num1 / num2)
            }
        }
        else -> println("Unknown operator")
    }
}
