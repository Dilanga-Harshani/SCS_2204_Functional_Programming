//20000723 - A.A.D. Harshani
//SCS 2204_Tutorial 5

object Q3 extends App {
    
    //Defining a function to get the sum of numbers recursively
    def sum (x : Int) : Int = x match {
        //Using a match case for condtions,
        case x if (x == 0) => 0
        case _ => x + sum (x - 1)
    }

    //Getting the number as a user input
    println ("\nEnter the number: ")
    var x = scala.io.StdIn.readInt ()

    println("\nAddition = " + sum (x) + "\n")

}
