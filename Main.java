/* Capçalera  */

//? Imports
import java.io.IOException;
import static java.lang.System.out; // To make shorter System.out.println
public class Main {
    public static void main(String[] args) throws IOException{
        Util.printHead();
        Maze maze = new Maze();
        maze.setMazeName(args[0]);
        maze.setMaze();
        maze.getMaze();
        while(true){
            String input=Util.userInput(Entrada.readLine());
            System.out.println(input);
        }
    }
}
        