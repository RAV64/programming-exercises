fun main() {
    val words = arrayOf("Kotlin", "Programming", "String", "List", "Algorithm")
    val newList = words.filter { it.length < 7}
    println(newList.toString())
}