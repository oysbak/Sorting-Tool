fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    println(
        if (a!! > c!!) {
            // put your code here
            if (a > b) a else if (b > c) b else c
        } else {
            // and here
            if (c > b) c else b
        }
    )
}