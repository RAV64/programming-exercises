fun main() {
    print("Type an integer #1: ")
    val x = readLine()!!.toInt()
    print("Type an integer #2: ")
    val y = readLine()!!.toInt()
    println("$x + $y = ${x + y}")
    println("$x - $y = ${x - y}")
    println("$x * $y = ${x * y}")
}