package behavioralPatterns.interpreter

import java.io.File

/*
Analyze the syntax of the mini-language composed of "forward", "left", "right", and "repeat" commands.

-----
Examples before and after syntax analysis.
* Ex.1
Before : "program end"
After  : [program []]

* Ex.2
Before : "program forward right left end"
After  : [program [forward, right, left]]

* Ex.3
Before : "program repeat 4 forward right end end"
After  : [program [[repeat 4 [forward, right]]]]
*/

fun main(args: Array<String>) {
    File("src/main/kotlin/behavioralPatterns/interpreter/program.txt").bufferedReader().use {
        it.lineSequence()
                .filter(String::isNotBlank)
                .forEach {
                    val line = it
                    println("TEXT > \"$line\"")
                    val node = Program()
                    node.parse(Context(line))
                    println("NODE > $node")
                }
    }
}
