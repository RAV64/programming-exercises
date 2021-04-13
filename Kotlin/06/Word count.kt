fun main() {
    var x = false
    var input : String?
    var count = 0
    while (!x) {
        println("Type a word (Type x to exit)")
        input = readLine()
        if (input == "x")
            x = true
        else
            count += 1
    }
    println("You typed $count words")
}