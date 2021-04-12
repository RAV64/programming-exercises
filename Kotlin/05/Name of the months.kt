import java.text.DateFormatSymbols
import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    println("Type a month number (1-12)")
    val value = sc.nextInt()
    print(DateFormatSymbols().months[value - 1])
} //when