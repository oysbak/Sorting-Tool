// write your code here
fun divide(n1: Long, n2: Long): Double = n1 / n2.toDouble()

/* Do not change code below */
fun main() {
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    println(divide(a, b))
}