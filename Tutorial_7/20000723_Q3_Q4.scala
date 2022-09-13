//20000723 - A.A.D. Harshani
//SCS 2204_Tutorial 7

object Q3_Q4 extends App {

    //Creating Account class
    class Account (val accId : Int, var balance : Double = 0.0) {

        //Withdrawing money
        def withdraw (amount : Double) : Unit = {
            this.balance = this.balance - amount
        }

        //Depositing money
        def deposit (amount : Double) : Unit = {
            this.balance = this.balance + amount
        }

        //Transfering money from one account to another
        def transfer (account : Int, amount : Double) : Unit = {
            val transferAcc = find (account, accountList)
            if (balance < 0.0) println ("No enough balance")
            else {
                this.withdraw (amount)
                transferAcc(0).deposit(amount)
            }
        }

        override def toString = "[" + accId + " : " + balance +"]"

    }

    //List of accounts
    var accountList:List [Account] = List ()

    //Creating new accounts
    def accCreate (accId :  Int) : Unit = {
        val acc = new Account (accId)
        accountList = accountList ::: acc :: Nil  
    }

    //Finding a given account from the list
    val find = (a : Int, b : List[Account]) 
        => b.filter (account => account.accId.equals(a))

    //Finding accounts with negative balance
    val negative = (b : List[Account]) 
        => b.filter (account => account.balance < 0.0)

    //Calculating the total balance of accounts
    val totalBalance = (b : List[Account]) 
        => b.foldLeft (0.0)((x, y) => x + y.balance)

    //Calculating the final balance of accounts after adding interest
    val postinterest = (b : List[Account]) 
        => b.map (account => if(account.balance > 0) account.balance * 1.05 else account.balance * 1.1)

    //*********************************//

    //Creating new accounts and depositing money in them
    accCreate (1001)
    find (1001, accountList)(0).deposit(1000)

    accCreate (1002)

    accCreate (1003)
    find (1003, accountList)(0).deposit(-100.0)

    //Transfering money
    println ("\nAccount List before transfer : " + accountList)

    //Find the account and transfer money
    find (1001, accountList)(0).transfer(1002, 200)

    println ("\nAccount List after transfer : " + accountList)

    //List of accounts negative balances
    println ("\nAccounts with negative balance :" + negative(accountList))

    //Sum of all account balances
    println ("\nSum of total balances : " + totalBalance(accountList))

    //Final balances of all accounts after adding interest
    println ("\nFinal balances with interest : " + postinterest(accountList) + "\n")

}
