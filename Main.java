import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        SwitchCase sw = new SwitchCase();
        Crud crud = new Crud();

        // sw.switchcase();
        crud.read();
        // crud.printAnime();
        crud.update();
    }
}
