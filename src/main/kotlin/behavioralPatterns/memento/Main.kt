package behavioralPatterns.memento

/*
Dice game collecting fruits.

* A gamer shakes a dice and the number determine the next state.
* Gamer's money increases or decreases depending on the number. The gamer sometimes gets desserts.
* The game is over if the gamer's money runs out.
*/

fun main(args: Array<String>) {
    val gamer = Gamer(100)                  // The initial money is 100
    var memento = gamer.createMemento()     // Save the initial state

    for (i in 0..99) {
        println("==== $i")                  // Display count
        println("Current state: $gamer")    // Display the current state of the gamer

        gamer.play()                        // Play a game

        println("Gamer's money is ${gamer.money}.")

        // Determine the behavior of the Memento
        if (gamer.money > memento.money) {
            println("(Save the current state because money has increased.)")
            memento = gamer.createMemento()
        }
        else if (gamer.money < memento.money / 2) {
            println("(Go back to the previous state because money has decreased.)")
            gamer.restoreMemento(memento)
        }

        Thread.sleep(1000)

        println("")
    }
}
