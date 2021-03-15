fun perimeter(
    x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double,
    x4: Double = x1, y4: Double = y1
): Double {
    val p0 = Point(x1, y1)
    val p1 = Point(x2, y2)
    val p2 = Point(x3, y3)
    val p3 = Point(x4, y4)
    return distance(p0, p1) +
            distance(p1, p2) +
            distance(p2, p3) +
            distance(p3, p0)
}

fun distance(p1: Point, p2: Point): Double {
    return Math.hypot(p2.x - p1.x, p2.y - p1.y)
}

data class Point(val x: Double, val y: Double)
