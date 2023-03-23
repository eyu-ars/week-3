
// Subject: Arrays & Methods Lab

package week03;

import java.lang.reflect.Array;
// import java.util.Arrays;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;

public class Week03ArraysAndMethodsLab {

  public static void main(String[] args) {

    //
    // Arrays:
    //

    // 1. Create an array with the following values 1, 5, 2, 8, 13, 6
    System.out.println("\n Q1. Create an array with the following values 1, 5, 2, 8, 13, 6");

    int[] array = {1, 5, 2, 8, 13, 6};

    

    // 2. Print out the first element in the array
    System.out.println("\n Q2. Print out the first element in the array");

    System.out.println(array[0]);



    // 3. Print out the last element in the array without using the number 5
    System.out.println("\n Q3. Print out the last element in the array without using the number 5");
    System.out.println(array[array.length - 1]);



    // 4. Print out the element in the array at position 6, what happens?
    System.out.println("\n Q4. Print out the element in the array at position 6, what happens?");
    // System.out.println(array[6]);
    System.out.println(" ArrayIndexOutOfBoundsException is thrown \n "
        + " \"Exception in thread \"main\" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6\" ");



    // 5. Print out the element in the array at position -1, what happens?
    System.out.println("\n Q5. Print out the element in the array at position -1, what happens? ");

    // System.out.println(array[-1]);
    System.out.println(" ArrayIndexOutOfBoundsException is thrown \n "
        + " \"Exception in thread \"main\" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 6\" ");



    // 6. Write a traditional for loop that prints out each element in the array
    System.out
        .println("\n Q6. Write a traditional for loop that prints out each element in the array");

    for (int i = 0; i < array.length; i++)
      System.out.print(array[i] + " ");

    System.out.println("\n");



    // 7. Write an enhanced for loop that prints out each element in the array
    System.out
        .println("\n Q7. Write an enhanced for loop that prints out each element in the array");

    for (int element : array)
      System.out.print(element + " ");

    System.out.println("\n");



    // 8. Create a new variable called sum, write a loop that adds
    // each element in the array to the sum
    System.out.println("\n Q8. Create a new variable called sum, write a loop that adds "
        + "\n each element in the array to the sum");

    int sum = 0;
    for (int element : array)
      sum += element;
    System.out.print("Array sum is: " + sum);

    System.out.println("\n");


    // 9. Create a new variable called average and assign the average value of the array to it
    System.out.println(
        "\n Q9. Create a new variable called average and assign the average value of the array to it");

    NumberFormat formatter = new DecimalFormat("#0.00");

    double average = 0;

    for (int element : array)
      average += element;
    average = average / array.length;

    System.out.print("Array average is: " + formatter.format(average));

    System.out.println("\n");



    // 10. Write an enhanced for loop that prints out each number in the array
    // only if the number is odd
    System.out
        .println("\n Q10. Write an enhanced for loop that prints out each number in the array "
            + "\n only if the number is odd");

    for (int element : array)
      if (element % 2 == 1)
        System.out.print(element + " ");

    System.out.println("\n");



    // 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
    System.out.println(
        "\n Q11. Create an array that contains the values \"Sam\", \"Sally\", \"Thomas\", and \"Robert\" ");

    String[] names = {"Sam", "Sally", "Thomas", "Robert"};

    for (String name : names)
      System.out.print(name + " ");

    System.out.println("\n");



    // 12. Calculate the sum of all the letters in the new array
    System.out.println("\n Q12. Calculate the sum of all the letters in the new array");

    int totalLetterCount = 0;
    for (String name : names)
      totalLetterCount += name.length();

    System.out.println(totalLetterCount);


    //
    // Methods:
    //

    // 13. Write and test a method that takes a String name and prints out a greeting.
    // This method returns nothing.
    System.out.println(
        "\n Q13. Write and test a method that takes a String name and prints out a greeting. This method returns nothing.");

    greeting("John Smith");



    // 14. Write and test a method that takes a String name and
    // returns a greeting. Do not print in the method.
    System.out.println("\n Q14. Write and test a method that takes a String name and returns a greeting.  Do not print in the method.");

    System.out.println(secondGreeting("John Smith"));



    // Compare method 13 and method 14:
    // a. Analyze the difference between these two methods.
    // b. What do you find?
    // c. How are they different?
    System.out.println("\n Q. Compare method 13 and method 14:");

    System.out.println("Method 13 does not return anything. The return type is void. "
        + "On the other hand, method 14 returns a string value.");



    // 15. Write and test a method that takes a String and an int and
    // returns true if the number of letters in the string is greater than the int
    System.out.println("\n Q15. Write and test a method that takes a String and an int and"
        + "\n returns true if the number of letters in the string is greater than the int");

    System.out.println(isStringLettersGreaterthanIntegerValue("Nevada", 4));



    // 16. Write and test a method that takes an array of string and a string and
    // returns true if the string passed in exists in the array
    System.out
        .println("\n Q16. Write and test a method that takes an array of string and a string and"
            + "\n returns true if the string passed in exists in the array");

    String strParameter = "Nevada";
    String[] strParameterArray = {"Utah", "Arizona", "Nevada", "California"};
    System.out.println(isTheStringExistInTheArray(strParameter, strParameterArray));



    // 17. Write and test a method that takes an array of int and
    // returns the smallest number in the array
    System.out.println("\n Q17. Write and test a method that takes an array of int and"
        + "\n returns the smallest number in the array");

    int[] intArgumentArray = {12, 4, 6, 100, 1};
    int smallestValue = smallestNumber(intArgumentArray);
    System.out.println("The smallest number is: " + smallestValue);



    // 18. Write and test a method that takes an array of double and
    // returns the average
    System.out.println(
        "\n Q18. Write and test a method that takes an array of double and returns the average");


    double[] doubleArgumentArray = {12, 4, 6, 100, 1};
    average = returnAverage(doubleArgumentArray);
    System.out.println("The average is: " + formatter.format(average));



    // 19. Write and test a method that takes an array of Strings and
    // returns an array of int where each element
    // matches the length of the string at that position
    System.out.println("\n Q19. Write and test a method that takes an array of Strings and"
        + "\n returns an array of int where each element matches the length of the string at that position \n");


    String[] stringArgumentArray = {"John", "Smith", "Bob", "Sam"};

    System.out.println("String array element:");
    for (String value : stringArgumentArray)
      System.out.print(value + " ");

    int[] eachStringLength = eachStringArrayElementLength(stringArgumentArray);

    System.out.println("\n Length of each string array element:");
    for (int value : eachStringLength)
      System.out.print(value + " ");
    System.out.print("\n");
    


    // 20. Write and test a method that takes an array of strings and
    // returns true if the sum of letters for all strings with an even amount of letters
    // is greater than the sum of those with an odd amount of letters.
    System.out.println("\n Q20. Write and test a method that takes an array of strings and returns true if the sum of letters"
        + "\n for all strings with an even amount of letters is greater than the sum of those with an odd amount of letters \n");
    
    System.out.println("String array element:");
    for (String value : stringArgumentArray)
      System.out.print(value + " ");
    System.out.println("\n" + isEvenStringLengthGreaterthanOdd(stringArgumentArray));
    
    

    // 21. Write and test a method that takes a string and
    // returns true if the string is a palindrome
    System.out.println("\n Q20. Write and test a method that takes a string and returns true if the string is a palindrome \n");
    
    System.out.println(isPalindrome("noon"));


  }



