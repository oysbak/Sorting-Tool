import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val color = input.next()
    println(Rainbow.exists(color))
}

enum class Rainbow {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET;

    companion object {
        fun exists(color: String) = Rainbow.values().any { it.name == color.toUpperCase() }
    }
}
