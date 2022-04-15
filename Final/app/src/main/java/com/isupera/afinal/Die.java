//JAV-1001
//Iricher B Supera
//A00237146
package com.isupera.afinal;

public class Die {

    private int sides; //no. of sides
    private int value; //current side up

    //constructor
    public Die(){
    }

    //constructor with 1 parameter (no. of sides)
    public Die(int sides){
        this.sides = sides;
        RollDice(sides);
        this.value = GetValue();
    }

    //method get dice value
    public int GetValue(){
        return value;
    }

    //method to generate dice random integer value
    public void RollDice(int sides){
        int intRand;
        intRand = (int)(Math.random() * sides) + 1;
        this.value = intRand;
    }

}
