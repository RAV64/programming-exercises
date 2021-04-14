import java.io.File

fun main() {
    val file = File("numbers.txt")
    var input: Number
    while (true) {
        println("Type a positive integer (-1 to exit):")
        input = readLine()!!.toInt()
        when {
            input > 0 -> file.appendText("$input\n")
            input == -1 -> break
            input < -1 -> println("The number must be positive")
        }
    }
    val lines = file.readLines()
    val nums = mutableListOf<Int>()
    lines.forEach { ln -> nums.add(ln.toInt()) }
    println("You typed ${nums.count()} numbers.")
    println("The average is ${nums.average()}")
}