package behavioralPatterns.command
// ˅
import java.util.Stack

// ˄

// Holder of the past commands
class HistoryCommand : Command {
    // ˅
    
    // ˄

    // A set of past commands
    private val pastCommands: Stack<Command> = Stack()
        // ˅
        
        // ˄

    override fun execute() {
        // ˅
        for (command: Command in pastCommands) {
            command.execute()
        }
        // ˄
    }

    fun add(cmd: Command) {
        // ˅
        pastCommands.push(cmd)
        // ˄
    }

    // Delete the last command
    fun undo() {
        // ˅
        if (!pastCommands.isEmpty()) {
            pastCommands.pop()
        }
        // ˄
    }

    // Delete all past commands.
    fun clear() {
        // ˅
        pastCommands.clear()
        // ˄
    }

    // ˅

    // ˄
}

// ˅

// ˄
