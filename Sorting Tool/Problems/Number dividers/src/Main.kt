fun main() {
    // put your code here
    val number = readLine()!!.toInt()
    for (i in arrayOf(2, 3, 5, 6)) {
        if (number % i == 0) {
            println("Divided by $i")
        }
    }
}
