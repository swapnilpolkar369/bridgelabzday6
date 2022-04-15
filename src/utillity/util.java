package utillity;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class util {
	/*
	 * input
	 */
	public static int getPositiveInt() {
		String str;
		int time = 0;
		boolean valid = false;
		while (!valid) {
			try {
				System.out.println("Enter number");
				Scanner sc = new Scanner(System.in);
				str = sc.next();
				time = Integer.parseInt(str);
				if (time >= 0) {
					valid = true;
				}
			}
			catch (NumberFormatException e) {
				System.out.println("Error not a number please try again");
			}
		}
		return time;
	}
	
	/*
	 * Prime Factors
	 */
	public static void primeFactors() {
		int i;
		int n = (Util.getPositiveInt());
		System.out.println("Prime factors are");
        for (i=2; i*i<=n; i++) {
        	while ( n % i ==0 ) {
        		n = n/i;
        		System.out.print(i + " ");
        	}
        }
        
        if (n != 1) {
        	System.out.print(n);
        }
	}
	
	/*
	 * To check year is leap year or not
	 */
	
	public static boolean leapYear(int year) {
		
		//to check year os leap year or not
		if ((year % 4 == 0) && (year % 100 != 0)){
			return true;//System.out.println(year + "is leap year");
		}
		else if ((year % 100 == 0) && (year % 400 == 0)) {
			return true;//System.out.println(year + "is leap year"); 
		}
		else {
			return false;//System.out.println(year + "is leap not year");
		}
	}
	
	
	/*
	 * To check number of digits
	 */
	
	public static int check() {
		int year = 0;
		boolean valid = false;
		
		while (!valid) {
			System.out.println("Enter a 4 digit number");
			Scanner sc = new Scanner(System.in);
			year = sc.nextInt();
			int length = String.valueOf(year).length();
			System.out.println(length);
			if (length < 4 || year <= 0) {
				System.out.println("Enter a 4 digit positive number");
			}
			else {
				valid = true;
			}
		}
		return year;
	}
	
	/*
	 * the number is even or odd
	 */
	
	public static void evenOdd() {
		int n = Util.getPositiveInt();
		
		//to check weather a number is even or odd
		if (n % 2 == 0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
	}
	
	/*
	 * To get positive double
	 */
	
	public static double getPositiveDouble() {
		String str;
		double time = 0;
		boolean valid = false;
		while (!valid) {
			try {
				System.out.println("Enter number");
				Scanner sc = new Scanner(System.in);
				str = sc.next();
				time = Double.parseDouble(str);
				if (time >= 0) {
					valid = true;
				}
			}
			catch (NumberFormatException e) {
				System.out.println("Error not a number please try again");
			}
		}
		return time;
	}
	
	/*
	 * To find Nth harmonic number
	 */
	
	public static void harmonic() {
		double n = Util.getPositiveDouble();
		double i, h = 0;
        if (n != 0) {
        	//to find Nth harmonic value
        	for (i=1; i<=n; i++) {
        		h = h + (1/i);
        	}
        }
        System.out.println("The Nth harmonic value is :" + h);
	}
	
	/*
	 * To find largest among three numbers
	 */
	
	public static void largestNumber() {
		int a = Util.getPositiveInt();
		int b = Util.getPositiveInt();
		int c = Util.getPositiveInt();
		
		//conditions to check which is greater
		if (a > b && a > c) {
			System.out.println(a + " " + "is greater");
		}
		else if (b > c) {
			System.out.println(b + " " + "is greater");
		}
		else {
			System.out.println(c + " " + "is greater");
		}
	}
	
	/*
	 * To find percentage if heads and tails
	 */
	
	public static void headvsTail() {
		int n = Util.getPositiveInt();
		int head = 0;
		int tail = 0;
	    for (int i = 0; i < n; i++) {
	    double rand = (Math.random());
	    System.out.print(rand + " ");
	    
	    //to count head and tail
	    if (rand < 0.5) {
	    	tail = tail + 1;
	    }
	    else {
	    	head = head + 1;
	    }
	}
	    System.out.println("Head :" + head + "|" + "Tail :" + tail);
	    //to calculate percentage
	    int h = (head*100)/n ;
	    int t = (tail*100)/n ;
	    System.out.println("%Head :" + h + "|" + "%Tail :" + t);
	}
	
	/*
	 * print table of power of 2 that is less than or equal to 2^n
	 */
	
	public static void powerOf2() {
		int result = 0;
		System.out.println("Enter a number between 1 to 31");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
        //to calculate power of 2 till i less than or equal to n
		if (num < 31) {
        for (int i=0; i<=num; i++) {
        	result = (int) Math.pow(2, i);
        	System.out.println(result);
        }
	    }
		int length = String.valueOf(result).length();
		if (length == 4) {
			//to check year os leap year or not
			if ((result % 4 == 0) && (result % 100 != 0)){
				System.out.println(result + "is leap year");
			}
			else if ((result % 100 == 0) && (result % 400 == 0)) {
				System.out.println(result + "is leap year"); 
			}
			else {
				System.out.println(result + "is leap not year");
			}
		}
		else {
			System.out.println(result + "is not 4 digit try again");
		}
	}
	
	/*
	 * To find quotient and remainder 
	 */
	
	public static void quotientAndRemainder() {
		System.out.println("Enter dividend");
		int dividend = Util.getPositiveInt();
		System.out.println("Enter divisor");
		int divisor = Util.getPositiveInt();
		
		//to find quotient and remainder
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;
		System.out.println("Quotient :" + quotient);
		System.out.println("Remainder :" + remainder);
	}
	
	/*
	 * To swap two numbers
	 */
	
	public static void swapping() {
		int a = Util.getPositiveInt();
		int b = Util.getPositiveInt();
		System.out.println("Before swapping :" + "a = " + a + " "+ "and" + " " + "b = " + b);
		
		int temp; //temporary variable to store value
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping :" + "a = " + a + " " + "and" + " " + "b = " + b);
	}
	
	/*
	 * to print 2d array with input from user
	 */
	
	public static void printArray() {
		int n=0;
		System.out.println("Enter number of rows");
		int r = Util.getPositiveInt();
		System.out.println("Enter number of columns");
		int c = Util.getPositiveInt();
		//array declaration and creation
		int[][] a = new int[r][c];
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				//System.out.println("Enter elements in array");
				//input array elements
				System.out.println("a[" + i + "]" + "[" + j + "]" + "=");
				Scanner sc = new Scanner(System.in);
				a[i][j] = sc.nextInt();				
			}
		  
		}
		//printing array elements
		System.out.println("Array a is :");
		try (PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out),true)) {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	}
    /*
     * Sum of three integers from an array that adds to zero
     */
	
	public static int triplets() {
		System.out.println("Enter the length of an array");
		int n = Util.getPositiveInt();
		int sum = 0;
		//array initialization and creation
		int[] a = new int[n];
		//input the elements of an array
		System.out.println("Enter the elements in array :");
		for (int i = 0; i<n; i++) {	
			System.out.print("a["+i+"]" + "=");
			Scanner sc = new Scanner(System.in);
			a[i] = sc.nextInt();
		}
		
		int triplets = 0;
		//checking for triplets
		System.out.println("The triplets are");
		for (int i=0; i < n-2; i++) {
			for (int j=i+1; j < n-1; j++) {
				for (int k=j+1; k < n; k++) {
					sum = a[i] + a[j] + a[k];
					if (sum == 0) {
						triplets = triplets + 1;
						System.out.println(a[i] +","+a[j]+","+a[k]);
					}
				}
			}
		}
		System.out.println("number of triplets :" + triplets);
		return sum;
	}
	
	/*
	 *  Program to calculate Euclidean distance from the point (x, y) to the origin (0, 0)
    */
	 
	public static void distance() {
		System.out.println("Enter x point");
		int x = Util.getPositiveInt();
		System.out.println("Enter y point");
		int y = Util.getPositiveInt();
		
		double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		System.out.println("Euclidean distance from point (x,y) to the origin  (0,0) :" + d);
     }
     
	/*	
	 * Program to find out the roots of the quadratic equation
	 */

	public static void getRoots() {
		System.out.println("Enter the value of a");
		int a= Util.getPositiveInt();
		System.out.println("Enter the value of b");
		int b = Util.getPositiveInt();
		System.out.println("Enter the value of c");
		int c = Util.getPositiveInt();
		
		double root1, root2;
	    double determinant = (b*b) - (4*a*c);
	    if (determinant > 0) {
	    	root1 = (-b + Math.sqrt(determinant))/2*a;
	    	root2 = (-b - Math.sqrt(determinant))/2*a;
	    	System.out.println("The roots of equation are" + " " + root1 + " " + "and" + root2 );
	     }
	    else if (determinant == 0) {
	    	root1 = -b/(2*a);
	    	root2 = -b/(2*a);
	    	System.out.println("The roots of equation are" + " " + root1 + " " + "and" + root2 );
	     }
	    else {
	    	double x = -b/(2*a);
	    	double y = Math.sqrt(-determinant)/2*a;
	    	System.out.println("Roots are" + x + "+" + y + "i" + " " + "and" + " " + x + "-" + y + "i");
	     }
	}
	
	/*
	 * Program  that takes two double command-line arguments temperature t (in Fahrenheit) and wind speed 
	 * v and prints the wind chill.
	 */

	public static double windChill() {
		int t,v;
		double w = 0;
		System.out.println("Enter the value of temperature t");
		t = Util.getPositiveInt();
		System.out.println("Enter the value of wind speed");
		v = Util.getPositiveInt();
		//condition to use formula of wind chill
		if (t < 50 && v < 120 && v > 3) {
			w = 35.74 + (0.6215 * t) + ((0.4275 * t - 35.75) * Math.pow(v, 0.16));
			System.out.println("The effective temperatute (the wind chill) to be :" + w);
		}
		else {
			System.out.println("Enter the value of temperature and wind speed within range");
		}
		return w;
	}

	/*
	 * program to print fibonacci series till nth term
	 */
	public static void fibonacciSeries() {
		int num1, num2, num3;
		num1 = 0;
		num2 = 1;
		System.out.println("Enter the number of terms you want");
		//input the number of terms you want
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(num1 + "," + num2 + ",");
		//calculating next term
		for (int i = 3; i <= n; i++) {			
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.print(num3 + ",");
		}
	}
	
	/*
	 * program to print the entered number is perfect number or not
	 */

	public static void perfectNumber() {
		int num;
		int sum = 0;
		//input number
		System.out.println("Enter the number");
		num = Util.getPositiveInt();
		//calculating the sum of the divisors
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		//check condition for perfect number
		if (num == sum) {
			System.out.println(num + " " + "is a perfect number");
		}
		else {
			System.out.println(num + " " + "is not a perfect number");
		}
	}
	
	/*
	 * Program to check entered number is prime number or not
	 */

	public static void checkPrimeNumber() {
		int num,count = 0;
		num = Util.getPositiveInt();
		if (num == 0 || num == 1) {
			System.out.println(num + "is not prime number");
		}
		// condition for prime number
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println(num + " " + "is not prime number");
				count = 1;
				break;
			}
		}
		if (count == 0) {
			System.out.println(num + " " + "is prime number");
		}
	}
	
	/*
	 * Program to reverse a number
	 */

	public static int reverseNumber() {
		int num, rem, rev;
		rev = 0;
		num = Util.getPositiveInt();
		while ( num > 0) {
		    rem = num % 10;
		    rev = rev*10 + rem;
		    num = num/10;
		}
		System.out.println("The reverse number is" + rev);
		return rev;
	}

	/*
	 * Simulate stopwatch program
	 */
	
	public static void calculateTime() {
			Scanner scanner = new Scanner(System.in);	
			long time1 = 0, time2 = 0;	//variables to store times of clicks
			System.out.println("Press the key \"Enter\" twice two measure the time difference between them");
			String input = scanner.nextLine();	//stores user input

			if(input.isEmpty()) {	//	enter key pressed
				time1	= System.currentTimeMillis();
			}

			input = scanner.nextLine();
			if(input.isEmpty()) {	//	enter key pressed
				time2	= System.currentTimeMillis();
			}
			scanner.close();
			System.out.println("Diffrence between two clicks is: " + ((int)(time2 - time1) / 1000) + " seconds.");
		}
	
	/*
	 * Program to generate random coupon number
	 */

	public static void couponNumber() {
		char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
	     int max = 100000000;
	     int random = (int) (Math.random()* max);
	     StringBuffer sb = new StringBuffer();
	     while (random>0)
	     {
	         sb.append(chars[random % chars.length]);
	         random /= chars.length;
	     }
	     String couponCode = sb.toString();
	     System.out.println("Coupon Code: "+couponCode);
	}
}