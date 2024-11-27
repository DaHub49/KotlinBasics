package za.co.howtogeek.kotlinbasics

fun main() {
    println("Hello Dyls!")

    val constantNumber = 0
    var mutableString = "mutsableString"


    println("test")
    println("constantNumber: $constantNumber. mutableString: $mutableString")

    mutableString = "differentMutsableString"

    println("mutableString: $mutableString")

    /**
     * Float: Size: 32 bits
     * Double: Size: 64 bits
     */

    // Numbers:
    var pi = 3.14f
    println(pi)
    pi = 3.141592653f //prints 3.1415927 because initialized as Float
    println(pi)

    // Unsigned integer types
    // Excludes negative range,

    var age: UShort = 35u

    // Booleans:
    var myTrue = true
    var myFalse = false

    println("myTrue || myFalse ${myTrue || myFalse}")
    println("myTrue && myFalse: ${myTrue && myFalse}")
    println("!myTrue ${!myTrue}")

    // Chars:
    val myChar = '\u00AE'
    println(myChar)

    // Strings:
    println("\nStrings:")
    val str = "abcd 123"
    for (c in str) {
        println(c)
    }

    var name = "Frank"
    name = "Very long paragraphs can be stored inside of strings.\nString functions:"
    println("name.uppercase(): ${name.uppercase()}")

    // If statements:

    var ageAgain = 0 // Same old, same old with if statments

    // Reading user input via console:
    println("Enter your age:")
    //var enteredValue = readln()
    //age = enteredValue.toUShort()
    age = readln().toUShort()
    println("Your age is: $age")


}