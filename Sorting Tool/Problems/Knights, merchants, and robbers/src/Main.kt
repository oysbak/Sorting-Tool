fun main() {
    // write your code here
    val firstAnswer = readLine()!!.toBoolean()
    val secondAnswer = readLine()!!.toBoolean()
    val confession = readLine()!!.toBoolean()

    println(firstAnswer == secondAnswer && !confession)
}