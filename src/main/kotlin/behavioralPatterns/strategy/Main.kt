package behavioralPatterns.strategy

/*
A game of rock-scissors-paper.
There are two strategies below.

* When winning a game, show the same hand at the next time.
* Calculate a hand from the previous hand stochastically.
*/

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Usage: java Main RandomSeedNumber1 RandomSeedNumber2")
        println("Ex.  : java Main 314 15")
    }
    else {
        val randomSeed1 = Integer.parseInt(args[0])
        val randomSeed2 = Integer.parseInt(args[1])
        val player1 = Player("Emily", StrategyA(randomSeed1))
        val player2 = Player("James", StrategyB(randomSeed2))

        for (i in 0..99) {
            val nextHand1 = player1.nextHand()
            val nextHand2 = player2.nextHand()
            if (nextHand1.isStrongerThan(nextHand2)) {
                println("Winner: $player1")
                player1.won()
                player2.lost()
            }
            else if (nextHand2.isStrongerThan(nextHand1)) {
                println("Winner: $player2")
                player1.lost()
                player2.won()
            }
            else {
                println("Draw...")
                player1.drew()
                player2.drew()
            }
        }
        println("RESULT:")
        println(player1.toString())
        println(player2.toString())
    }
}
