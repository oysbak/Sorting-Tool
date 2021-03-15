import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val noOfGrades = scanner.nextInt()
    var noOfDs = 0
    var noOfCs = 0
    var noOfBs = 0
    var noOfAs = 0

    var nextGrade = 0

    repeat(noOfGrades) {
        nextGrade = scanner.nextInt()
        if (nextGrade == 2) noOfDs++
        if (nextGrade == 3) noOfCs++
        if (nextGrade == 4) noOfBs++
        if (nextGrade == 5) noOfAs++
    }

    println("$noOfDs $noOfCs $noOfBs $noOfAs")
}
