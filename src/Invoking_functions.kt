fun orderCoffee(type: String, size: String): String {
    return "You ordered a $size $type."
}

fun main() {
    val order = orderCoffee("latte", "large")

    println(order)
}

fun sayHello(name: String): String {
    return "Hello $name"
}

fun main_2() {
    val userName = "John"
    println(sayHello(userName))
}

fun main_3() {
    val number = readln().toDouble()
    val logNumber = Math.log10(number)
    println(logNumber)
}