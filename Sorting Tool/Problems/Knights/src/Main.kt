import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()

    println(if (Math.abs(x2 - x1) * Math.abs(y2 - y1) == 2) "YES" else "NO")
}