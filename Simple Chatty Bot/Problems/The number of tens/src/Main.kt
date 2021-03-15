import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val number: String = scanner.next()
    if (number.length >= 2) {
        println(number.reversed().toCharArray()[1])
    } else {
        println("0")
    }
}
