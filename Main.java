import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        SwitchCase sw = new SwitchCase();
        Crud crud = new Crud();
        Anime anime = new Anime();

        sw.switchcase();
        // crud.read();
        // crud.printAnime(crud.animeList);
    }
}
