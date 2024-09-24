public class Weather extends App {
    private String regionWeather;

    public Weather (String title, String author, String os, String region){
        super (title, author, os);
        regionWeather = region;
    }

    public Weather() {
        this ("", "", "", "");
    }

    public String getRegion () {
        return regionWeather;
    }

    public void setRegion (String val) {
        regionWeather = val;
    }
}
