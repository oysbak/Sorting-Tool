import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val firstCharacter = scanner.next().first().toLowerCase()
    val secondCharacter = scanner.next().first().toLowerCase()
    print(firstCharacter == secondCharacter)
}
