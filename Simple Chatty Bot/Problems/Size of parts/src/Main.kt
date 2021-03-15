import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    var size: Int
    var smaller = 0
    var perfect = 0
    var larger = 0

    repeat(scanner.nextInt()) {
        size = scanner.nextInt()
        when (size) {
            -1 -> smaller++
            0 -> perfect++
            1 -> larger++
        }
    }

    println("$perfect $larger $smaller")
}
