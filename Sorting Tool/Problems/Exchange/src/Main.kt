fun main() {
    // put your code here
    val string = readLine()!!
    println(string.last() + string.substring(1 until string.lastIndex) + string.first())
}