
public class player extends Life{
    Life player;
    
    public static Life makePlayer(){
        Life localPlayer = new Life();
        localPlayer.addToken("P");    
        return localPlayer;
    }
}
