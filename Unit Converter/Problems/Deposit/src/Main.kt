import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    when (scanner.next()) {
        "amount" -> println(compundInterest(amount = scanner.nextInt()))
        "percent" -> println(compundInterest(percent = scanner.nextInt().toDouble()))
        "years" -> println(compundInterest(years = scanner.nextInt()))
    }

}

fun compundInterest(amount: Int = 1_000, percent: Double = 5.0, years: Int = 10): Int {
    return (amount * Math.pow(1 + percent / 100, years.toDouble())).toInt()
}
