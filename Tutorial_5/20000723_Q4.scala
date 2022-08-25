//20000723 - A.A.D. Harshani
//SCS 2204_Tutorial 5

object Q4 extends App {
    
    //Defining a function to check even numbers recursively
    def isEven (n : Int) : Boolean = n match {
        //Using a match case for condtions,
        case 0 => true
        case _ => isOdd(n-1)
    }

    //Defining a function to check odd numbers recursively
    def isOdd (n : Int) : Boolean = !(isEven (n))
    
    //Getting the number as a user input
    println ("\nEnter the number: ")
    var n= scala.io.StdIn.readInt ()
    
    var result = (isEven (n))

    if (result == true) {
        println ("\nEven\n")
    } else {
        println ("\nOdd\n")
    }
    
}
