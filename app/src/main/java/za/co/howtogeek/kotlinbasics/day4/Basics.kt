package za.co.howtogeek.kotlinbasics.day4

fun main() {

    // Immutable list (listOf(values) cannot be changed):
    //val shoppingList = listOf("Processor", "RAM", "Graphics Card", "SSD")

    // Mutable List (can be modified):
    val shoppingList = mutableListOf("Processor", "RAM", "Graphics Card RTX 3060", "SSD")

    // Adding items to list:
    shoppingList.add("Cooling System")
    shoppingList.remove("Graphics Card RTX 3060")
    shoppingList.add("Graphics Card RTX 4090")

    println(shoppingList)
    shoppingList.removeAt(2)
    println(shoppingList)
    shoppingList.removeAt(1)
    println(shoppingList)
    shoppingList.add(2, "RAM")
    println(shoppingList)

}