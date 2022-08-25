//20000723 - A.A.D. Harshani
//SCS 2204_Tutorial 5

object Q2 extends App {

    //Defining a function to calculate the GCD
    def GCD (a: Int, b : Int) : Int = b match {
        //Using a match case for condtions,
        case 0 => a
        case x if x > a => GCD (x, a)
        case x => GCD (x, a % x)
    }

    //Defining a function to check prime numbers using above GCD function
    def prime (p : Int, n : Int = 2) : Boolean = n match {
        //Using a match case for condtions,
        case x if (x == p) => true
        case x if GCD (p, x) > 1 => false
        case x => prime (p, x + 1)
    }

    //Defining a function to print the sequence of prime numbers
    def primeSeq (n : Int) : Unit = {
        if (n >= 2) {
            primeSeq(n-1)
            if (prime (n) == true) {
                println(n)
            }
        }
    }

    //Getting the number as a user input
    println ("\nEnter the number: ")
    var p = scala.io.StdIn.readInt()
    
    println ("\n")

    primeSeq(p)
    
    println ("\n")

}