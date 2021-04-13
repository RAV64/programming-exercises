fun main() {
    val values = mapOf(1 to "Kotlin", 2 to "Java", 3 to "C#", 4 to "Javascript")
    println("Enter a programming language:")
    val input = readLine()
    if (values.containsValue(input))
        print("Value found")
}