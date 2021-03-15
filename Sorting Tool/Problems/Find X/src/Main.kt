fun main() {
    // put your code here
    val scanner = java.util.Scanner(System.`in`)
    val (a, b, c) = DoubleArray(3) { scanner.nextDouble() }
    println((c - b) / a)
}