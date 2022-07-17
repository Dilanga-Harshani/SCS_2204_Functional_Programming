//20000723 - A.A.D. Harshani
//SCS 2204_Tutorial 3

object Q2 extends App {

    ////Defining the function to convert a Celsius value into Fahrenheit
    def C_to_F (celsius : Int) : Double = celsius * 1.8 + 32

    //Calling the function with Celsius value and printing the result
    println ("\n35 Celsius = " + C_to_F (35) + " Fahrenheit\n")
    
}