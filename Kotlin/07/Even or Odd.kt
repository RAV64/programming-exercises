fun main() {
    println("Type an integer:")
    val x = readLine()!!.toInt()
    val bool = isEven(x)
    println(bool)
}

fun isEven(x: Int): String {
    return if (x % 2 == 0)
        "Even"
    else
        "Odd"
}