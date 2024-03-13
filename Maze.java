/*Document  class maze  */
import java.io.IOException;

public  class Maze{
    /*Attributes*/
    private char[][] maze;
    private String mazeName;

    /*Methods*/
    public void getMaze(){  // Get the maze and show it
        UtilMaze.printMaze(maze);
    }

    public void setMaze()throws IOException{ // Set the maze
        this.maze = UtilMaze.readMaze(mazeName);
    }

    public void setMazeName(String Nom){ // Get the maze name
        mazeName = Nom;
    }
}