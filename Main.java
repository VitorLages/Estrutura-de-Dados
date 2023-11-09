import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Anime anime = new Anime();
        Rating rating = new Rating();

        rating.readFile();
        // anime.readFile();
        // anime.print();
    }
}
