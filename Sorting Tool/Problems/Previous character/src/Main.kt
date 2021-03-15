fun main() {
    // write your code here
    for (c in CharArray(4) { readLine()!!.first() }) {
        println(c - 1)
    }
}