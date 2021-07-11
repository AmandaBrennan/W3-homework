import java.util.stream.IntStream;

public class Application {

	public static void main(String[] args) {
		//question one*
		
		int[] ages= {3, 9, 23, 64, 2, 8, 28, 93};
		
		for (int i =0; i < ages.length; i++) {
		//*	System.out.println(ages[i]);
		}
		int lengthOfAges = ages.length;
		int differenceFirstLast = ages[lengthOfAges -1]-ages[0];
		System.out.println("Subtracting the first age in the array from the last gives age " + differenceFirstLast);
		
		double sum1 = 0;
		for (int age : ages) {
			sum1 += age;
		}
		double averageAge = sum1 / ages.length;
		System.out.println("The average age is: "+averageAge);
			  
	   //question two*
		
		String[] names = {"Tommy", "Sally", "Buck", "Bob"};
		double sumOfLetters = 0;
		for (int i = 0 ; i < names.length; i++) {
			sumOfLetters += names[i].length();
		System.out.println(sumOfLetters);
		}
		
		double averageLetters = sumOfLetters / names.length;
		System.out.println("The average number of letters per name is: "+averageLetters);
	
		String listNames = "";
		for (int i = 0 ; i<names.length; i++) {
			listNames += names[i] + " ";
		}
		System.out.println(listNames);
			
		//question three*
	
        System.out.println("To access the last element of an array use [array-1] for locating the last element of an array");
		
		//question four*
	
	    System.out.println("To access the first element of an array use [0] for the first position of the array");
		
		//question five
	    int[] nameLengths = new int [names.length];
	    for (int i = 0; i<names.length; i++) {
		 nameLengths[i] = names[i].length();
	    }

		//question six
	    int sum = 0;
	    for (int i = 0; i<nameLengths.length; i++) {
		sum += nameLengths[i];
	    }
	    System.out.println(sum);
	
		//question seven
	
	    System.out.println(multiWord("Hello",3));
	 	
		//question eight*
	
	    System.out.println(fullName("Harry","Potter"));
	
		//question nine
		
	    int [] oneHundred = {3,54,5,};
	    System.out.println(isSumGreater(oneHundred));
	
		//question ten*
	
	    double [] doubles= {34.9, 342.0, 64.1, 343.5};
	    System.out.println(calcAverage(doubles));
	
		//question eleven*
	   double[] firstArray = {34.4, 23.7, 43.9};
	   double[] secondArray = {23.9, 10.2, 3.8};
	   System.out.println(isFirstLarger(firstArray, secondArray));
		
		//question twelve*
       System.out.println(willBuyDrink(true, 11.25));
	
		//question thirteen*
	//You should always tip your bartender if you want another drink ;)
	
	   if(tipYourBartender(4.0)) {
		System.out.println("Thank you! Want another drink?");
	   }else {
		System.out.println("Sorry we are closed.");
	   }	
     }
	
	//METHODS
	
 //method for problem 7
static String multiWord(String word, int n) {
	String multiWord = "";
	for(int i =0; i<n; i++) {
		multiWord += word;
	}
	return multiWord;
	}
 
//method for problem 8

static String fullName(String firstName, String lastName) {
	return firstName + " "+lastName;
}

//method for problem 9

static boolean isSumGreater(int[] oneHundred) {
    int totalSum = IntStream.of(oneHundred).sum();
    return totalSum >100;
}

//method for problem 10

static double calcAverage(double[] array) {
	double aveSum = 0;
	for (double number : array) {
		aveSum += number;
	}
	return aveSum / array.length;
}

//method for problem 11

static boolean isFirstLarger(double[] firstArray, double[] secondArray) {
return calcAverage(firstArray) > calcAverage(secondArray);
}

// method for problem 12

static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
    if (isHotOutside == true && moneyInPocket >= 10.50) {
    	return true;
    }else {
    	return false;
    }
}

//method for problem 13

static boolean tipYourBartender(double howMuch) {
	
if (howMuch >= 1.50) {

	return true;
}else {
	return false;
}
      }
}

