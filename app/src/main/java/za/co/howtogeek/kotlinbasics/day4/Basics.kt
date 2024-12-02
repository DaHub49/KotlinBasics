package za.co.howtogeek.kotlinbasics.day4

// Immutable list (listOf(values) cannot be changed):
//val shoppingList = listOf("Processor", "RAM", "Graphics Card", "SSD")

// Mutable List (can be modified):
val shoppingList = mutableListOf("Processor", "RAM", "Graphics Card RTX 3060", "SSD")

fun main() {
    println(shoppingList)
    println("shoppingList.size: ${shoppingList.size}\n")

    // Adding items to list:
    shoppingList.add("Cooling System")
    shoppingList.remove("Graphics Card RTX 3060")
    shoppingList.add("Graphics Card RTX 4090")
    println("shoppingList.size: ${shoppingList.size}\n")

    /*println("\nUpdated Shopping List:")
    println("shoppingList[0]: ${shoppingList[0]}, " +
            "shoppingList[1]: ${shoppingList[1]}, " +
            "shoppingList[2]: ${shoppingList[2]}, " +
            "shoppingList[3]: ${shoppingList[3]}, " +
            "shoppingList[4]: ${shoppingList[4]}\n")
    println("remove at (2)")
     */
    shoppingList.removeAt(2)
    println("shoppingList.size: ${shoppingList.size}")
    println("remove at (1)")
    shoppingList.removeAt(1)
    println("shoppingList.size: ${shoppingList.size}")

    println("shoppingList.add(2), RAM")
    shoppingList.add(2, "RAM")
    println("shoppingList[2]: ${shoppingList[2]}")
    //Shifts list elements to the right:
    println("shoppingList[3]: ${shoppingList[3]}")

    // update field:
    shoppingList[3] = "Graphics Card RX 7800XT"
    println("\nUpdated Shopping List:")
    println("shoppingList[0]: ${shoppingList[0]}, " +
            "shoppingList[1]: ${shoppingList[1]}, " +
            "shoppingList[2]: ${shoppingList[2]}, " +
            "shoppingList[3]: ${shoppingList[3]}\n")

    // Using List.set top replace elements:
    shoppingList.set(1, "Water Cooling")
    println("shoppingList[0]: ${shoppingList[0]}, " +
            "shoppingList[1]: ${shoppingList[1]}, " +
            "shoppingList[2]: ${shoppingList[2]}, " +
            "shoppingList[3]: ${shoppingList[3]}\n")

    val hasRam = shoppingList.contains("RAM")
    if (hasRam)
        println("Has RAM in the list")
    else
        println("No RAM in the list")

    //println("shoppingList: $shoppingList")
    forLoopDemo(shoppingList.size)

} // main()



fun forLoopDemo(numIterations: Int = 0){
    if (numIterations == 0)
        println("ERROR! Need data to loop through.")

    println("\nforLoopDemo:")

    for (customListItem in shoppingList) {
        println(customListItem)
        if (customListItem == "RAM") {
            println("About to remove last element:")
            shoppingList.removeLast()
            break
        }
    }

    println(shoppingList)
}