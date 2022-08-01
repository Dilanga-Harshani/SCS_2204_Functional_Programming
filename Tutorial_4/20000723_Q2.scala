//20000723 - A.A.D. Harshani
//SCS 2204_Tutorial 4

object Q2 extends App {

    //Defining a function to do PatternMatching
    def PatternMatching (input: Int) : String = input match {
        //Using a match case to define the output based on input

        case x if x < 0 => "Negative number is given"
        case x if x == 0 => "Zero is given"
        case x if x % 2 == 0 => "Even number is given"
        case x => "Odd number is given"
    }

    //Getting the integer to match from the user
    println("\nEnter the integer to match: ")
    var input = scala.io.StdIn.readInt ()

    //Calling the PatternMatching function with input integer 
    //And printing the result
    println ("\n" + PatternMatching(input) + "\n")

}