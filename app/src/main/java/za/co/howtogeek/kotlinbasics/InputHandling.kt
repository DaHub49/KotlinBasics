package za.co.howtogeek.kotlinbasics

fun main(){
    /*
    fun isInteger(str: String): Boolean {
    return str.toIntOrNull() != null
}
     */
    // To check if a number is an Integer or not:
    fun isInteger(str: String): Boolean {
        return str.toIntOrNull() != null
    }

    val multiplier = 5
    var inputNumber = -1

    println("Please enter a whole number, then press <Enter>")
    var inputString = readln()
    if (!isInteger(inputString)) {
        do {
            println("Please enter a whole number, then press <Enter>")
            inputString = readln()
        } while (!isInteger(inputString))
    }
    inputNumber = inputString.toInt()

    var multiplied = inputNumber*multiplier

    println("Result of $inputNumber * $multiplier = $multiplied")

}