import java.util.*

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    var maxNumber = 0
    repeat(scanner.nextInt()) {
        val number = scanner.nextInt()
        if (number % 4 == 0 && number > maxNumber) {
            maxNumber = number
        }
    }
    println(maxNumber)
}