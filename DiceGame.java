//JAV-1001 - Lab 3
//Iricher B Supera
//A00237146
//MAPD0101
public class DiceGame{

  public static void main(String[] args){

    //creating the 3 dice in different sizes
    Die dice1 = new Die();
    Die dice2 = new Die(20);
    Die dice3 = new Die("d", 10);

    String name1 = dice1.GetType() + dice1.GetSides();
    String name2 = dice2.GetType() + dice2.GetSides();
    String name3 = dice3.GetType() + dice3.GetSides();

    System.out.println( "Creating a default " + name1 + "..." );
    System.out.println( "Creating a " + name2 + "..." );
    System.out.println( "Creating a percentile die (a special " + name3 + ")..." );
    System.out.println();

    //get initial values of the dice
    System.out.print( "The current side up for " + name1 + " is " );
    System.out.println( dice1.GetValue() );
    System.out.print( "The current side up for " + name2 + " is " );
    System.out.println( dice2.GetValue() );
    System.out.print( "The current side up for Percentile " + name3 + " is " );
    System.out.println( dice3.GetValue() );
    System.out.println();

    //rolling the dice and get new values
    dice1.RollDice(dice1.GetSides());
    dice2.RollDice(dice2.GetSides());
    dice3.RollDice(dice3.GetSides());

    System.out.println( "Rolling the " + name1 + "..." );
    System.out.println( "The new value is " + dice1.GetValue() );
    System.out.println( "Rolling the " + name2 + "..." );
    System.out.println( "The new value is " + dice2.GetValue() );
    System.out.println( "Rolling the " + name3 + "..." );
    System.out.println( "The new value is " + dice3.GetValue() );
    System.out.println();

    //roll d20 and count number of rolls until value is 20
    System.out.println("Setting the " + name2 + " to show " + dice2.GetSides() + "..." );
    System.out.println("It took " + dice2.CountRoll(dice2.GetSides()) + " rolls");
    System.out.println("The side up is now " + dice2.GetSides() + ". Finally.");
    System.out.println();

    //create 5 d6 dice and count number of rolls until all dice get same values
    System.out.println( "Creating 5 " + name1 + "...");
    System.out.println("It took " + dice1.CountRoll5D6() + " rolls");
    System.out.println("All sides are now equal.");

  }

}
