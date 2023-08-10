
public class launch {
    public static void main(String[] args) throws Exception {
        String[][] localWorld;
        localWorld = world.newWorld();
        player localPlayer = new player();
        String token = localPlayer.getToken();
        System.out.println(world.getPlayerX());
        System.out.println(world.getPlayerY());
    }
}
