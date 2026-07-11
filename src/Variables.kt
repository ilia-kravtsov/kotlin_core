// val/var identifier = initialization

// val/var identifier: Type = initialization

// the type name always starts with an uppercase letter.

/*
val greeting // error
greeting = "hello"

val greeting: String // ok
greeting = "hello"

val n: Int = "abc" // Type mismatch: inferred type is String but Int was expected

var age = 30 // the type is inferred as Int
age = "31 years old" // Type mismatch

Note, you cannot change the type of a variable.

From now on, remember: once a variable is created, it has a type, and its type cannot be changed later.
*/

fun main() {
    val first: String = "ilia"
    val last: String = "kravtsov"
    val age: Int = 32
    println("My name is $first $last and I’m $age years old")
}

/*
fun main() {
    val number: Int = 100
    println(number)
}

Which one is equivalent to val age = "42"?

Select one option from the list

val age: Int = 42

Int age = 42

val age = "42": String

String age = "42"

var age = 42

val age: String = "42"

val age: Char = '42'
🎉 Correct
Seems like you've got all the theory down, way to go!
val age: Int = 42  // this is correct for integer type not a String type
Int age = 42  // invalid Kotlin syntax
val age = “42”: String  // invalid syntax, colon, and type should come right after the value name
String age = “42”  // valid in Java but not in Kotlin
var age = 42  // var is used here not val, and age is of type Int, not a String
val age: String = “42”  // correct syntax, although not mandatory we can explicitly declare the type
val age: Char = ‘42’  // '42' is not Char type, in fact, it is not a valid type Kotlin knows about
*/