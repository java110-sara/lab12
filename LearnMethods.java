//author: Sara Russert
//date: 13 February 2024
//file: LearnMethods.java

// import statements for scanner and random classes
import java.util.Scanner;
import java.util.Random;

public class LearnMethods {
   public static void main(String[] args) {
      // declare int vars for two numbers to find gcd and the gcdVal
      int num1, num2;
      int gcdVal;
      
      // declare string vars for user's message
      String userInput;
      
      // create Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("The program will display a string that you specify.");
      
      // prompt the user for a string
      System.out.print("Enter the string you wish to display:  ");
      userInput = keyboard.nextLine();
      
      // call the method to display the user's input
      displayString(userInput);
      
      System.out.println("The program will display a random integer in the range of [0,20]");
      
      // call the method to generate and display a random integer
      displayRandomInt();
      
      System.out.println("The program will calculate the gcd of two ints.");
      
      // prompt the user to enter two ints, and assign them
      System.out.print("Enter the first int:  ");
      num1 = keyboard.nextInt();
      
      System.out.print("Enter the second int:  ");
      num2 = keyboard.nextInt();
      
      // call the gcd method and assign the return val to the gcdVal var
      gcdVal = gcd(num1, num2);
      
      // display the gcd result to the user
      System.out.println("The gcd of " + num1 + " and " + num2 + ": " + gcdVal);
      
   }


   /**
      displayString
      method to display a string
      @param String str - the string to be printed
      @return void
   */
   public static void displayString(String str) {
      // display the string that is passed into the method
      System.out.println(str);
   }
   
   /**
      displayRandomInt
      method to display a random integer
      @param none
      @return void
   */
   public static void displayRandomInt() {
      // create random object to get a random number
      Random randomObj = new Random();
      
      // local var for random num
      int randomNum = 0;
      
      // local var for ceiling non-inclusive
      int randomMax = 21;
      
      // get the num
      randomNum = randomObj.nextInt(randomMax);
      
      // display the random integer value
      System.out.println("A random number in range [0," + (randomMax-1) + "]: " + randomNum);
   }

   /**
      gcd
      method to compute the greatest common denominator
      @param1 int a - first integer
      @param2 int b - second integer
      @return int - the gcd of the two ints
   */
   public static int gcd(int a, int b) {
      // declare local var for remainder
      int remainder = 0;
      
      // use while loop to determine gcd of a and b
      while (b != 0) {
         remainder = a % b;
         a = b;
         b = remainder;
      }
      
      // return the value of a
      return a;
   }
}