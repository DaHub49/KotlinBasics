package za.co.howtogeek.kotlinbasics.day4

fun main() {
    val fruitList = mutableListOf("Orange", "Naartjie", "Apple", "Banana", "Grape")
    println(fruitList)

    // Add anothr fruit:
    fruitList.add("Guava")
    println("updated fruitList: $fruitList")


    println("\nDoes list contain 'Naartjie':")
    println(fruitList.contains("Naartjie"))

    // Remove a fruit:
    //println("Remove element 1:")
    //fruitList.removeAt(1)
    println("Remove Naartjie:")
    fruitList.remove("Naartjie")
    println(fruitList)

    println("Does list contain 'Naartjie':")
    println(fruitList.contains("Naartjie"))
}