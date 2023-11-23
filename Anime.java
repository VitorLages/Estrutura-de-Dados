import java.util.ArrayList;

public class Anime {
    public int id;
    public String name;
    public ArrayList<String> genre;
    public String type;
    public int episodes;
    public double rating;
    public int members;
    public int count;
    public boolean exist;
    
    public Anime(int id, String name, ArrayList<String> genre, String type, int episodes, double rating, int members, boolean exist) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.type = type;
        this.episodes = episodes;
        this.rating = rating;
        this.members = members;
        this.count = 0;
        this.exist = exist;
    }

    public Anime(){
        
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

    public ArrayList<String> initgenre(){
        return genre = new ArrayList<>();
    }

    public int count(){
        return count++;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getGenre() {
        return genre;
    }

    public void setGenre(ArrayList<String> genre) {
        this.genre = genre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    

    


}