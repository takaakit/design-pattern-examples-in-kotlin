package structuralPatterns.adapter

/*
Display the given string as follows
```
-- Nice to meet you --
```
or display it as follows.
```
[[ Nice to meet you ]]
```
 */

fun main() {
    val p: Print = PrintMessageDisplay("Nice to meet you")
    p.printWeak()
    p.printStrong()
}
