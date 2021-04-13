class Circle : Shape() {
    var radius: Double = 0.0

    fun getArea(): Double {
        return radius * radius * 3.14159
    }
}

fun main() {
    val circle = Circle()
    circle.radius = 5.5
    print("The area = ${circle.getArea()}")
}