import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val text = scanner.nextLine()
    val number = scanner.nextInt()

    println("Symbol # $number of the string \"$text\" is '${text[number - 1]}'")
}
