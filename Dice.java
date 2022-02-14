  import java.util.*;

  public class Dice {

    String dice_name;
    int dice_sides;
    int current_side_up;
     Random rand = new Random(); //instance of random class

     //constructor with 0 argument
     public Dice() {
      this.dice_name="d6";
      this.dice_sides=6;
      roll();
    }
 
    //constructor with 1 argument
    public Dice(int number_of_sides) {
      this.dice_name="d"+number_of_sides;
      this.dice_sides=number_of_sides;
      roll();
    }

    //constructor with 2 argument
    public Dice(int number_of_sides, String dice_name) {
      this.dice_name=dice_name;
      this.dice_sides=number_of_sides;
      roll();
    }

    //dice roll method
    public void roll() {
      this.current_side_up= (int)Math.floor(Math.random()*(this.dice_sides)+1);
    }

  }