fun main() {
    // put your code here
    val scanner = java.util.Scanner(System.`in`)
    val days = scanner.nextInt()
    val foodPrDay = scanner.nextInt()
    val flight = scanner.nextInt()
    val hotelPrNight = scanner.nextInt()

    println(
        2 * flight + days * foodPrDay + (days - 1) * hotelPrNight
    )
}