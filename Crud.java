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
                Anime anime = new Anime();
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

                anime.members(splitedLine);
                animeList.add(anime);

            }while(sc.hasNext());
            sc.close();

        FileReader fr1 = new FileReader("CSV Files/rating.csv");
        BufferedReader br1 = new BufferedReader(fr1);
        Scanner sc1 = new Scanner(br1);
        String line1;
        

        do{
            Rating rating = new Rating();
            line1 = sc1.nextLine();
            String[] splitedLine = line1.split(",");
            rating.count = 0;

            rating.userId(splitedLine);
            rating.count();

            rating.animeId(splitedLine);
            rating.count();

            rating.rating(splitedLine);
            rating.count();

            ratingList.add(rating);

        }while(sc1.hasNext());
        sc1.close();  
    }

    public void printAnime(ArrayList<Anime> animelList){
        for(Anime a : animeList){
            System.out.println(a.getId() + " " + a.getName() + " " + a.getGenre() + " " + a.getType() + " " + a.getCount() + " " + a.getEpisodes() + " " + a.getRating() + " " + a.getMembers());
        }
    }

    public void printRating(){
        for(Rating r : ratingList){
            System.out.println(r.getUserId() + " " + r.getAnimeId() + " " + r.getRating());
        }
    }

    public void create(){
        
    }

    public void update(){
        
    }

    public void delete(){
        
    }

}
