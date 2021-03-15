class Player(val id: Int, val name: String, val hp: Int) {
    companion object {
        fun create(name: String): Player {
            return Player(Math.random().toInt(), name, 100)
        }
    }
}
