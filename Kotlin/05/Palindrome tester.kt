fun main() {
    println("Type a word:")
    val word = readLine().toString().toLowerCase()
    if (word == word.reversed()) {
        println("The word $word is palindrome")
    } else {
        println("The word $word is not palindrome")
    }
}