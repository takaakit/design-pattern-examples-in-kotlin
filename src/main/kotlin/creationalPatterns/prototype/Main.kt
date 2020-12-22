package creationalPatterns.prototype

import creationalPatterns.prototype.framework.Display
import creationalPatterns.prototype.framework.Manager

/*
Display a string enclosed with a frame line, or drawn with an underline. The client("Main") registers instances of the "Display" subclass in the "Manager" class. When necessary, the "Manager" class asks those registered instances to return a clone. The client("Main") requires the returned clones to display.
 */

fun main(args: Array<String>) {
    val manager = Manager()

    // Register instances of the "Display" subclass
    val emphasisUnderline: Display = UnderlineDisplay('~')
    manager.registerDisplay("emphasis", emphasisUnderline)
    val highlightFrame: Display = FrameDisplay('+')
    manager.registerDisplay("highlight", highlightFrame)
    val warningFrame: Display = FrameDisplay('#')
    manager.registerDisplay("warning", warningFrame)

    // Require to display
    val display1 = manager.getDisplay("emphasis")
    display1.show("Nice to meet you.")
    val display2 = manager.getDisplay("highlight")
    display2.show("Nice to meet you.")
    val display3 = manager.getDisplay("warning")
    display3.show("Nice to meet you.")
}
