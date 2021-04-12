fun main() {
    val names = arrayOf("Mary", "Paul", "Jane", "Phil", "John", "Jane", "Paul", "Anthony", "Mary")
    println("There is ${names.distinct().count()} distinct names")
    names.sort()
    println("The first in the alphabetical order is ${names[0]}")
    println("The last in the alphabetical order is ${names[names.lastIndex]}")
}