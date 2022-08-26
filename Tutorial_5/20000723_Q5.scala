//20000723 - A.A.D. Harshani
//SCS 2204_Tutorial 5

object Q5 extends App {
    
    //Defining a function to add even numbers recursively
    def addEven (n : Int) : Int = n match {
    //Using a match case for condtions,
        case x if (n % 2 != 0) => addEven (n - 1)
        case x if (n == 2) => 2
        case _ => n + addEven (n - 2)
    }
    
    //Getting the number as a user input
    println ("\nEnter the number: ")
    var n= scala.io.StdIn.readInt ()

    println ("\nAddition of even no.s = " + addEven (n - 1) + "\n")

}
