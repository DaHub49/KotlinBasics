package za.co.howtogeek.kotlinbasics

fun main(){
    /*
    fun isInteger(str: String): Boolean {
    return str.toIntOrNull() != null
}
     */
    fun isInteger(str: String): Boolean {
        return str.toIntOrNull() != null
    }

    println("Please enter a number, then press <Enter>")
    val inputString = readln()
    val inputNumber = inputString
    if (!isInteger(inputNumber)) {
        do {
            println("Please enter a number, then press <Enter>")
            val inputString = readln()
            val inputNumber = inputString
        } while (!isInteger(inputNumber))
    }

}