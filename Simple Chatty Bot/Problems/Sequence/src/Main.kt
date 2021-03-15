import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val first = scanner.next().first()
    val second = scanner.next().first()
    val third = scanner.next().first()
    print(first + 1 == second && second + 1 == third)
}
