fun main() {
    val nums = mutableListOf<Int>()
    var input = 0
    while (true) {
        println("Type a positive integer (-1 exits): ")
        input = readLine()!!.toInt()
        if (input > 0)
            nums.add(input)
        else if (input == -1)
            break
    }
    println("The average = ${nums.average()}")
    println("The max = ${nums.max()}")
    println("The min = ${nums.min()}")
}