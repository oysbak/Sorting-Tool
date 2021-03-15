fun main() {
    val rooms = readLine()!!.toInt()
    val price = readLine()!!.toInt()
    val house = when {
        rooms <= 1 -> Cabin(rooms, price)
        rooms in 2..3 -> Bungalow(rooms, price)
        rooms == 4 -> Cottage(rooms, price)
        rooms in 5..7 -> Mansion(rooms, price)
        rooms >= 8 -> Palace(rooms, price)
        else -> House(rooms, price)
    }
    println(totalPrice(house))
}

fun totalPrice(house: House): Int = house.getFinalPrice().toInt()

open class House(val rooms: Int, private val price: Int) {
    open val coefficient = 1.0

    fun getFinalPrice() = price.coerceIn(0, 1_000_000) * coefficient
}

class Cabin(rooms: Int, price: Int) : House(rooms, price) {
    override val coefficient = 1.0
}

class Bungalow(rooms: Int, price: Int) : House(rooms, price) {
    override val coefficient = 1.2
}

class Cottage(rooms: Int, price: Int) : House(rooms, price) {
    override val coefficient = 1.25
}

class Mansion(rooms: Int, price: Int) : House(rooms, price) {
    override val coefficient = 1.4
}

class Palace(rooms: Int, price: Int) : House(rooms, price) {
    override val coefficient = 1.6
}
