fun main() {
    val array = Array(4) { i -> i * 3 }
    println("The first: ${array[0]}")
    println("The last: ${array[array.lastIndex]}")
}