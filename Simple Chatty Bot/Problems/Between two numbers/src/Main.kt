import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val value = scanner.nextInt()
    val rangeFrom = scanner.nextInt()
    val rangeTo = scanner.nextInt()

    print(value in rangeFrom..rangeTo)
}
