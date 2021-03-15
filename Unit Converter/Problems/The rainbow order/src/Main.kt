fun main(args: Array<String>) {
    val color = readLine()!!
    // put your code here

    // I really don't understand the purpose of this exercise...
    println(Rainbow.valueOf(color.toUpperCase()).ordinal + 1)
}

enum class Rainbow {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}
