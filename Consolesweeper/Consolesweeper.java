package Consolesweeper;
import java.util.Scanner;


public class Consolesweeper {
    
    public static void main(String args[]) {
        System.out.println(args.length);
        int GAME_W = 16;
        int GAME_H = 16;
        int N_MINES = 24;
        if(args.length >= 3) {
            GAME_W = Integer.valueOf(args[0]);
            GAME_H = Integer.valueOf(args[1]);
            N_MINES = Integer.valueOf(args[2]);
        }
        
        


        Scanner scan = new Scanner(System.in); // New scanner Object
        Gameboard gb = new Gameboard( GAME_W , GAME_H); // New Gameboard objects
        gb.initMines(N_MINES); // Initialize mine locations
        while(true) {
            gb.showNums(); // Display the screen
            String mineGuess = scan.next(); // Get user input

            int mineX = ((int)mineGuess.charAt(0)) - 97; // X and Y values are the first and second char's ascii values - 'a'
            int mineY = ((int)mineGuess.charAt(1)) - 97;
            if(mineGuess.charAt(0) == '?') {  // If the first char is a '?', set the x and y values to the second and third chars  
                mineX = ((int)mineGuess.charAt(1)) - 97;
                mineY = ((int)mineGuess.charAt(2)) - 97;
                if(gb.safeIndex(mineX, mineY)) { // If x and y values in range
                    if(gb.numberTiles[mineX][mineY] == -1) { // If there is an empty space, place a flag
                        gb.numberTiles[mineX][mineY] = -2;
                    } else if(gb.numberTiles[mineX][mineY] == -2) { // If there is a flag, remove it
                        gb.numberTiles[mineX][mineY] = -1;
                    }
                    
                }
            } else {
                if(gb.safeIndex(mineX, mineY)) { // If x and y values in range
                    gb.digAt(mineX,mineY); // Dig at the location
                    if(gb.lose) { // If there is a loss
                        gb.showNums(); // Display the mines
                        System.out.print("You Lose");
                        scan.close(); // Close the scanner
                        return; // Exit the program
                    } else if(gb.win) {
                        gb.showNums(); // Display the mines
                        System.out.print("You Win");
                        scan.close(); // Close the scanner
                        return; // Exit the program
                    }
                }
            }
            
            
        }
        
    }   
}