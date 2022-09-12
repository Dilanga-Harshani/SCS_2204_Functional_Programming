//20000723 - A.A.D. Harshani
//SCS 2204_Tutorial 7

object Q1_Q2 extends App {

    val a = new Rational (1,2)
    println("\nNegetion : " + a.neg)

    val x = new Rational (3,4)
    val y = new Rational (5,8)
    val z = new Rational (2,7)
  
    val b = x-y-z
    
    println("\nx - y - z : " + b)
}

class Rational (n : Int, d : Int) {

    def num = n
    def den = d

    def neg = new Rational(-this.num, this.den)
    
    def add (r : Rational) = new Rational (this.num * r.den + this.den * r.num, this.den * r.den)
    def -(r:Rational) = this.add(r.neg)

    override def toString(): String = num + "/" + den

}
