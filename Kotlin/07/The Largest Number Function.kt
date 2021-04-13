fun main() {
    println("Type the first integer:")
    val x1 = readLine()!!.toInt()
    println("Type the second integer:")
    val x2 = readLine()!!.toInt()
    println("Type the third integer:")
    val x3 = readLine()!!.toInt()
    val largest = findMax(x1, x2, x3)
    println("The largest one is: $largest")
}

fun findMax(x1: Int, x2: Int, x3: Int): Int {
    if (x1 > x2 && x1 > x3)
        return x1
    else if (x2 > x3)
        return x2
    else
        return x3

}