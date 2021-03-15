package converter

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    do {
        print("Enter what you want to convert (or exit): ")
        val request: String = scanner.next().toLowerCase()

        if (request != "exit") {

            // Read input data
            val amountFrom = request.toDouble()
            var unitFrom = scanner.next()
            val fillWord = scanner.next()
            var unitTo = scanner.next()

            var amountFromBase = 0.0
            var amountTo = 0.0
            var isLength = false
            var isMass = false
            var isImpossible = false

            var displayTextStart: String = ""
            var displayTextEnd: String = ""

            // Convert to base unit
            when (unitFrom.toLowerCase()) {
                // Lengths:
                "m", "meter", "meters" -> {
                    isLength = true
                    unitFrom = "meters"
                    amountFromBase = amountFrom * 1.0
                    displayTextStart = getFromDisplayText(amountFrom, unitFrom, "meter")
                }
                "km", "kilometer", "kilometers" -> {
                    isLength = true
                    unitFrom = "kilometers"
                    amountFromBase = amountFrom * 1000
                    displayTextStart = getFromDisplayText(amountFrom, unitFrom, "kilometer")
                }
                "cm", "centimeter", "centimeters" -> {
                    isLength = true
                    unitFrom = "centimeters"
                    amountFromBase = amountFrom * 0.01
                    displayTextStart = getFromDisplayText(amountFrom, unitFrom, "centimeter")
                }
                "mm", "millimeter", "millimeters" -> {
                    isLength = true
                    unitFrom = "millimeters"
                    amountFromBase = amountFrom * 0.001
                    displayTextStart = getFromDisplayText(amountFrom, unitFrom, "millimeter")
                }
                "mi", "mile", "miles" -> {
                    isLength = true
                    unitFrom = "miles"
                    amountFromBase = amountFrom * 1609.35
                    displayTextStart = getFromDisplayText(amountFrom, unitFrom, "mile")
                }
                "yd", "yard", "yards" -> {
                    isLength = true
                    unitFrom = "yards"
                    amountFromBase = amountFrom * 0.9144
                    displayTextStart = getFromDisplayText(amountFrom, unitFrom, "yard")
                }
                "ft", "foot", "feet" -> {
                    isLength = true
                    unitFrom = "feet"
                    amountFromBase = amountFrom * 0.3048
                    displayTextStart = getFromDisplayText(amountFrom, unitFrom, "foot")
                }
                "in", "inch", "inches" -> {
                    isLength = true
                    unitFrom = "inches"
                    amountFromBase = amountFrom * 0.0254
                    displayTextStart = getFromDisplayText(amountFrom, unitFrom, "inch")
                }
                // Mass:
                "g", "gram", "grams" -> {
                    isMass = true
                    unitFrom = "grams"
                    amountFromBase = amountFrom * 1.0
                    displayTextStart = getFromDisplayText(amountFrom, unitFrom, "gram")
                }
                "kg", "kilogram", "kilograms" -> {
                    isMass = true
                    unitFrom = "kilograms"
                    amountFromBase = amountFrom * 1000.0
                    displayTextStart = getFromDisplayText(amountFrom, unitFrom, "kilogram")
                }
                "mg", "milligram", "milligrams" -> {
                    isMass = true
                    unitFrom = "milligrams"
                    amountFromBase = amountFrom * 0.001
                    displayTextStart = getFromDisplayText(amountFrom, unitFrom, "milligram")
                }
                "lb", "pound", "pounds" -> {
                    isMass = true
                    unitFrom = "pounds"
                    amountFromBase = amountFrom * 453.592
                    displayTextStart = getFromDisplayText(amountFrom, unitFrom, "pound")
                }
                "oz", "ounce", "ounces" -> {
                    isMass = true
                    unitFrom = "ounces"
                    amountFromBase = amountFrom * 28.3495
                    displayTextStart = getFromDisplayText(amountFrom, unitFrom, "ounce")
                }
                else -> {
                    isImpossible = true
                    unitFrom = "???"
                }
            }

            // Convert to target unit
            when (unitTo.toLowerCase()) {
                // Lengths:
                "m", "meter", "meters" -> {
                    isLength = true
                    unitTo = "meters"
                    amountTo = amountFromBase * 1.0 / 1.0
                    displayTextEnd = getEndDisplayText(amountTo, unitTo, "meter")
                }
                "km", "kilometer", "kilometers" -> {
                    isLength = true
                    unitTo = "kilometers"
                    amountTo = amountFromBase * 1.0 / 1000.0
                    displayTextEnd = getEndDisplayText(amountTo, unitTo, "kilometer")
                }
                "cm", "centimeter", "centimeters" -> {
                    isLength = true
                    unitTo = "centimeters"
                    amountTo = amountFromBase * 1.0 / 0.01
                    displayTextEnd = getEndDisplayText(amountTo, unitTo, "centimeter")
                }
                "mm", "millimeter", "millimeters" -> {
                    isLength = true
                    unitTo = "millimeters"
                    amountTo = amountFromBase * 1.0 / 0.001
                    displayTextEnd = getEndDisplayText(amountTo, unitTo, "millimeter")
                }
                "mi", "mile", "miles" -> {
                    isLength = true
                    unitTo = "miles"
                    amountTo = amountFromBase * 1.0 / 1609.35
                    displayTextEnd = getEndDisplayText(amountTo, unitTo, "mile")
                }
                "yd", "yard", "yards" -> {
                    isLength = true
                    unitTo = "yards"
                    amountTo = amountFromBase * 1.0 / 0.9144
                    displayTextEnd = getEndDisplayText(amountTo, unitTo, "yard")
                }
                "ft", "foot", "feet" -> {
                    isLength = true
                    unitTo = "feet"
                    amountTo = amountFromBase * 1.0 / 0.3048
                    displayTextEnd = getEndDisplayText(amountTo, unitTo, "foot")
                }
                "in", "inch", "inches" -> {
                    isLength = true
                    unitTo = "inches"
                    amountTo = amountFromBase * 1.0 / 0.0254
                    displayTextEnd = getEndDisplayText(amountTo, unitTo, "inche")
                }
                // Mass:
                "g", "gram", "grams" -> {
                    isMass = true
                    unitTo = "grams"
                    amountTo = amountFromBase * 1.0 / 1.0
                    displayTextEnd = getEndDisplayText(amountTo, unitTo, "gram")
                }
                "kg", "kilogram", "kilograms" -> {
                    isMass = true
                    unitTo = "kilograms"
                    amountTo = amountFromBase * 1.0 / 1000.0
                    displayTextEnd = getEndDisplayText(amountTo, unitTo, "kilogram")
                }
                "mg", "milligram", "milligrams" -> {
                    isMass = true
                    unitTo = "milligrams"
                    amountTo = amountFromBase * 1.0 / 0.001
                    displayTextEnd = getEndDisplayText(amountTo, unitTo, "milligram")
                }
                "lb", "pound", "pounds" -> {
                    isMass = true
                    unitTo = "pounds"
                    amountTo = amountFromBase * 1.0 / 453.592
                    displayTextEnd = getEndDisplayText(amountTo, unitTo, "pound")
                }
                "oz", "ounce", "ounces" -> {
                    isMass = true
                    unitTo = "ounces"
                    amountTo = amountFromBase * 1.0 / 28.3495
                    displayTextEnd = getEndDisplayText(amountTo, unitTo, "ounce")
                }
                else -> {
                    isImpossible = true
                    unitTo = "???"
                }
            }

            if (isLength && isMass || isImpossible) {
                println("Conversion from $unitFrom to $unitTo is impossible")
            } else {
                print(displayTextStart)
                println(displayTextEnd)
            }
        }
    } while (request != "exit")
}

fun getFromDisplayText(amount: Double, plural: String, singular: String): String {
    var expression = plural
    if (amount == 1.0) {
        expression = singular
    }
    return "$amount $expression is "
}

fun getEndDisplayText(amount: Double, plural: String, singular: String): String {
    var expression = plural
    if (amount == 1.0) {
        expression = singular
    }
    return "$amount $expression"
}
