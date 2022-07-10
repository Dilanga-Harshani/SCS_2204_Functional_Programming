//20000723 - A.A.D. Harshani
//SCS 2204_Tutorial 2

object Q4b extends App {

    //Calculating the number of attendees using the price
    def attendees (price : Int) : Int = 120 + ((15 - price) / 5) * 20
    
    //Calculating the revenue by using the attendees function and the price
    def earn (price : Int) : Int = attendees (price) * price 
    
    //Calculating the cost by using the attendees function
    def cost (price : Int) : Int = 500 + 3 * attendees (price)
    
    //Calculating the profit by using earn and cost functions
    def profit (price : Int) : Int = earn (price) - cost (price)

    //Getting price from the user calling the profit fuction with it
    println("Enter the price: ")
    var price = scala.io.StdIn.readInt ()

    //Printing the profit by calling profit fuction with the price
    printf ("Profit for ticket price Rs. %d = Rs. %d", price, profit (price))

}