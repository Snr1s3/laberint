/*Document  class player*/
public  class Player{
    private static Player player = null;
    private static int[] playerPosi;
    private static int intents = 0;

    //! Constructors
    private Player(){player = new Player();}
    
    private Player(int[] nPlayerPosi){
        
    }
    //! Getters
    public static Player getPlayer(int[] nPlayerPosi){ //? Com getInstancia
        if(player== null)player = new Player();
        playerPosi = nPlayerPosi;
        return player;
    }

    public static int getIntents(){
        if(player == null) player = new Player();
        return intents;
    }

    public static int[] getPosicio(){
        return playerPosi;
    }

    //! Setters
    public void incrementaIntents() {
        intents++;
    }
}
