public class Util {
    
    public static void showHelpMenu(){
        println("Les opcions disponibles són:");
        println("H: Mostra aquest text d'ajuda");
        println("L: gira a l'esquerra");
        println("R: gira a la dreta");
        println("F: mou una passa endavant");
        println("nF: mou n passes endavant");
        println("Q: Sortir");
    }
    public static void printHead(){
        println("Joc del laberint");
        println("================");
        println("H: Mostra aquest text d'ajuda");
    }

    public static String userInput(String input){
        String movementPlayer="";
        int o =0;
        for(int i= 0; i< input.length(); i++){
            if(o>=input.length()){
                break;
            }
            if(Character.isDigit(input.charAt(o))){
                String num = Character.toString(input.charAt(o));
                for(int p=0;p<Integer.parseInt(num);p++){
                    movementPlayer+=input.charAt(o+1);
                }
                o++;
            }
            else{
                movementPlayer+=input.charAt(o);
            }
            
            o++;
        }
        return movementPlayer;
    }
    
    public static void println(String text){ 
        System.out.println(text); // Function to short System.out.println on String outputs
    } 
}