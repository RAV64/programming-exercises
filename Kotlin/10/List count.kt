fun main() {
    val names = arrayOf("Jim", "Mary", "Matt", "Priscilla", "Mike", "Kelly")
    println(names.count {it.startsWith("M")})
}