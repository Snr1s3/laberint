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

    // Check user selection and return 1 if error & 0 if all OK
    public static int userSelection(String text) {

        if(text.length() != 1) return 1;

    }


    public static void println(String text){ System.out.println(text);}


}
