import java.io.File

fun main() {
    val file = File("readme.txt")
    var input: String
    while (true) {
        println("Type a line:")
        input = readLine().toString()
        if (input != "exit")
            file.appendText("$input\n")
        else
            break
    }
    val lines = file.readLines()
    lines.forEach {ln -> println(ln)}
}