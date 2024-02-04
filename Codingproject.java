package week4;

public class Codingproject {


	public static void main(String[] args) {
        //1.
		int[] ages = {3, 9, 23, 64, 2, 8, 28};
        // A. Get the difference of the first and last element with out using any numbers.
		int lengthOfArr = ages.length;
		int difference = Math.abs(ages[lengthOfArr - lengthOfArr] - ages[lengthOfArr - 1]);

		System.out.println("Difference of first and last element is " + difference);
		// B. Created a new array of int called ages2 with 9 elements
		int[] ages2 = new int[ages.length];
		
		
		lengthOfArr = ages2.length;
		ages2[lengthOfArr -1] = 100;
	    difference = Math.abs(ages2[lengthOfArr - lengthOfArr] - ages2[lengthOfArr - 1]);

		System.out.println("Difference of first and last element is " + difference);
        // C.
		int sum = 0;
		for (int i = 0; i < ages2.length; i++) {
			sum += ages2[i];
		}
		double average = sum / lengthOfArr;
		System.out.println("The average age in newAges[] = " + average );

		//2.
       
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		//A. used a loop to iterate through the array and calculate the average number of letters per name.
		sum = 0;
		for (int i = 0; i < names.length; i++) {
			sum += names[i].length();
		}
		average = sum / names.length;
		System.out.println("The average number of letters per name is " + average );
		
		//B. used a loop to iterate through the array and concatenate all the names together
		// separated by spaces

		String allNames = "";
		for (int i = 0; i < names.length; i++) {
			allNames += names[i] + " ";
		}
		System.out.println(allNames);

		//3. 

		System.out.println("Use array[arr.length] to access the last element of an array");

		//4.

		System.out.println("Use array[0] to access the first element of an array");

        //5. Created a new array of int called nameLengths, and created a loop to iterate over the 
		// previously created names array and added the length of each name to the nameLengths array.

		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length(); 
		}

		//6. Created a loop to iterate over the nameLengths array to calculate the sum of all
		// the elements in the array.

		sum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sum += nameLengths[i];
		}
		System.out.println("The sum of all lengths is " + sum);

		//7. Created a method that takes a String, word, and an int, n, as arguments and
		// concatenated the word to itself n number of times.

		//System.out.println(duplicateWord("Woot", 5));
	}

		//8. Created a method that takes two Strings, firstName and lastName, and returns 
		// a full name.
		String firstName = "Hudson";
		String lastName = "Tallon";

		static void String(String firstName, String lastName) {
			String fullName = firstName + lastName;
			System.out.println(fullName);


		//9. Created a method that takes an array of int and returns true if the sum of all the
		// ints in the array is greater than 100.
	    int[] num = { 20, 30, 50, 10};
	    int totalSum = 0;
	   for(int i = 0; i < num.length; i++) {
		   totalSum += num[i];
	    if ( totalSum > 100) {
	    	System.out.println("true");
	    } else {
	    	System.out.println("false");
	    }
		   
		
	}

		//10. created a method that takes an array of double and returns the average of all the elements in the array.
	   

		double[] doubleArr = {0.1, 1.0, 236.4592, 1000.1};
		double sum = 0;
		for (double i = 0; i < doubleArr.length; i++) {
			sum += doubleArr.length;
		}
		System.out.println(sum);

		//11. created a method that takes two arrays of double and returns true if the average of the elements in
		// the first array is greater than the average of the elements in the second array.

	double[] anotherDoubleArr = {2.2, 3.3, 4.4, 5.5};
	double anotherSum = 0;
	for (double i = 0; i < anotherDoubleArr.length; i++) {
		anotherSum += anotherDoubleArr.length;
		if( sum > anotherSum) {
			System.out.println(true);
		}
	}
	 

		//12. created a method called willBuyDrink that takes a boolean isHotOutside, and a double 
	// moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater
	// than 10.50
	boolean isHotOutside = true;
	double moneyInPocket = 12.50;
	if (isHotOutside ==true && moneyInPocket > 10.50) {
		System.out.println("It is Hot Outside " + "Money in pocket is " + moneyInPocket);
	}
	

		//13. I created a method that number of people is greater than number of drinks
        // and if its true it will print back not enough drinks for everyone
       
        int numPeople = 8;
        int numDrinks = 5;
        if( numDrinks < numPeople) {
        	System.out.println("Not enough drinks for everyone");
        }
        }}


