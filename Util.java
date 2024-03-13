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
        int letterPosition =0;
        for(int i= 0; i< input.length(); i++){
            if(letterPosition>=input.length()) break;
            
            if(Character.isDigit(input.charAt(letterPosition))){
                String num = Character.toString(input.charAt(letterPosition));
                if(Character.isDigit(input.charAt(letterPosition+1))){

                for(int p=0;p<Integer.parseInt(num);p++){
                    movementPlayer+=input.charAt(letterPosition+1);
                }
                letterPosition++;
            }
            else{
                movementPlayer+=input.charAt(letterPosition);
            }
            letterPosition++;
        }
        return movementPlayer;
    }
    
    public static void println(String text){ 
        System.out.println(text); // Function to short System.out.println on String outputs
    }

    public static void prova(String input){
        
    }

}