import scala.io.StdIn

object CCipher extends App {

	//Alphabet to be used in encryption and decryption
	val a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

	//Getting user input for the no of shifts and processing it
	val shift = (scala.io.StdIn.readLine ("\nPlease enter the no. of shifts: ").toInt + a.size) % a.size

	//Getting user input for the text to be ecrypted or decrypted
	val text = scala.io.StdIn.readLine ("\nMessage to be encrypted or decrypted: ")

	//Encrypting or decrypting data by passing the text through a map
	val cipher = text.map ((letter : Char) => { 

    	//Checking whether the relevant letter is present in the alphabet
		val i = a.indexOf (letter.toUpper)

		if (i == -1) {
			//If the letter is not there, it will not be changed
			letter	
		} else {
			//If the letter is present, it is shifted by given amount
			a((i + shift) % a.size)
		} 

	});

	//Printing the encrypted or decrypted text
	println("\n****************\n\nOutput : " + cipher + "\n\n****************\n");
	
}