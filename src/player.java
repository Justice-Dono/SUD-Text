import java.util.Scanner;

public class player extends Life{
    public Life Player(){
        try (Scanner localScanner = new Scanner(System.in)) {
            Life player = new Life();
            String name = localScanner.nextLine();
            player.addName(name);
            return player;
        }
    }
}
