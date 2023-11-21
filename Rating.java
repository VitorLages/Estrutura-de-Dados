public class Rating {
    int userId;
    int animeId;
    int rating;
    int count;
    
    public Rating(int userId, int animeId, int rating) {
        this.userId = userId;
        this.animeId = animeId;
        this.rating = rating;
    }

    public Rating(){
        
    }

    public void userId(String[] spline){
        String sp = spline[count].toString();
        userId = Integer.parseInt(sp);
    }

    public void animeId(String[] spline){
        String sp = spline[count].toString();
        animeId = Integer.parseInt(sp);
    }

    public void rating(String[] spline){
        String sp = spline[count].toString();
        rating = Integer.parseInt(sp);
    }

    public int count(){
        return count++;
    }

    public int getUserId(){
        return userId;
    }

    public int getAnimeId(){
        return animeId;
    }

    public int getRating(){
        return rating;
    }
}
