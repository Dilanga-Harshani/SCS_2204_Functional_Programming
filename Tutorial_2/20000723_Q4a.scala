//20000723 - A.A.D. Harshani
//SCS 2204_Tutorial 2

object Q4a extends App {
    
    //Calculating the normal salary by multiplying 250 with no of hours
    def normal (n_hrs : Int) : Int = n_hrs * 250

    //Calculating the OT salary by multiplying 85 with no of hours
    def ot (ot_hrs : Int) : Int = ot_hrs * 85

    //Calculating total salary (Getting summation by calling above 2 function)
    def tot_sal (n_hrs : Int, ot_hrs : Int) : Int = normal(n_hrs) + ot(ot_hrs)
    
    //Calculating the final take home salary including tax reduction
    def final_sal (n_hrs : Int, ot_hrs : Int) : Double = tot_sal(n_hrs, ot_hrs) *  .88

    //Printing final amount by calling final_sal fuction with no of hours
    printf ("Take home salary = Rs. %.2f", final_sal(40,30))

}