/* Capçalera  */

//? Imports
import java.io.IOException;

import static java.lang.System.out; // To make shorter System.out.println

public class Main {
    //? Variables de clase
    static class Player{
        int[] playerPosi;
        int intents;
    }
    public static void main(String[] args) throws IOException{
        Util.printHead();
        Player player= new Player();
        player.intents = 1;
        UtilMaze.showMaze(args[0], player.intents);
        // laberint no resolt
        // mostra laberint
        UtilMaze.readMaze(args[0]);

    }

    //? Funcions
    
}