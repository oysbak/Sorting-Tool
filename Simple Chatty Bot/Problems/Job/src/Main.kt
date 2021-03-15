import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val juliasAge = scanner.nextInt()
    print(juliasAge in 18..59)
}
