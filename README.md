![](screenshots/DiagramMap.svg "All diagrams")

Design Pattern Examples in Kotlin
===

Model and code examples of GoF Design Patterns for Kotlin.  
This project is available for the following objectives:  

* To try Model-Driven Development (MDD) using Astah and M PLUS plug-in.
* To understand the mapping between UML model and Kotlin code.
* To understand GoF Design Pattern examples in Kotlin.  
  etc.

> UML model example:

![](screenshots/CompositePattern.svg "Composite Pattern")

> Kotlin code example:

```kotlin:File class
package structuralPatterns.composite
// ˅
// ˄

class File(name: String, size: Int) : FileSystemElement() {
    // ˅
    
    // ˄

    override val name: String = name
        // ˅
        
        // ˄

    override val size: Int = size
        // ˅
        
        // ˄

    // Print this element with the "upperPath".
    override fun print(upperPath: String) {
        // ˅
        println("$upperPath/$this")
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
```

Installation
------------
**Astah**
* Download Astah UML or Professional from [Change Vision site](http://astah.net/download), and install.  

**M PLUS plug-in**
* Download the plug-in from [M PLUS plug-in site](https://sites.google.com/view/m-plus-plugin/download), and install.  
  Use **ver.1.9** or higher.

**Development Environment for Kotlin and JavaFX**
* Prepare an arbitrary development environment for Kotlin and JavaFX. If you don't want to install JavaFX, you need to remove the following packages that use JavaFX to prevent build errors.
  - src/main/kotlin/behavioralPatterns/command
  - src/main/kotlin/behavioralPatterns/mediator
  - src/main/kotlin/behavioralPatterns/state

Usage
-----
1. Select model elements on the model browser of Astah.
2. Click the **Generate code** button.  
   The generated code has **User Code Area**. The User Code Area is the area enclosed by "˅" and "˄". Handwritten code written in the User Code Area remains after a re-generation.
3. Run the program from **Main.kt** for each Design Pattern.  

For detailed usage of the tools, please see [Astah Manual](http://astah.net/manual) and [M PLUS plug-in Tips](https://sites.google.com/view/m-plus-plugin-tips).

![](screenshots/Usage.gif "Usage")

References
----------
* Gamma, E. et al. Design Patterns: Elements of Reusable Object-Oriented Software, Addison-Wesley, 1994
* Hiroshi Yuki. Learning Design Patterns in Java [In Japanese Language], Softbank publishing, 2004

Licence
-------
This project is licensed under the Creative Commons Zero (CC0) license. The model and code are completely free to use.

[![CC0](http://i.creativecommons.org/p/zero/1.0/88x31.png "CC0")](http://creativecommons.org/publicdomain/zero/1.0/deed)
