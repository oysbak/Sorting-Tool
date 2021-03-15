package sorting

import java.math.RoundingMode
import java.util.*
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    // write your code here
    val sortingType = when {
        args.contains("byCount") -> "byCount"
        else -> "natural"
    }
    when {
        args.contains("long") -> StatisticsNumbers(sortingType)
        args.contains("word") -> StatisticsWords(sortingType)
        args.contains("line") -> StatisticsLines(sortingType)
    }
}

fun pain() {
    // Testing

    println("- Numbers --------------")
    StatisticsNumbers("byCount")
    println("--------------------")
    StatisticsNumbers("natural")

    println("- Words ----------------")
    StatisticsWords("byCount")
    println("--------------------")
    StatisticsWords("natural")
    println("--------------------")

    println("- Lines ----------------")
    StatisticsLines("byCount")
    println("--------------------")
    StatisticsLines("natural")
    println("--------------------")
}

class StatisticsLines(val sortingType: String) {
    val lines = readLines()
    val count = lines.size

    init {
        println("Total lines: $count.")
        if (sortingType == "byCount") {
            sortByCount(lines)
        } else {
            sortNaturally(lines)
        }
    }

    fun sortByCount(words: List<String>) {
        val map = words.groupingBy { it }.eachCount()
        for ((key, value) in map.toList().sortedBy { (k, v) -> k }.sortedBy { (k, v) -> v }) {
            println("$key: $value time(s), ${(value * 100 / count.toDouble()).roundToInt()}%")
        }
    }

    private fun sortNaturally(words: List<String>) {
        println("Sorted data: ")
        println(words.sorted().joinToString("\n", "", ""))
    }

    private fun readLines(): List<String> {

        val scanner = Scanner(System.`in`)
        val words = mutableListOf<String>()
        do {
            words.add(scanner.nextLine())
        } while (scanner.hasNextLine())
        return words

        //return listOf("1 -2   33 4", "42", "1                 1")
    }
}

class StatisticsWords(val sortingType: String) {
    val words = readWords()
    val count = words.size

    init {
        println("Total words: $count.")
        if (sortingType == "byCount") {
            sortByCount(words)
        } else {
            sortNaturally(words)
        }
    }

    fun sortByCount(words: List<String>) {
        val map = words.groupingBy { it }.eachCount()
        for ((key, value) in map.toList().sortedBy { (k, v) -> k }.sortedBy { (k, v) -> v }) {
            println("$key: $value time(s), ${(value * 100 / count.toDouble()).roundToInt()}%")
        }
    }

    private fun sortNaturally(words: List<String>) {
        print("Sorted data: ")
        println(words.sorted().joinToString(" ", "", ""))
    }

    private fun readWords(): List<String> {

        val scanner = Scanner(System.`in`)
        val words = mutableListOf<String>()
        do {
            words.add(scanner.next())
        } while (scanner.hasNext())
        return words

        //return listOf("1", "-2", "33", "4", "42", "1", "1")
    }
}

class StatisticsNumbers(val sortingType: String) {
    val numbers = readNumbers()
    val count = numbers.size

    init {
        println("Total numbers: $count.")
        if (sortingType == "byCount") {
            sortByCount(numbers)
        } else {
            sortNaturally(numbers)
        }
    }

    fun sortByCount(numbers: List<Int>) {
        val map = numbers.groupingBy { it }.eachCount()
        for ((key, value) in map.toList().sortedBy { (k, v) -> k }.sortedBy { (k, v) -> v }) {
            println("$key: $value time(s), ${(value * 100 / count.toDouble()).roundToInt()}%")
        }
    }

    private fun sortNaturally(numbers: List<Int>) {
        print("Sorted data: ")
        println(numbers.sorted().joinToString(" ", "", ""))
    }

    private fun readNumbers(): List<Int> {

        val scanner = Scanner(System.`in`)
        val numbers = mutableListOf<Int>()
        do {
            numbers.add(scanner.nextInt())
        } while (scanner.hasNext())
        return numbers

        //return listOf(1, -2, 33, 4, 42, 1, 1)
    }
}
