import java.util.Scanner;

public class player extends Life{
    public Life Player(){
        try (Scanner localScanner = new Scanner(System.in)) {
            Life player = new Life();
            this.addToken("P");
            String name = localScanner.nextLine();
            player.addName(name);
            return player;
        }
    }
}
