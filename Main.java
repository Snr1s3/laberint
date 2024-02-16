/* Capçalera  */

//? Imports
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

import static java.lang.System.out; // To make shorter System.out.println

public class Main {

    //? Variables de clase

    public static void main(String[] args) throws IOException{
        Util.printHead();
        UtilMaze.showMaze(args[0]);
        // laberint no resolt
        // mostra laberint
        UtilMaze.readMaze(args[0]);

    }

    //? Funcions
    
}