  // Method 13:
  private static void greeting(String name) {

    System.out.println("Hello, " + name);
  }



  // Method 14:
  private static String secondGreeting(String name) {

    return "Hello, " + name;
  }



  // Method 15:
  private static boolean isStringLettersGreaterthanIntegerValue(String str, int number) {

    if (str.length() > number)
      return true;
    return false;
  }



  // Method 16:
  private static boolean isTheStringExistInTheArray(String str, String[] strArray) {

    for (String value : strArray)
      if (value.equalsIgnoreCase(str))
        return true;
    return false;
  }



  // Method 17:
  private static int smallestNumber(int[] listOfNumbers) {

    int smallestNumber = listOfNumbers[0];
    for (int number : listOfNumbers)
      if (smallestNumber > number)
        smallestNumber = number;

    return smallestNumber;
  }

  // Method 18:
  private static double returnAverage(double[] listOfDoubleArray) {

    double sum = 0.0;
    for (double number : listOfDoubleArray)
      sum += number;

    return sum / listOfDoubleArray.length;
  }


  // Method 19:
  private static int[] eachStringArrayElementLength(String[] listOfStringArray) {

    int[] eachStringLength = new int[listOfStringArray.length];
    for (int index = 0; index < listOfStringArray.length; index++)
      eachStringLength[index] = listOfStringArray[index].length();

    return eachStringLength;
  }


  // Method 20:
  private static boolean isEvenStringLengthGreaterthanOdd(String[] listOfStringArray) {

    int oddSum = 0, evenSum = 0;
    
    for (int index = 0; index < listOfStringArray.length; index++)
      if(listOfStringArray[index].length() % 2 == 0)
        evenSum += listOfStringArray[index].length();
      else
        oddSum += listOfStringArray[index].length();

    if(evenSum > oddSum)
      return true;
    else
      return false;
  }


  // Method 21:
  public static boolean isPalindrome(String str) {
    for (int index = 0; index < str.length() / 2; index++) {
        if (str.charAt(index) != str.charAt(str.length() - index - 1)) {
            return false;
        }
    }
    return true;
}

}
