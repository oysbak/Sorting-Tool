fun main() {
    // write your code here
    val inputWord = readLine()!!
    var wordReversed = ""
    for (c in inputWord.lastIndex downTo 0) {
        wordReversed += inputWord[c]
    }
    println(if (inputWord == wordReversed) "yes" else "no")
}