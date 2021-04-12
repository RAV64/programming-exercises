fun main() {
    println("Type the first number: ")
    val n1 = readLine()!!.toInt()
    println("Type the second number: ")
    val n2 = readLine()!!.toInt()
    println("Type the third number: ")
    val n3 = readLine()!!.toInt()
    if (n1 > n2 && n1 > n3) {
        println("The largest number = $n1")
    } else if (n2 > n3) {
        println("The largest number = $n2")
    } else {
        println("The largest number = $n3")
    }
}