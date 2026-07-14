import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Please enter your name:")
    val name = scanner.nextLine()
    greetUser(name)
}

fun greetUser(name: String) {
    println("Hello, $name!")
}