import java.util.Random;

public class Dice {
    final int MIN = 1;
    final int MAX = 6;

    public Dice(){

    }
    public int throwDice(){
        return ((int) (Math.random()*(MAX-MIN+1)+MIN));
    }
}
