open class Shape() {
    var xPos: Int = 0
    var yPos: Int = 0

    fun print() {
        println("Position: x=$xPos, y=$yPos")
    }
}

fun main() {
    val shp = Shape()
    shp.print()
}