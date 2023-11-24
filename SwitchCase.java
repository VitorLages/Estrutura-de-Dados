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
        System.out.println("| 5 - Update an Anime profile         |");
        System.out.println("| 6 - Delete an Anime profile         |");
        System.out.println("---------------------------------------");

        String option = sc.nextLine().toString();
        
        while (!option.equals("0")){
            switch(option){
            case "0":
                    break;
            
            case "1":
                    crud.read();
                    isRead = true;
                    System.out.println("Files read sucessfully!");
                    break;
            case "2":
                    if(isRead == true){
                        crud.printAnime();
                    } else System.out.println("Files are not read");
                    break;
            case "3":
                    if(isRead == true){
                        crud.printRating();
                    } else System.out.println("Files are not read");
                    break;

            case "4":
                    if(isRead == true){
                        crud.create();
                    } else System.out.println("Files are not read");
                    break;

            case "5":
                    if(isRead == true){
                        System.out.println("Select an id to be updated");
                        crud.update();
                    } else System.out.println("Files are not read");
                    break;

            case "6":
                    if(isRead == true){
                        System.out.println("Select an id to be deleted");
                        crud.delete();
                    } else System.out.println("Files are not read");
                    break;
                    
            default: 
                    System.out.println("Invalid operation!");
                    break;
            }
        }     
        
        
    }
}
