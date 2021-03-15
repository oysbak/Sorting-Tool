import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val i = scanner.nextInt()
    val j = scanner.nextInt()
    val k = scanner.nextInt()
    print(i != j && i != k && j != k)
}
