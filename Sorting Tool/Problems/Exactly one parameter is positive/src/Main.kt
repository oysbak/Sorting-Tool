fun main() {
    // put your code here
    val numbers = IntArray(3) { readLine()!!.toInt() }
    var noOfPositives = 0
    for (number in numbers) {
        noOfPositives += if (number > 0) 1 else 0
    }
    print(noOfPositives == 1)
}
