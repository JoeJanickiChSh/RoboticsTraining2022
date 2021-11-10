package Consolesweeper;


public class Gameboard {
    private int GRID_WIDTH = 16;
    private int GRID_HEIGHT = 16;
    public boolean mineTiles[][]; // Stores the mine locations
    public int numberTiles[][]; // Stores the numbers
    public boolean lose = false;
    public boolean win;

    Gameboard(int w,int h) {
        GRID_WIDTH = w;
        GRID_HEIGHT = h;
        mineTiles = new boolean[GRID_WIDTH][GRID_HEIGHT];
        numberTiles = new int[GRID_WIDTH][GRID_HEIGHT];
    }


    public void initMines(int nMines) {
        for(int x = 0; x < GRID_WIDTH; x++) {
            for(int y = 0; y < GRID_HEIGHT; y++) {
                numberTiles[x][y] = -1; // Initialize all numbers  to -1 (Not dug)
            }
        }
        Randrange mineRandom = new Randrange(); // New randrange object
        int i = 0; 
        while(i < nMines) {
            int mineX = mineRandom.randrange(0, GRID_WIDTH);
            int mineY = mineRandom.randrange(0, GRID_HEIGHT); // Random x and y positions
            
            if(!mineTiles[mineX][mineY]) { // If there is no mine on the position
                mineTiles[mineX][mineY] = true; // place a mine
                i++; // continue
            }
        }
    }
    
    public void showNums() {
        
        System.out.print("/-");
        for(int i = 0; i < GRID_WIDTH; i++) {
            System.out.print((char)( (int)('a') + i ) + " ");
        }
        System.out.print("\n"); // Top row

        for(int y = 0; y < GRID_HEIGHT; y++) {
            System.out.print((char)( (int)('a') + y ) + "-"); // Displays the side of the row starting from the letter a

            for(int x = 0; x < GRID_WIDTH; x++) { 

                if(lose && mineTiles[x][y]) { // If there is a loss
                    if(numberTiles[x][y] == -2) { // If there is a flag on a mine
                        System.out.print("P"); // Show a flag
                    } else {
                        System.out.print("*"); // Show a mine
                    }
                } else if(numberTiles[x][y] > 0) {
                    System.out.print(numberTiles[x][y]); // Show the number
                } else if(numberTiles[x][y] == 0) {
                    System.out.print( " " ); // Show a blank space for 0
                } else if(numberTiles[x][y] == -2) {
                    System.out.print(  (lose) ?  ( "R" ) : ( "P")   ); // Show a flag of not lost, show an incorrect flag if lost
                } else {
                    System.out.print( "." ); // Show a '.' for -1
                }

                System.out.print(" "); // Add a space between columns

                
                
                
            }
            System.out.print("\n"); // New line
        }
    }
    public boolean checkWin() {
        for(int x = 0; x < 16; x++) {
            for(int y = 0; y < 16; y++) {
                if(numberTiles[x][y] < 0) { // If there is a flag or blank space on a tile that is not a mine, there is no win
                    if(!mineTiles[x][y]) {
                        return false;
                    }
                }
            }
        }
        return true; // There is a win
    }
    public boolean safeIndex(int x, int y) { // Returns true if a number is in the range 0-16 (exclusive)
        if(x >= 0 && x < GRID_WIDTH) {
            if(y >= 0 && y < GRID_HEIGHT) {
                return true;
            }
        }
        return false;
    }
    public void digAt(int x, int y) {
        if(numberTiles[x][y] == -1) { // Only do something on an empty space
            int mineNeighbors = 0; // Number of neighbors
            for(int offX = -1; offX < 2; offX++) {
                for(int offY = -1; offY < 2; offY++) {
                    if( !(offX == 0 && offY == 0)  ) {
                        if(safeIndex(x + offX,y+offY)) {
                            if(mineTiles[x+offX][y+offY]) {
                                mineNeighbors++; // Increment the neighbor value if there is a mine on each neighboring tile
                            }
                        }
                    }
                }
            }
            

            numberTiles[x][y] = mineNeighbors; // Set the number to the amount of neighboring mines
            if(mineTiles[x][y]) { // If the tile is a mine, lose the game
                lose = true;
            }
            win = checkWin();
            if(mineNeighbors == 0) { // If there is no neighbors, dig at every neighboring tile
                for(int offX = -1; offX < 2; offX++) {
                    for(int offY = -1; offY < 2; offY++) {
                        if( !(offX == 0 && offY == 0)  ) {
                            if(safeIndex(x + offX, y + offY)) {
                                digAt(x+offX,y+offY);
                            }
                        }
                    }
                }
            }
        }        
    }
    
}
