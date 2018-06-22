package creationalPatterns.prototype

import creationalPatterns.prototype.framework.*

// Display a character string enclosed with a frame line, or drawn with an underline.

fun main(args: Array<String>) {
    // Create a manager
    val manager = Manager()
    val emphasisUnderline = UnderlineDisplay('~')
    val highlightFrame = FrameDisplay('+')
    val warningFrame = FrameDisplay('#')
    manager.registerDisplay("emphasis", emphasisUnderline)
    manager.registerDisplay("highlight", highlightFrame)
    manager.registerDisplay("warning", warningFrame)

    // Create displays
    val display1 = manager.getDisplay("emphasis")
    display1?.show("Nice to meet you.")
    val display2 = manager.getDisplay("highlight")
    display2?.show("Nice to meet you.")
    val display3 = manager.getDisplay("warning")
    display3?.show("Nice to meet you.")
}
