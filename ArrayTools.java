//JAV-1001 - Lab 2
//Iricher B Supera
//A00237146
//MAPD0101
import java.util.Scanner;
import java.util.Random;

public class ArrayTools{

  public static void main(String[] args){

    //scanner object
    Scanner myScannerObject = new Scanner(System.in);
    //variables
    String strEncrypt;
    String valEncrypt;
    String cipher;
    String arrSearch;
    int valEncryptInt = 0;
    int arrSearchInt = 0;

    //encrypt string ***
    System.out.print("Enter a string to encrypt: ");
    strEncrypt = myScannerObject.next();
    System.out.print("Enter a value to encrypt with: ");
    valEncrypt = myScannerObject.next();

    try {
      valEncryptInt = Integer.valueOf(valEncrypt);
    } catch(Exception e){
      System.out.println("Invalid value");
    }

    cipher = StringEncrypt(strEncrypt, valEncryptInt);
    System.out.print(" The encrypted string is " + cipher);
    System.out.println("\nDecrypting " + cipher + " with " + (valEncryptInt * -1) + " is...");
    System.out.println(" " + strEncrypt);

    //array random values ***
    int[] arrRandVal = GenerateArrRandValues(10, 99);

    System.out.print("Testing methods with [");
    PrintArray(arrRandVal);
    System.out.println(" ]");

    //array average ***
    System.out.println(" The average is " + ArrayAverage(arrRandVal));

    //array search ***
    System.out.print("Enter a value to search for: ");
    arrSearch = myScannerObject.next();
    try {
      arrSearchInt = Integer.valueOf(arrSearch);
    } catch(Exception e){
      System.out.println("Invalid value");
    }

    if (ArrayContains(arrRandVal, arrSearchInt) == true) {
      System.out.println(" The array contains " + arrSearch);
    }else{
      System.out.println(" Array element " + arrSearch + " does not exist");
    }

    //array reverse ***
    int[] arrReverse = ArrayReverse(arrRandVal);

    System.out.print("The array reversed is [");
    PrintArray(arrReverse);
    System.out.println(" ]");

}

  //method GenerateArrRandValues - generate random integer values
  static int[] GenerateArrRandValues(int arrLength, int uppBound){

    int[] arrRandVal = new int[10];
    Random rand = new Random();
    int intRand;

    for(int i = 0; i < arrLength; i++){
      intRand = rand.nextInt(0, uppBound);
      arrRandVal[i] = intRand;
    }
    return arrRandVal;

  }

  //method PrintArray - print array elements on screen
  static void PrintArray(int[] arrElements){

    for(int i = 0; i < arrElements.length; i++){
      System.out.print(" " + arrElements[i]);
    }

  }

  //method ArrayAverage - get the average of array elements
  static double ArrayAverage(int[] arrRandVal){

    double arrAverage = 0;

    for(int i = 0; i < arrRandVal.length; i++){
      arrAverage += arrRandVal[i];
    }
    arrAverage = arrAverage / arrRandVal.length;
    return arrAverage;

  }

  //method ArrayContains - check if array contains an element
  static boolean ArrayContains(int[] arrRandVal, int arrSearch){

    boolean contains = false;

    for(int i = 0; i < arrRandVal.length; i++){
      if ( arrSearch == arrRandVal[i] ) {
        contains = true;
        break;
      }
    }
    return contains;

  }

  //method ArrayReverse - reverse order of array elements
  static int[] ArrayReverse(int[] arrRandVal){

    int[] arrReverse = new int[10];
    int ctr = 0;

    for(int i = arrRandVal.length-1; i >= 0; i--){
      arrReverse[ctr] = arrRandVal[i];
      ctr++;
    }
    return arrReverse;

  }

  //method StringEncrypt - encrypt string using ceasar cipher
  static String StringEncrypt(String strEncrypt, int valEncryptInt){

    String letters = "abcdefghijklmnopqrstuvwxyz";
    String cipher = "";
    int indx = 0;

    for (int i = 0; i < strEncrypt.length(); i++) {

      indx = letters.indexOf(Character.toLowerCase(strEncrypt.charAt(i)));
      indx = indx + valEncryptInt;
      if (indx >= letters.length()) {
        indx = indx - letters.length();
      }
      cipher = cipher + "" + letters.charAt(indx);
      indx = 0;

    }
    return cipher;

  }

}
