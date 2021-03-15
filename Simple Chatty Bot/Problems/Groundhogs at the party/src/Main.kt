import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val noOfCups = scanner.nextInt()
    val isWeekend = scanner.nextBoolean()
    var isSuccessful = false

    if (isWeekend && noOfCups >= 15 && noOfCups <= 25) {
        isSuccessful = true
    }
    if (!isWeekend && noOfCups >= 10 && noOfCups <= 20) {
        isSuccessful = true
    }
    println(isSuccessful)
}
