import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        SwitchCase sw = new SwitchCase();
        Crud crud = new Crud();
        Anime anime = new Anime();

        // sw.switchcase();
        // anime.readFile(); 
        crud.read();
        // crud.print();
    }
}
