package sorting

import java.io.File
import java.util.*
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    // write your code here
    SortingApp(args).run()
}

class SortingApp(args: Array<String>) {
    val args = args
    var dataType = ""
    var sortingType = ""
    var inputFile = ""
    var outputFile = ""
    var dataTypeSwitch = false
    var sortingTypeSwitch = false
    var inputFileSwitch = false
    var outputFileSwitch = false

    fun run() {
        for (arg in args) {
            when {
                arg == "-dataType" -> dataTypeSwitch = true
                arg == "-sortingType" -> sortingTypeSwitch = true
                arg == "-inputFile" -> inputFileSwitch = true
                arg == "-outputFile" -> outputFileSwitch = true
                dataTypeSwitch -> {
                    dataType = arg
                    dataTypeSwitch = false
                }
                sortingTypeSwitch -> {
                    sortingType = arg
                    sortingTypeSwitch = false
                }
                inputFileSwitch -> {
                    inputFile = arg
                    inputFileSwitch = false
                }
                outputFileSwitch -> {
                    outputFile = arg
                    outputFileSwitch = false
                }
                else -> println("\"$arg\" is not a valid parameter. It will be skipped.")
            }
        }

        if (dataTypeSwitch && dataType == "") {
            println("No data type defined!")
        }

        if (sortingTypeSwitch && sortingType == "") {
            println("No sorting type defined!")
        }

        if (inputFileSwitch && inputFile == "") {
            println("No input file defined!")
        }

        if (outputFileSwitch && outputFile == "") {
            println("No output file defined!")
        }

        when (dataType) {
            "long" -> StatisticsNumbers(sortingType, inputFile, outputFile)
            "word" -> StatisticsWords(sortingType)
            "line" -> StatisticsLines(sortingType)
            else -> StatisticsNumbers(sortingType, inputFile, outputFile)
        }
    }

}

class StatisticsNumbers(sortingType: String, inputFile: String, val outputFile: String) {
    val numbers = if (inputFile == "") readNumbers() else readFile(inputFile)
    val count = numbers.size

    init {
        when (sortingType) {
            "byCount" -> sortByCount(numbers)
            "natural" -> sortNaturally(numbers)
            else -> sortNaturally(numbers) //errorHandling(sortingType)
        }
    }

    fun sortByCount(numbers: List<Int>) {
        presentln("Total numbers: $count.")
        val map = numbers.groupingBy { it }.eachCount()
        for ((key, value) in map.toList().sortedBy { (k, v) -> k }.sortedBy { (k, v) -> v }) {
            presentln("$key: $value time(s), ${(value * 100 / count.toDouble()).roundToInt()}%")
        }
    }

    private fun sortNaturally(numbers: List<Int>) {
        presentln("Total numbers: $count.")
        present("Sorted data: ")
        presentln(numbers.sorted().joinToString("   "))
    }

    private fun readFile(fileName: String): List<Int> {
        var input = File(fileName).readText().lines().joinToString(",").replace(" ", ",")
        while (input.contains(",,")) {
            input = input.replace(",,", ",")
        }
        return input.split(',').map { it.toInt() }
    }

    private fun readNumbers(): List<Int> {
        //return listOf(1, -2, 33, 4, 42, 1, 1)
        val scanner = Scanner(System.`in`)
        val numbers = mutableListOf<Int>()
        do {
            val n = scanner.next()
            if (n.toIntOrNull() == null) {
                presentln("\"$n\" is not a long. It will be skipped.")
            }
            numbers.add(n.toInt())
        } while (scanner.hasNext())
        return numbers
    }

    fun present(whatToPrint: String) {
        if (outputFile == "") {
            print(whatToPrint)
        } else {
            java.io.File(outputFile).appendText(whatToPrint)
        }
    }

    fun presentln(whatToPrint: String) {
        if (outputFile == "") {
            println(whatToPrint)
        } else {
            java.io.File(outputFile).appendText("$whatToPrint\n")
        }
    }
}

class StatisticsLines(sortingType: String) {
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
        println(words.sorted().joinToString("\n  "))
    }

    private fun readLines(): List<String> {
        val scanner = Scanner(System.`in`)
        val words = mutableListOf<String>()
        do {
            words.add(scanner.nextLine())
        } while (scanner.hasNextLine())
        return words
    }
}

class StatisticsWords(sortingType: String) {
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
        println(words.sorted().joinToString("   "))
    }

    private fun readWords(): List<String> {
        val scanner = Scanner(System.`in`)
        val words = mutableListOf<String>()
        do {
            words.add(scanner.next())
        } while (scanner.hasNext())
        return words
    }
}
