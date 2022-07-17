//20000723 - A.A.D. Harshani
//SCS 2204_Tutorial 3

object Q3 extends App {

    //Defining the function to find the volume of a sphere with radius r
    def volume (r : Int) : Double = 4 / 3 * math.Pi * r * r * r

    //Calling the function volume with 5 as the radius and printing the result
    println ("\nVolume of a sphere with radius 5 = " + volume (5) + " cubic units\n")
    
}