class Block(val color: String) {
    object DimProperties {
        var length = 6
        var width = 4

        fun blocksInBox(length: Int, width: Int): Int = (length / DimProperties.length) * (width / DimProperties.width)
    }
}
