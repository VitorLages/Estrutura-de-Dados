import java.io.FileNotFoundException;
import java.util.Scanner;

public class SwitchCase {
    public void switchcase() throws FileNotFoundException{
        Anime anime = new Anime();
        Rating rating = new Rating();
        Scanner sc = new Scanner(System.in);
        

        System.out.println("---------------------------------------");
        System.out.println("0 - Quit");
        System.out.println("1 - Read Files");
        System.out.println("2 - Print Anime File");
        System.out.println("3 - Print Rating File");
        System.out.println("---------------------------------------");

        String option = sc.toString();
        sc.close();
             
        switch(option){
            case "0":
                    break;
            
            case "1":
                    // anime.readFile();
                    rating.readFile();
        }

    }
}
