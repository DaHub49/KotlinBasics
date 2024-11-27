package za.co.howtogeek.kotlinbasics

fun main(){
    do {
        print("Enter your age as a whole number: ")
        var age: Int = readln().toInt()

        if (age in 18..39) // >= 18 && age < 40)
            println("You can enter the club.")
        else if (age < 18)
            println("You're too young to enter the club")
        else
            println("You cannot go into the club, please go home.")

    }while (age!=120)
}