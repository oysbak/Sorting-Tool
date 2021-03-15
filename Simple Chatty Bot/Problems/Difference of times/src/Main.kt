import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val h1 = scanner.next().toInt()
    val m1 = scanner.next().toInt()
    val s1 = scanner.next().toInt()

    val h2 = scanner.next().toInt()
    val m2 = scanner.next().toInt()
    val s2 = scanner.next().toInt()

    println(totalSeconds(h2, m2, s2) - totalSeconds(h1, m1, s1))
}

fun totalSeconds(hours: Int, minutes: Int, seconds: Int): Int = hours * 3600 + minutes * 60 + seconds


