//20000723 - A.A.D. Harshani
//SCS 2204_Tutorial 5

object Q6 extends App {

    //Defining a function to obtain the fibonacci sequence recursively
    def fibonacci (n : Int) : Int = n match {
        //Using a match case for condtions,
        case 0 => 0
        case x if x == 1 => 1
        case _ => fibonacci (n - 1) + fibonacci (n - 2)
    }

    //Defining a function to print the fibonacci sequence
    def fibonacciSeq (n : Int) : Unit = {
        if (n > 0) 
            fibonacciSeq (n - 1)
            println (fibonacci (n))
    }
    
    //Getting the number as a user input
    println ("\nEnter the number: ")
    var n= scala.io.StdIn.readInt ()

    println ("\n")

    fibonacciSeq(n)
    
    println ("\n")
    
}
    

