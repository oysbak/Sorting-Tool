import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()

    // put your code here
    var output = a
    if (b > a) output = b
    print(output)
}
