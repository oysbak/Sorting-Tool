import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    var x1 = scanner.nextInt()
    var y1 = scanner.nextInt()
    var z1 = scanner.nextInt()

    // Order lengths in ascending order
    var temp = 0
    if (y1 < x1) {
        temp = x1
        x1 = y1
        y1 = temp
    }
    if (z1 < y1) {
        temp = y1
        y1 = z1
        z1 = temp
    }
    if (y1 < x1) {
        temp = x1
        x1 = y1
        y1 = temp
    }

    // Read second box and ort lengths in asceending order
    var x2 = scanner.nextInt()
    var y2 = scanner.nextInt()
    var z2 = scanner.nextInt()
    if (y2 < x2) {
        temp = x2
        x2 = y2
        y2 = temp
    }
    if (z2 < y2) {
        temp = y2
        y2 = z2
        z2 = temp
    }
    if (y2 < x2) {
        temp = x2
        x2 = y2
        y2 = temp
    }

    val volumeBox1 = x1 * y1 * z1
    val volumeBox2 = x2 * y2 * z2

    if (volumeBox1 == volumeBox2 && x1 == x2 && y1 == y2 && z1 == z2) {
        print("Box 1 = Box 2")
    } else {
        if (volumeBox1 < volumeBox2 && x1 <= x2 && y1 <= y2 && z1 <= z2) {
            print("Box 1 < Box 2")
        } else if (volumeBox1 > volumeBox2 && x1 >= x2 && y1 >= y2 && z1 >= z2) {
            print("Box 1 > Box 2")
        } else {
            print("Incomparable")
        }
    }
}
