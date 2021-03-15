import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val n = scanner.nextInt()
    var current = scanner.nextInt()
    var length = 1
    var previous = current
    var recordLength = 1
    for (i in 2..n) {
        current = scanner.nextInt()
        if (current >= previous) {
            length++
        }
        if (previous > current || i == n) {
            if (length > recordLength) {
                recordLength = length
                length = 1
            }
        }
        previous = current
    }
    print(recordLength)
}
