import java.util.Scanner;
import java.util.Random;

public class launch {
    static Integer James(){
        try (Scanner localScanner = new Scanner(System.in)) {
            System.out.println("Enter world boundries:");
            String localString = localScanner.nextLine();
            Integer localInt = Integer.parseInt(localString);
            return localInt;
        } catch (NumberFormatException e) {
            // Will add nice error message at a later date, maybe loop?
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Integer defInt = James();
        System.out.println("The method has returned " + defInt + ".");
        String[][] mainArray = new String[defInt][defInt];
        Random localRandom = new Random();
        for(int x = 0; x< mainArray.length;x++){
            for(int y = 0;y<mainArray[x].length;y++){
                Integer localInt = localRandom.nextInt(2 - 0) + 0;
                mainArray[x][y] = localInt.toString();
            }
        }
        StringBuilder localBuilder = new StringBuilder();
        for(int x = 0; x< mainArray.length;x++){
            if(x>0){
            localBuilder.append("\n");
        }
            for(int y = 0;y<mainArray[x].length;y++){
                localBuilder.append(mainArray[x][y]);
            }
        }
        System.out.println(localBuilder.toString());
        System.out.println("Exiting Program");
        System.exit(0);
    }
}
