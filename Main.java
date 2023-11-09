import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Anime anime = new Anime();
        anime.readFile();
        anime.print();
    }
}
