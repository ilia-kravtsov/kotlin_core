import kotlin.math.round

fun main() {
    val celsius = readln().toDouble()
    val fahrenheit = celsius * 9 / 5 + 32
    println(round(fahrenheit).toInt())
}
