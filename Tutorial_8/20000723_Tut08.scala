//20000723 - A.A.D. Harshani
//SCS 2204_Tutorial 8

object Tutorial_08 extends App {

    //Creating a Point as a case class
    case class Point (x : Int, y : Int) {

        //Defining a method to add two points
        def + (p : Point) : Point = Point (this.x + p.x, this.y + p.y)

        //Defining a method to move a point by given values
        def move (dx : Int, dy : Int) : Point = Point (this.x + dx, this.y + dy)

        //Defining a method to return the distance between 2 points
        def distance (p : Point) : Point = Point (this.x - p.x, this.y - p.y)

        //Defining a method to invert x and y coordinates of a point
        def invert () : Point = Point (x = this.y, y = this.x)

    }

    val p1 = Point (2, 3)
    val p2 = Point (8, 13)

    val p3 = p1 + p2

    val p4 = p1.move(3,5)

    val p5 = p2.distance(p1)
    
    val p6 = p2.invert()

    println ("\nInitial p1: " + p1)
    println("Initial p1: " + p2)

    println("\np1 + p2 = " + p3)

    println("\nDistance between p2 and p1: " + p5)

    println("\np1 after moving by (3, 5): " + p4)
    
    println("\np2 after inverting: " + p6 + "\n") 

}
