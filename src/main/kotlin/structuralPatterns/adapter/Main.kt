package structuralPatterns.adapter

/*
Display a character string as follows
  -- Nice to meet you --
or display it as follows.
  [[ Nice to meet you ]]
*/

fun main(args: Array<String>) {
    val p: Print = PrintMessageDisplay("Nice to meet you")
    p.printWeak()
    p.printStrong()
}
