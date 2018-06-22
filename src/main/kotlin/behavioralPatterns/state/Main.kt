package behavioralPatterns.state

import javafx.application.Application

// Safe security system that the security status changes with time.

fun main(args: Array<String>) {
    Application.launch(AppSafe::class.java, null)
}
