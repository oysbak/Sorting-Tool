fun main() {
    // write your code here
    for (i in readLine()!!.toInt()..readLine()!!.toInt()) {
        when {
            i % 3 == 0 && i % 5 == 0 -> println("FizzBuzz")
            i % 5 == 0 -> println("Buzz")
            i % 3 == 0 -> println("Fizz")
            else -> println(i)
        }
    }
}