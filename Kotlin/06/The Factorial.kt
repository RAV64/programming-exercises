fun main() {
    println("Type an integer:")
    val num = readLine()!!.toInt()
    var fact = 1;
    for (i in 1..num)
        fact *= i
    println("The factorial of $num = $fact")
}