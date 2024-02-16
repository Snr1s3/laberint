import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
public class UtilMaze {
    
    public static void showMaze(String path){
        File file = new File(path);
        if(!file.exists()){
            Util.println("El fitxer no existeix");
            return;
        }
        System.out.println();
        System.out.println("Laberint: "+ path);
        Util.println("Encara no resolt");
        System.out.println();
        Util.println("Intents actuals");
        
    }

    public static void readMaze(String path) throws IOException{
        FileReader fR = new FileReader(path);
        BufferedReader reader = new BufferedReader(fR);
        String line = reader.readLine();
        String[] size = line.split("x");
        for(int i = 0;i< size.length; i++){
            System.out.println(size[i]);
        }
        reader.close();
    }
    
}