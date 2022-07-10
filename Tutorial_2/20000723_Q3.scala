//20000723 - A.A.D. Harshani
//SCS 2204_Tutorial 2

object Q3 extends App {        

    //Declaring and initializing variables with values
    var a = 2  
    var b = 3
    var c = 4
    var d = 5
    var k = 4.3f
    var g = 4.0f
    

    //Evaluating the expressions
    //***As increment and decrement operators are not there is Scala, 
    //ALL POSTFIX & PREFIX, INCREMENTS & DECREMENTS are evaluated manually
    

    //a) --b * a + c * d--
    b -= 1                       
    println (b * a + c * d)
    d -= 1

    //b) a++
    println (a)
    a += 1

    //c) –2 * ( g – k ) + c
    println (-2 * (g-k) + c)
   
    //d) c = c++
    println (c == c)
    c += 1

    //e) c = ++c * a++
    c += 1
    println ( c == c * a)
    a += 1
}