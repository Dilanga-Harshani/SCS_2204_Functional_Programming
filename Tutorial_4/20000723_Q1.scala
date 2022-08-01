//20000723 - A.A.D. Harshani
//SCS 2204_Tutorial 4

object Q1 extends App {

    //Defining a function to calculate the interest
    def interest (deposit : Double) : Double = deposit match {
        //Using a match case to calculate the interest based on deposit amount

        case x if x < 0 => 0
        case x if x < 20000 => x * 0.02
        case x if x < 200000 => x * 0.04
        case x if x < 2000000 => x * 0.035
        case x if x >= 2000000 => x * 0.065
    }

    //Getting the deposit amount as a user input
    println("\nEnter the deposit amount: ")
    var deposit = scala.io.StdIn.readInt ()

    //Calling the interest fuction with deposit amount and printing the result
    println ("\nActual amount of interest for Rs. " + deposit + " : Rs." + interest(deposit) + "\n")

}