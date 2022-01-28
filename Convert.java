//JAV-1001 - Lab 1
//Iricher B Supera
//A00237146
//MAPD0101
import java.util.Scanner;

public class convert{

  public static void main(String[] args){
    //scanner object
    Scanner myScannerObject = new Scanner(System.in);
    //variables
    double cval = 0; //converted value
    double dval = 0; //double type value
    String val1; //value
    String val2; //unit
    String tryg; //try again

    do{
      //user input values
      System.out.print("Enter a value to convert:");
      val1 = myScannerObject.next();
      val2 = myScannerObject.next();
      //value err handling
      try {
        dval = Double.valueOf(val1);
      } catch(Exception e){
        System.out.println("Invalid value");
      }
      //conversion process/logic
      if (val2.toLowerCase().equals("km")) {
        cval = dval * 0.62;
        System.out.println(dval + " km is equal to " + cval + " mi");
      } else if (val2.toLowerCase().equals("mi")) {
        cval = dval * 1.61;
        System.out.println(dval + " mi is equal to " + cval + " km");
      } else if (val2.toLowerCase().equals("cm")) {
        cval = dval * 0.39;
        System.out.println(dval + " cm is equal to " + cval + " in");
      }else if (val2.toLowerCase().equals("in")) {
        cval = dval * 2.54;
        System.out.println(dval + " in is equal to " + cval + " cm");
      }else if (val2.toLowerCase().equals("kg")) {
        cval = dval * 2.2;
        System.out.println(dval + " kg is equal to " + cval + " lb");
      }else if (val2.toLowerCase().equals("lb")) {
        cval = dval * 0.45;
        System.out.println(dval + " lb is equal to " + cval + " kg");
      }else if (val2.toLowerCase().equals("g")) {
        cval = dval * 0.04;
        System.out.println(dval + " g is equal to " + cval + " oz");
      }else if (val2.toLowerCase().equals("oz")) {
        cval = dval * 28.35;
        System.out.println(dval + " oz is equal to " + cval + " g");
      }else if (val2.toLowerCase().equals("l")) {
        cval = dval * 4.17;
        System.out.println(dval + " L is equal to " + cval + " cups");
      }else if (val2.toLowerCase().equals("cups")) {
        cval = dval * 0.24;
        System.out.println(dval + " cups is equal to " + cval + " L");
      }else if (val2.toLowerCase().equals("c")) {
        cval = (dval * (9 / 5)) + 32;
        System.out.println(dval + " C is equal to " + cval + " F");
        cval = dval + 273.15;
        System.out.println(dval + " C is equal to " + cval + " K");
      }else if (val2.toLowerCase().equals("f")) {
        cval = (dval - 32) * (5 / 9);
        System.out.println(dval + " F is equal to " + cval + " C");
        cval = (dval - 32) * (5 / 9) + 273.15;
        System.out.println(dval + " F is equal to " + cval + " K");
      }else if (val2.toLowerCase().equals("k")) {
        cval = dval - 273.15;
        System.out.println(dval + " K is equal to " + cval + " C");
        cval = (dval - 273.32) * (9 / 5) + 32;
        System.out.println(dval + " K is equal to " + cval + " F");
      }else{
        System.out.println("Invalid unit");
      }
      //user input repeat conversion
      System.out.print("Want to try again?[yes][no]:");
      tryg = myScannerObject.next();
    } while(tryg.toLowerCase().equals("yes"));

  }

}
