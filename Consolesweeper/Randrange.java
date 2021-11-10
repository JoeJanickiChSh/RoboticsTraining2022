package Consolesweeper;
import java.util.Random;


/*
    This is only used to get random numbers within a range
    Idk how it's normally done but this is my solution
    There's probably a better way to do it
*/
public class Randrange { 
    private Random rand = new Random();
    private int intMod(int a, int b) { // Makes modulo wrap around for negative numbers
        return ((((a % b) + b) % b) );
    }
    public int randrange(int min, int max) {
        return intMod(this.rand.nextInt(),max-min) + min;
    }
}
