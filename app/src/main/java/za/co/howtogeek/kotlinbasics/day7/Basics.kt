package za.co.howtogeek.kotlinbasics.day7

fun main(){
    val numbers = listOf(1,2,3)
    // maps iterate through lists and allows you to globally edit each element.
    val doubled = numbers.map { it * 2 }

    println("doubled: $doubled")

    //String map:
    val words = listOf("as", "bas", "note")

    val wordsss = words.map { it + 's' }
    println("wordsss: $wordsss")
}