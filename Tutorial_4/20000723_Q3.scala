//20000723 - A.A.D. Harshani
//SCS 2204_Tutorial 4

object Q3 extends App {

    //Defining a function to format input to uppercase
    def toUpper (name : String) : String = name.toUpperCase ()

    //Defining a function to format input to lowercase
    def toLower (name : String) : String = name.toLowerCase ()

    //Defining a function to take in the name and another function as parameters
    def formatNames (name : String) (formatFn : String => String) : String = formatFn (name)
    //This function formats the text according to the given format

    //Calling the function formatNames and toUpper function inside it to print the format
    println ("\nBenny ---> " + (formatNames ("Benny") (toUpper)))

    //Calling the function formatNames and required functions inside it to print the format
    println ("\nNiroshan ---> " + (formatNames ("Niroshan") ((name : String) => 
        toUpper (name.slice (0, 2)) + toLower (name.slice (2,8)))))
        //Scala string slicing operator is used to format the text as required

    //Calling the function formatNames and toLower function inside it to print the format
    println ("\nSaman ---> " + (formatNames ("Saman") (toLower)))

    //Calling the function formatNames and required functions inside it to print the format
    println ("\nKumara ---> " + (formatNames ("Kumara") ((name : String) => 
        toUpper (name.slice (0, 1)) + toLower (name.slice (1, 5)) + toUpper (name.slice (5, 6)))))
        //Scala string slicing operator is used to format the text as required
    
    println()
}