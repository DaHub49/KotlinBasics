package za.co.howtogeek.kotlinbasics.day7

fun main(){
    /*
    val numbers = listOf(1,2,3)
    val doubled = numbers.map { it * 2 }
    println("numbers doubled: $doubled")
     */

    val blueRoseVase = Vase(colour = "Blue", design = "Rose")
    val redRoseVase = blueRoseVase.copy(colour = "Red")
    println(blueRoseVase)
    println(redRoseVase)
}

data class Vase(val colour: String, val design: String)
