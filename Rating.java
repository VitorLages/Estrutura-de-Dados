import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Rating {
    private int userId;
    private int animeId;
    private int rating;
    private int count;
    
    public Rating(int userId, int animeId, int rating) {
        this.userId = userId;
        this.animeId = animeId;
        this.rating = rating;
    }

    public Rating(){
        
    }

    public void readFile() throws FileNotFoundException{
        FileReader fr = new FileReader("CSV Files/rating.csv");
        BufferedReader br = new BufferedReader(fr);
        Scanner sc = new Scanner(br);
        String line;
        

        do{
            line = sc.nextLine();
            String[] splitedLine = line.split(",");
            count = 0;

            userId(splitedLine);
            count();

            animeId(splitedLine);
            count();

            rating(splitedLine);
            count();

        }while(sc.hasNext());
        sc.close();
    }

    public void userId(String[] spline){
        String sp = spline[count].toString();
        userId = Integer.parseInt(sp);
    }

    public void animeId(String[] spline){
        String sp = spline[count].toString();
        animeId = Integer.parseInt(sp);
    }

    public void rating(String[] spline){
        String sp = spline[count].toString();
        rating = Integer.parseInt(sp);
    }

    public int count(){
        return count++;
    }

    public int userId(){
        return userId;
    }

    public int animeId(){
        return animeId;
    }

    public int rating(){
        return rating;
    }
}
