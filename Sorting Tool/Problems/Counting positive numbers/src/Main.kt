import java.util.*

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    println(IntArray(scanner.nextInt()) { scanner.nextInt() }.count { it > 0 })
}