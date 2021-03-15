import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    var amount = 0
    var balance = scanner.nextInt()
    var message: String = ""
    while (scanner.hasNextInt()) {
        amount = scanner.nextInt()
        if (amount <= balance) {
            balance -= amount
            message = "Thank you for choosing us to manage your account! You have $balance money."
        } else {
            message = "Error, insufficient funds for the purchase. You have $balance, but you need $amount."
        }
    }
    println(message)
}
