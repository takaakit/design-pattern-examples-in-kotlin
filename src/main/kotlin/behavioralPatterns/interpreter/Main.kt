package behavioralPatterns.interpreter

import java.io.File

/*
An interpreter for mini language to operate radio controlled car. It parses the following syntax composed of "forward", "left", "right", and "repeat" commands:
```
<program>      ::= program <command list>
<command list> ::= <command>* end
<command>      ::= <repeat> | <action>
<repeat>       ::= repeat <number> <command list>
<action>       ::= forward | right | left
<number>       ::= 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9
```
___
Examples before and after syntax analysis.

Ex.1
```
Before : "program end"
After  : [program []]
```

Ex.2
```
Before : "program forward right left end"
After  : [program [forward, right, left]]
```

Ex.3
```
Before : "program repeat 4 forward right end end"
After  : [program [repeat 4 [forward, right]]]
```
*/

fun main(args: Array<String>) {
    File("src/main/kotlin/behavioralPatterns/interpreter/program.txt").bufferedReader().use {
        it.lineSequence()
                .filter(String::isNotBlank)
                .forEach {
                    val text = it
                    println("Before : \"$text\"")
                    val node = Program()
                    node.parse(Context(text))
                    println("After  : $node")
        }
    }
}
