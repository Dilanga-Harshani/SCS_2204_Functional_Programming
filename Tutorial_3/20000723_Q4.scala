//20000723 - A.A.D. Harshani
//SCS 2204_Tutorial 3

object Q4 extends App {

    //Deffining the function to find the wholesale cost when the no of copies is given
    def cost (n_books : Int) : Double = (n_books * 24.95 * 0.6) + 3 + ((n_books - 50) * 0.75)
    
    //Calling the function with 60 as the no of copies and printing the result
    println ("\nTotal wholesale cost for 60 copies = Rs. " + cost (60) + "\n")

}