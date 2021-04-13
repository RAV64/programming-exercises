import java.util.*
import kotlin.math.pow

fun main() {
    val sc = Scanner(System.`in`)
    println("Type the first number:")
    val num1 = sc.nextInt()
    println("Type the second number:")
    val num2 = sc.nextInt()
    println("Type the operator (+,-,*):")
    when (val op = sc.next()) {
        "+" -> println("$num1 $op $num2 = ${num1+num2}")
        "-" -> println("$num1 $op $num2 = ${num1-num2}")
        "*" -> println("$num1 $op $num2 = ${num1*num2}")
        "**" -> println("$num1 $op $num2 = ${num1.toDouble().pow(num2.toDouble())}")
        "/" -> println("$num1 $op $num2 = ${num1.toDouble()/num2.toDouble()}")
        else -> println("Unknown operator")
    }
}