fun main() {
    // put your code here
    var sum = 0
    readLine()!!.toCharArray().forEach { sum += it.toInt() - 48 }
    print(sum)
}