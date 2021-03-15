fun main() {
    // write your code here
    when (readLine()) {
        "triangle" -> {
            val (a, b, c) = DoubleArray(3) { readLine()!!.toDouble() }
            // using Heron's formula
            val p = (a + b + c) / 2
            println(Math.sqrt(p * (p - a) * (p - b) * (p - c)))
        }
        "rectangle" -> {
            val (a, b) = DoubleArray(2) { readLine()!!.toDouble() }
            println(a * b)
        }
        "circle" -> {
            val r = readLine()!!.toDouble()
            println(3.14 * r * r)
        }
    }
}