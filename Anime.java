import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Anime {
    private int id;
    private String name;
    private ArrayList<String> genre;
    private String type;
    private int episodes;
    private double rating;
    private int members;
    private int count; 


    public Anime(int id, String name, ArrayList<String> genre, String type, Integer episodes, double rating, int members) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.type = type;
        this.episodes = episodes;
        this.rating = rating;
        this.members = members;
        this.count = 0;
    }

    public Anime(){
        
    }

    public void readFile() throws FileNotFoundException{
        FileReader fr = new FileReader("CSV Files/anime.csv");
        BufferedReader br = new BufferedReader(fr);
        Scanner sc = new Scanner(br);
        String line;
        
            do{
                genre = new ArrayList<>();
                line = sc.nextLine();
                String[] splitedLine = line.split(",");
                count = 0;
                
                id(splitedLine);
                count();
                name(splitedLine);
                count();

                String sl = splitedLine[count].toString();
                if(sl.equals("")){
                    genre.add(null);
                }else if(sl.charAt(0) != '\"'){
                    genre.add(splitedLine[count]);
                }else genre(splitedLine);

                count();
                type(splitedLine);
                count();
                episodes(splitedLine);
                count();
                rating(splitedLine);
                count();
                members(splitedLine);
            }while(sc.hasNext());
        sc.close();  
    }

    public void id(String[] splitedLine){
        String sid;
        sid = splitedLine[count];
        sid = sid.replaceAll("\"", "");
        id = Integer.parseInt(sid);
    }

    public void name(String[] splitedLine){
        String sl = splitedLine[count].toString();
        if(sl.charAt(0) == '\"' && sl.charAt(1) == '\"'){
            name = splitedLine[count];
            while(sl.charAt(sl.length()-1) != '\"'){
                count();
                sl = splitedLine[count];
                String aux = "";
                aux  += splitedLine[count];
                name += aux.replaceAll("\"","");
            }
        } else name = splitedLine[count];

    }
    public void genre(String[] splitedLine){
            String sl = splitedLine[count].toString();

            if(sl.charAt(0) == '\"' && sl.charAt(1) == '\"'){
                String aux = sl.replaceAll("\"","");
                genre.add(aux);
                count();
                genre(splitedLine);
            }else{
                if(sl.charAt(sl.length()-1) == '\"'){
                    String aux = sl.replaceAll("\"","");
                    genre.add(aux);
                }else{
                    genre.add(sl);
                    count();
                    genre(splitedLine);
                }              
            }
    }
    
    public void type(String[] splitedLine){
        type = splitedLine[count];
    }

   public void episodes(String[] splitedLine) {
        if(splitedLine[count].contains("Unknown")){
            episodes = 0;
        } else episodes = Integer.parseInt(splitedLine[count]);
}

    public void rating(String[] splitedLine){
        rating = Double.parseDouble(splitedLine[count]);
    }

    public void members(String[] splitedLine){
        String smembers;
        smembers = splitedLine[count];
        smembers = smembers.replaceAll("\"", "");
        smembers = smembers.replaceAll(";", "");
        members = Integer.parseInt(smembers);
    }

    public void print() throws FileNotFoundException{
        readFile();
        System.out.println(id()+ " " + name() + " " + genre() + " " + type() + " " + episodes() + " " + rating() + " " + members());
    }

    public int id(){
        return id;
    }
    public Integer episodes(){
        return episodes;
    }
    public int members(){
        return members;
    }
    public String name(){
        return name;
    }
    public ArrayList<String> genre(){
        return genre;
    }
    public String type(){
        return type;
    }
    public double rating(){
        return rating;
    }
    public int count(){
        return count++;
    }
}