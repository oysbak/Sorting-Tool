import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val number = scanner.next().toDouble()
    println(Math.cbrt(number).toLong())
}
