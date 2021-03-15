import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val parameter = scanner.next()
    val value = scanner.nextInt()

    when (parameter) {
        "old" -> println(getCarValue(age = value))
        "passed" -> println(getCarValue(km = value))
        "speed" -> println(getCarValue(speed = value))
        "auto" -> println(getCarValue(auto = value == 1))
    }
}

fun getCarValue(age: Int = 5, km: Int = 100_000, speed: Int = 120, auto: Boolean = false): Int {
    // Age
    var price = 20_000 - 2_000 * age

    // km
    price -= 200 * (km / 10_000)

    // Speed
    price += 100 * (speed - 120)

    // Automatic
    if (auto) {
        price += 1_500
    }

    return price
}
