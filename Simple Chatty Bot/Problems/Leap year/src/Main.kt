import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val year = scanner.nextInt()
    var output = "Regular"
    if (year % 4 == 0 && year % 100 != 0) {
        output = "Leap"
    }
    if (year % 400 == 0) {
        output = "Leap"
    }
    print(output)
}
