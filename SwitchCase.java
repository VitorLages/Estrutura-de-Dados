import java.io.IOException;
import java.util.Scanner;

public class SwitchCase {

    boolean isRead = false;
    Crud crud = new Crud();
    Scanner sc = new Scanner(System.in);

    public void switchcase() throws IOException{
        
        System.out.println("---------------------------------------");
        System.out.println("| 0 - Quit                            |");
        System.out.println("| 1 - Read Files                      |");
        System.out.println("| 2 - Print Anime File                |");
        System.out.println("| 3 - Print Rating File               |");
        System.out.println("| 4 - Create a new Anime profile      |");
        System.out.println("---------------------------------------");

        String option = sc.nextLine().toString();
        
             
        switch(option){
            case "0":
                    break;
            
            case "1":
                    crud.read();
                    isRead = true;
                    System.out.println("Files read sucessfully!");
                    switchcase();
                    break;
            case "2":
                    if(isRead == true){
                        crud.printAnime();
                        switchcase();
                    } else System.out.println("Files are not read"); switchcase();
                    break;
            case "3":
                    if(isRead == true){
                        crud.printRating();
                        switchcase();
                    } else System.out.println("Files are not read"); switchcase();
                    break;

            case "4":
                    if(isRead == true){
                        crud.create();
                        switchcase();
                    } else System.out.println("Files are not read"); switchcase();
                    break;
            default: 
                    System.out.println("Invalid operation!");
                    break;
        }
        
    }
}
