fun main() {
    val firstName = "John"
    val lastName = "Johnson"
    printGreeting(firstName)
    printGreeting(firstName, lastName)
}

fun printGreeting(firstName: String) {
    println("Hello $firstName")
}

fun printGreeting(firstName: String, lastName: String) {
    println("Hello $firstName $lastName")
}