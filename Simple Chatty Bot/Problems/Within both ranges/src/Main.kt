import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val firstRangeFrom = scanner.nextInt()
    val firstRangeTo = scanner.nextInt()
    val secondRangeFrom = scanner.nextInt()
    val secondRangeTo = scanner.nextInt()
    val fifthNumber = scanner.nextInt()

    print(fifthNumber in firstRangeFrom..firstRangeTo && fifthNumber in secondRangeFrom..secondRangeTo)
}
