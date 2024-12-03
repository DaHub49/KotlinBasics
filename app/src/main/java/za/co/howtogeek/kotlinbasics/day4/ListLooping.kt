package za.co.howtogeek.kotlinbasics.day4

fun main(){
    val numbers = mutableListOf(1, 2, 3, 4, 5)

    for (index in 0 until numbers.size){
        println("index: $index, value: ${numbers.get(index)}")
        println("Doubling each element ->")
        numbers.set(index, numbers.get(index)*2)
        println("numbers.get(index): ${numbers.get(index)}")
    }
}


