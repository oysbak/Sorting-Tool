import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val username = scanner.next()
    if (username == "HIDDEN") {
        greeting()
    } else {
        greeting(username)
    }
}

fun greeting(userName: String = "secret user") {
    println("Hello, $userName!")
}
