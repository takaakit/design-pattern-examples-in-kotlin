package behavioralPatterns.visitor

// Visitors visit a file system composed of files and directories, and displays a list of files/directories.

fun main(args: Array<String>) {
    println("Create a file system...")
    val rootDir: Directory = Directory("root")
    val homeDir: Directory = Directory("home")
    val binDir: Directory = Directory("bin")
    val etcDir: Directory = Directory("etc")
    val emilyDir: Directory = Directory("emily")
    val jamesDir: Directory = Directory("james")
    val oliviaDir: Directory = Directory("olivia")

    rootDir.add(homeDir)
    rootDir.add(binDir)
    rootDir.add(etcDir)

    binDir.add(File("ls", 100))
    binDir.add(File("mkdir", 50))
    homeDir.add(emilyDir)
    homeDir.add(jamesDir)
    homeDir.add(oliviaDir)

    emilyDir.add(File("homework.doc", 40))
    jamesDir.add(File("homework.doc", 50))
    jamesDir.add(File("app.exe", 60))
    oliviaDir.add(File("homework.doc", 70))
    oliviaDir.add(File("app.exe", 80))
    oliviaDir.add(File("tips.html", 90))

    rootDir.accept(ListVisitor())
}
