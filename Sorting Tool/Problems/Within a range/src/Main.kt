import java.util.*

fun main() {
    // write your code here
    val numbers = List<Int>(5) { readLine()!!.toInt() }
    println(numbers[4] in numbers[0]..numbers[1] || numbers[4] in numbers[2]..numbers[3])
}