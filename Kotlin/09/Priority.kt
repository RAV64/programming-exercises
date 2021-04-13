enum class Priority {
    LOW,
    MEDIUM,
    HIGH
}

fun main() {
    for (value in Priority.values())
        println("${value.ordinal} : ${value.name}")
}