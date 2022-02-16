//JAV-1001 - Lab 3
//Iricher B Supera
//A00237146
//MAPD0101
import java.util.Random;

public class Die{

  static String type;
  private int sides; //no. of sides
  private int value; //current side up

  //constructor
  public Die(){

    type = "d";
    sides = 6;
    RollDice(sides);
    value = GetValue();

  }

  //constructor with 1 parameter (no. of sides)
  public Die(int sides){

    this.sides = sides;
    RollDice(sides);
    this.value = GetValue();

  }

  //constructor with 2 parameters (type and no. sides)
  public Die(String type, int sides){

    this.type = type;
    this.sides = sides;
    RollDice(sides);
    this.value = GetValue();

  }

  //method get dice type
  public String GetType(){

    return type;

  }

  //method get dice no. sides
  public int GetSides(){

    return sides;

  }

  //method get dice value
  public int GetValue(){

    return value;

  }

  //method to generate dice random integer value
  public void RollDice(int sides){

    Random rand = new Random();
    int intRand;

    intRand = rand.nextInt(1, sides+1);
    this.value = intRand;

  }

  //method to count number of rolls for a single dice
  public int CountRoll(int sides){

    int ctr = 0;

    while( ctr >= 0 ){
      ctr++;
      RollDice(sides);
      if ( this.value == sides ) {
        break;
      }
    }
    return ctr;

  }

  //method to count number of rolls for 5 d6 dice
  public int CountRoll5D6(){

    Die dice1a = new Die();
    Die dice1b = new Die();
    Die dice1c = new Die();
    Die dice1d = new Die();
    Die dice1e = new Die();

    int ctr = 0;

    while( ctr >= 0 ){
      ctr++;
      dice1a.RollDice(dice1a.GetSides());
      dice1b.RollDice(dice1b.GetSides());
      dice1c.RollDice(dice1c.GetSides());
      dice1d.RollDice(dice1d.GetSides());
      dice1e.RollDice(dice1e.GetSides());
      if ( dice1a.GetValue() == dice1b.GetValue()
        && dice1a.GetValue() == dice1c.GetValue()
        && dice1a.GetValue() == dice1d.GetValue()
        && dice1a.GetValue() == dice1e.GetValue() ) {
        break;
      }
    }
    return ctr;

  }

}
