package behavioralPatterns.strategy

import behavioralPatterns.strategy.GameResultType.*

/*
A game of rock-scissors-paper. Two strategies are available:
* Random Strategy: showing a random hand signal.
* Mirror Strategy: showing a hand signal from the previous opponent's hand signal.
 */

fun main(args: Array<String>) {
    val player1 = Player("Emily", RandomStrategy())
    val player2 = Player("James", MirrorStrategy())

    for (i in 0..99) {
        val handOfPlayer1 = player1.showHandSignal()
        val handOfPlayer2 = player2.showHandSignal()
        var resultOfPlayer1: GameResultType?
        var resultOfPlayer2: GameResultType?
        if (handOfPlayer1.isStrongerThan(handOfPlayer2)) {
            println("Winner: $player1")
            resultOfPlayer1 = Win
            resultOfPlayer2 = Loss
        } else if (handOfPlayer2.isStrongerThan(handOfPlayer1)) {
            println("Winner: $player2")
            resultOfPlayer1 = Loss
            resultOfPlayer2 = Win
        } else {
            println("Draw...")
            resultOfPlayer1 = Draw
            resultOfPlayer2 = Draw
        }
        player1.notifyGameResult(resultOfPlayer1, handOfPlayer1, handOfPlayer2)
        player2.notifyGameResult(resultOfPlayer2, handOfPlayer2, handOfPlayer1)
    }
    println("RESULT:")
    println(player1)
    println(player2)
}
