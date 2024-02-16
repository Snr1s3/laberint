import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
public class UtilMaze {
    
    public static void showMaze(String path, int intents){
        File file = new File(path); //crea un file indicant el path
        if(!file.exists()){ //mira si el file indicat existeix
            Util.println("El fitxer no existeix");
            return;
        }
        System.out.println();
        System.out.println("Laberint: "+ path);
        Util.println("Encara no resolt");
        System.out.println();
        Util.println("Intents actuals: "+intents);
        
    }

    public static char[][] readMaze(String path) throws IOException{
        FileReader fR = new FileReader(path);
        BufferedReader reader = new BufferedReader(fR);
        String line = reader.readLine();
        String[] size = line.split("x");
        char[][] maze = new char[Integer.parseInt(size[0])][Integer.parseInt(size[1])];
        for(int i = 0; i< maze.length; i++){
            line = reader.readLine();
            for(int o =0;o<maze[i].length;o++){
                char posi = line.charAt(o);
                maze[i][o] = posi;
            }
        }
        printMaze( maze);
        reader.close();
        return maze;
    }

    public static void printMaze(char[][] maze){
        for(int i = 0; i< maze.length; i++){            
            for(int p =0;p<maze[i].length;p++){
                if(maze[i][p]=='E'){
                    System.out.print('→');
                }
                else if( maze[i][p]=='G'){
                    System.out.print(' ');
                }
                else if(i==0 && p ==0){
                    System.out.print('┌');
                }
                else if(i==0 && p==maze[i].length-1){
                    System.out.print('┐');
                }
                else if(i==maze.length-1 && p ==0){
                    System.out.print('└');
                }
                else if(i==maze.length-1  && p==maze[i].length-1){
                    System.out.print('┘');
                }
                else if(i==0 || i==maze.length-1){
                    System.out.print('─');
                }
                else if(p==0 || p==maze[i].length-1){
                    System.out.print('│');
                }
                else{
                    System.out.print('·');
                }
            }
            System.out.println();
        }
    }

    
    
}