package za.co.howtogeek.kotlinbasics.day7

fun main(){
    /*
    Video 117:
    val numbers = listOf(1,2,3)
    val doubled = numbers.map { it * 2 }
    println("numbers doubled: $doubled")
     */

    /*
    Video 118:
    val blueRoseVase = Vase(colour = "Blue", design = "Rose")
    val redRoseVase = blueRoseVase.copy(colour = "Red")
    println(blueRoseVase)
    println(redRoseVase)
     */

    /*
    Video 119:
     */
    // nullable String:
    val name: String? = "Ella" // The "?" after the variable type declaration means that it can be null.
    // To transform a nullable String, without changing the original value, use the let function:
    name?.let {
        println(it.uppercase())
        println(it)
    }

    }

/*
Video 118 ext:
data class Vase(val colour: String, val design: String)
 */
