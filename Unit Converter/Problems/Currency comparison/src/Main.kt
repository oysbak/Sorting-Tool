import java.util.*

fun main(args: Array<String>) {
    // put your code here
    val scanner = Scanner(System.`in`)
    val firstCountry = scanner.next().toUpperCase()
    val secondCountry = scanner.next().toUpperCase()

    if (Country.exists(firstCountry) && Country.exists(secondCountry)) {
        println(Country.valueOf(firstCountry).currency == Country.valueOf(secondCountry).currency)
    } else {
        println(false)
    }
}

enum class Country(val currency: String) {
    GERMANY("Euro"),
    MALI("CFA franc"),
    DOMINICA("Eastern Caribbean dollar"),
    CANADA("Canadian dollar"),
    SPAIN("Euro"),
    AUSTRALIA("Australian dollar"),
    BRAZIL("Brazilian real"),
    SENEGAL("CFA franc"),
    FRANCE("Euro"),
    GRENADA("Eastern Caribbean dollar"),
    KIRIBATI("Australian dollar");

    companion object {
        fun exists(country: String): Boolean {
            for (enum in Country.values()) {
                if (country == enum.name) return true
            }
            return false
        }
    }
}

