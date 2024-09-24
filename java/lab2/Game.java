public class Game extends App {
    private String genreGame;
    private String[] featuresGame;

    public Game (String title, String author, String os, String genre, String[] features){
        super (title, author, os);
        genreGame = genre;
        featuresGame = features;
    }

    public Game() {
        this ("", "", "", "", null);
    }

    public String getGenre () {
        return genreGame;
    }

    public String[] getFeatures () {
        return featuresGame;
    }

    public void setGenre (String val) {
        genreGame = val;
    }

    public void setFeatures (String[] val) {
        featuresGame = val;
    }
}
