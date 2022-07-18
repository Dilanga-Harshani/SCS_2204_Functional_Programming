//20000723 - A.A.D. Harshani
//SCS 2204_Tutorial 3

object Q4 extends App {

    //Defining a function to calculate the cover price of books with discount
    def book_price (n_books : Int) : Double = n_books * 24.95 * 0.6

    //Defining a function to calculate the shipping cost
    def ship_cost (n_books : Int) : Double = n_books <= 50 match {
        //Using a match case to define the shipping cost based on no of copies    

        case true => n_books * 3
        case false => (n_books - 50) * 0.75 + 150

    }

    //Defining a function to calculate the total wholesale cost
    def tot_cost (n_books : Int) : Double = book_price (n_books) + ship_cost (n_books)
    
    //Calling the function with 60 as the no of copies and printing the wholesale cost
    println ("\nTotal wholesale cost for 60 copies = Rs. " + tot_cost (60) + "\n")

}
