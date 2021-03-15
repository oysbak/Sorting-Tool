fun main() {
//    println(fibonacci(1))
//    println(fibonacci(2))
//    println(fibonacci(3))
//    println(fibonacci(4))
//    println(fibonacci(5))
//    println(fibonacci(6))
//    println(fibonacci(7))
//    println(fibonacci(8))
    println(fibonacci(17))
}

fun fibonacci(i: Int): Int {
    if (i <= 2) return i - 1
    return fibonacci(i - 1) + fibonacci(i - 2)
}
