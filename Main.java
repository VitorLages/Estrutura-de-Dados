import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Anime anime = new Anime();
        SwitchCase sw = new SwitchCase();

        sw.switchcase();
        anime.readFile();
        anime.print();
    }
}
