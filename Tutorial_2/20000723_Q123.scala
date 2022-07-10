//20000723 - A.A.D. Harshani
//SCS 2204_Tutorial 2

object Q123 extends App {        //Q1. Consider the following variables
                                //Q2. Declare the variables and assign initial values as follows
    var k, i, j = 2             //Declaring and assigning values
    var m, n = 5
    var f = 12.0f
    var g = 4.0f
    var c = 'X'
                                //Q3. Evaluate the expressions
    //a)
    println (k + 12 * m)    

    //b)    
    println (m / j)

    //c)
    println (n % j)

    //d)
    println (m / j * j)

    //e)
    println (f + 10 * 5 + g)

    //f) ++i * n
    i+=1                        //There is no ++ operator in scala, so the increment had to be done manually
    println (i * n)
}