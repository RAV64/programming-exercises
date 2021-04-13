fun main() {
    val nums = arrayOf(6, 2, 4, 19)
    println("Type an index:")
    try {
        val num = readLine()!!.toInt()
        println(nums[num])
    } catch (e1: ArrayIndexOutOfBoundsException) {
        println("Element not found. Index out of bounds")
    } catch (e2: NumberFormatException){
        println("Type an integer")
    }
}