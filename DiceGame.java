 /*Name: Yash Kelkar
  Student number: A00242148
  Program description: JAV-1001 - 11329 - App Development for Android 
  Lab 3 - Classes/ Objects  */

import java.util.*;

public class DiceGame {
  public static void main(String[] args) {

    System.out.println("Java DiceGame started\n");

    System.out.println("Creating default dice d6");
    Dice d6 = new Dice();  //Creating default d6(object) using class Dice(class)

    System.out.println("Creating a dice d10 with number of sides 10");
    Dice d10 = new Dice(10);  //Creating d10 using class Dice

    System.out.println("Creating a dice d20 with number of sides 20\n");
    Dice d20 = new Dice(20,"d20");  //Creating d20 using class Dice

    System.out.println("The current side up for d6 is "+d6.current_side_up); 
    System.out.println("The current side up for d10 is "+d10.current_side_up);
    System.out.println("The current side up for d20 is "+d20.current_side_up);

    System.out.println("\nRolling all dices...\n");

    d6.roll(); // calling roll method on d6 dice
    d10.roll(); // calling roll method
    d20.roll(); // calling roll method
    
    System.out.println("The current side up for d6 is "+d6.current_side_up); 
    System.out.println("The current side up for d10 is "+d10.current_side_up);
    System.out.println("The current side up for d20 is "+d20.current_side_up);

    // setting current side up to max value
    System.out.println("\nSetting the d20 to show 20..."); 
    d20.current_side_up=20;
    System.out.println("The side up is now "+ d20.current_side_up);

    System.out.println("\nBonus....\n");

    System.out.println("Creating 5 d6(dices)"); 
    Dice[] diceArray = new Dice[5]; //creating array of d6 dices

    //creating 5 d6 dices
    for(int i=0;i<5;i++){
      diceArray[i] = new Dice();  
    }

    int count=0;//keeps the count of number of times the dices have to be rolled

    while(true)
    {
      count++;
      //rolling each of the 5 dices
      for(int i=0;i<5;i++){
        diceArray[i].roll(); 
        System.out.print(diceArray[i].current_side_up+", ");
      }
      System.out.print("\n");

      boolean same=true; //stores true if current_side_up of all dices are same
      for(int i=0;i<4;i++){
        if(diceArray[i].current_side_up!=diceArray[i+1].current_side_up)
        {
          same=false;
          break;
        }
      }
      if(same==true){
        break;
      }

    }

    System.out.println("\nIt took "+count+" rolls");


  }
}