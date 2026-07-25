fun main() {
    val x: Boolean = readln().toBoolean() // read other values in the same way
    val y: Boolean = readln().toBoolean()
    val z: Boolean = readln().toBoolean()

    println("${!(x && y) || z}")
}

fun next() {
    val x: Boolean = readLine().toBoolean() // read other values in the same way
    val y: Boolean = readln().toBoolean()
    val z: Boolean = readln().toBoolean()

    val result = !(x && y) || z
    println(result)
}