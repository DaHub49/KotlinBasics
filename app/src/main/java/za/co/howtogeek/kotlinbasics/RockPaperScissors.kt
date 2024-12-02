package za.co.howtogeek.kotlinbasics

fun main(){

    var computerChoice: Int = 0
    var computerChoiceString: String = "Computer player"
    var playerChoice: Int = 5
    var playerChoiceString: String = "Player"

    do {
        println("Rock [1], Paper [2], Scissors [3], Quit [4]? <Enter>")
        playerChoice = readln().toInt()

        // Declare a Random number  in a range:
        computerChoice = (1..3).random()

        computerChoiceString = when (computerChoice) {
            1 -> "Rock"
            2 -> "Paper"
            3 -> "Scissors"
            else -> "You win"
        }

        playerChoiceString = when (playerChoice) {
            1 -> "Rock"
            2 -> "Paper"
            3 -> "Scissors"
            4 -> "Quitter!"
            else -> "You lose"
        }

        println("Your choice: $playerChoiceString. Computer: $computerChoiceString")

        val winner = when {
            playerChoice == computerChoice -> "Tie"
            // Player Rock:
            playerChoice==1 && computerChoice==3 -> "Player wins!"
            // Player Paper:
            playerChoice==2 && computerChoice==1 -> "Player wins!"
            // Player Scissors:
            playerChoice==3 && computerChoice==2 -> "Player wins!"
            // Call to end game
            playerChoice==4 -> "Quiters never win! Computer win this round."

            //  For when not one of the above mentioned
            else -> "Computer wins..."
        }

        println(winner)

    } while(playerChoice!=4)
}