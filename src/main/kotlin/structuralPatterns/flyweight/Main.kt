package structuralPatterns.flyweight

import java.util.*

/*
Display a string consisting of large characters (0-9 digits only). Large character objects are not created until they are needed. And the created objects are reused.

Example Output
-----
Please enter digits (ex. 1212123): 123
              
     ####     
      ###     
      ###     
      ###     
      ###     
      ###     
    #######   
              

              
   ########   
         ###  
         ###  
   ########   
  #           
  #           
  ##########  
              

              
   ########   
         ###  
         ###  
   ########   
         ###  
  #      ###  
   ########
 */

fun main(args: Array<String>) {
    println("Please enter digits (ex. 1212123):")
    val scan = Scanner(System.`in`)
    val inputValue = scan.next()

    val bs = LargeSizeString(inputValue)
    bs.display()
}
