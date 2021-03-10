package structuralPatterns.composite

/*
Represents a file system composed of files and directories. FileSystemElement makes
it possible to treat File and Directory uniformly.
 */

fun main(args: Array<String>) {
    println("Create a file system...")

    val binDir = Directory("bin")
    val lsFile = File("ls", 20)
    binDir.add(lsFile)
    val mkdirFile = File("mkdir", 40)
    binDir.add(mkdirFile)

    val emilyDir = Directory("emily")
    val homeworkFile = File("homework.doc", 60)
    emilyDir.add(homeworkFile)

    val jamesDir = Directory("james")
    val appFile = File("app.exe", 80)
    jamesDir.add(appFile)

    val homeDir = Directory("home")
    homeDir.add(emilyDir)
    homeDir.add(jamesDir)

    val rootDir = Directory("root")
    rootDir.add(homeDir)
    rootDir.add(binDir)

    rootDir.print("")
}
