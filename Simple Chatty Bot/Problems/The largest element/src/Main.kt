import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var i = scanner.nextInt()
    var greatest = i
    while (i != 0) {
        i = scanner.nextInt()
        greatest = if (i > greatest) i else greatest
    }
    println(greatest)
}
