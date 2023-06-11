
public class launch {
    public static void main(String[] args) throws Exception {
        String[][] localWorld;
        localWorld = world.newWorld();
        player localPlayer = new player();
        System.out.println(localPlayer.getName());
        System.out.println("Exiting Program");
        System.exit(0);
    }
}
