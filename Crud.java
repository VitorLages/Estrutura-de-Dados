import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Crud {
    Anime anime = new Anime();
    // Rating rating = new Rating();
    ArrayList<Anime> animeList = new ArrayList<>();
    ArrayList<Rating> ratingList = new ArrayList<>();
    int count;

    public Crud(int id, String name, ArrayList<String> genre, String type, int episodes, double rating, int members){
       
    }

    public Crud(){
         
    }

    public void read() throws FileNotFoundException{
        FileReader fr = new FileReader("CSV Files/anime.csv");
        BufferedReader br = new BufferedReader(fr);
        Scanner sc = new Scanner(br);
        String line;
        
            do{
                anime.initgenre();
                line = sc.nextLine();
                String[] splitedLine = line.split(",");
                anime.count = 0;

                
                anime.id(splitedLine);
                anime.count();
                anime.name(splitedLine);
                anime.count();
                
                String sl = splitedLine[anime.count].toString();
                if(sl.equals("")){
                    anime.getGenre().add(null);
                }else if(sl.charAt(0) != '\"'){
                    anime.getGenre().add(splitedLine[anime.count]);
                }else anime.genre(splitedLine);

                
                
                anime.count();
                anime.type(splitedLine);
                anime.count();
                anime.episodes(splitedLine);
                anime.count();
                anime.rating(splitedLine);
                anime.count();

                // anime.members(splitedLine);
                // animeList.add(anime);
                // print1();
            }while(sc.hasNext());
        sc.close();  
    }

    public void print(){
        for(Anime a : animeList){
            System.out.println(a);
        }
        
    }

    public void print1(){
        System.out.println(anime.getId()+ " " + anime.getName() + " " + anime.getGenre() + " " + anime.getType() + " " + anime.getEpisodes() + " " + anime.getRating() + " " + anime.getMembers());
    }

    public void create(){
        
    }

    public void update(){
        
    }

    public void delete(){
        
    }

}
