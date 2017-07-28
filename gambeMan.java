
/**
*This idea and piece of code is all made by  Ntirpang Louis, E-mail: nlouis862@gmail.com
*For thebigbrains.org
*It's open source so anyone can copy and test the code.
*-------------------------------------------
*_______________DISCLAIMER:______________________
*thebigbrains.org AND Ntirpamg Louis are not responsible for any hardware or software damages this code may cause to your System.
*So RUN the code at your own full risk.
*Since the code was tested before deployment, the risks are very negligeable 
*Except due to hardware/software differences/changes but we hope it will not be the case since java run everywhere.
* Soyou can run the codes with no fear of damages. 
*
*
                                      *ALGORITHMIC THINKING.
*
*
***********Throw Cowries**************
*
*1. Get the number of cowries.
*2. Get the number of sides each cowries has.
*3. For each cowry assign to it a container A.K.A variable
*4. The cowry value should vary from 1 to the number of sides of each cowry inclusive == 2.
*5. Keep schuffling the cowry till all of them return thesame value, then stop and return the number of schuffles you made.
*6. Print the returned schuffle.
*
*---------------------------------------------------------------------------------------------------------------------------
*---------------------------------------------------------------------------------------------------------------------------
*
*1. The gambeMan has a mystical number of cowries which is 7(As of the mystical seven days in a week)
*2. The cowries has just 2 sides i.e face and horn. let face = 1 adn horn = 2
*3. If the schuffle is made and thrown and all seven cowries are thesame.
*	i. Then the gods are happy and a positive result is obtained.
*4. If the schuuffle is made and thrown and all the seven cowries are not thesame.
*	ii. Then it implies the gods are angry and a negative result is obtained. 
*/


class gambeMan{

	public static int schuffleCowry(){

//The array cowries[] holds the logical value representation of each cowry.
		int[] cowries = new int[7]; int numberOfSides = 2;

		int numberOfCowries = cowries.length;
		int sum = 0 , ret = 1;

		for(int i = 0; i <= numberOfCowries-1; i++){

			//Preparing the spirit of uncertainty inorder to get random values/responses from the gods 
			//The multiplication and addition is done inorder to make the result contain a whole number from 1-2                             /* Notice that only random responses 
			double ran = (Math.random() * 2) + 1;                                                                                           //Will guaranty some income for the "gambeMan"
			int newRan = (int) ran; //Casting the double ran to an interger newRan                                                         //So the code makes sure the gods give more of 
			cowries[i] = newRan;    //On every loop a random number 1-2 is assigned to the corresponding index in cowries[]               //Negative random responses to guaranty the financial 
                                                                                                                                                     //Sustainability of the gambeMan
			//Printing to the screen the value of each cowry after schuffle                                                             //To do that the code selects just two summed outcomes
 			System.out.println(cowries[i]);                                                                                            //As positive and the remaining === negative

			//Summing the values of the cowries.
			 sum = sum + cowries[i];

			 //The empty space is just to enhance output readability on runtime 
			 System.out.println(" ");

		}


		if (sum == 7 || sum == 14) {

			System.out.println("The gods accepted the offers");

		}
		else{

			System.out.println("The gods are not happy with you");

		}
		
return ret; //ret is will normally be == 1. Which indicates the number of scheffle made

}

	public  static void main(String[] args) {

		schuffleCowry(); //Calling the function schuffleCowry() in the the main function.

	}
}


/*

** Q  U E S T I O N S. **

1. How will the number of cowries affect the flow of our program ?
2. How will the numbers of sides of each cowry affect the flow of our program ?

*/
