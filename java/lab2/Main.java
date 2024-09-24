public class Main {
    public static void main(String[] args) {
        String[] features = {"Multiplayer", "High Score", "Achievements"};

        Weather weatherApp1 = new Weather("WeatherPro", "Weather Inc.", "Android", "Europe");
        weatherApp1.run();
        weatherApp1.displayInfo();

        Weather weatherApp2 = new Weather("Sunny", "TechLabs", "iOS", "Asia");
        weatherApp2.run();
        weatherApp2.displayInfo();

        SocialNetwork snApp1 = new SocialNetwork("Facebook", "Meta", "Android", "Global", 2000000000);
        snApp1.run();
        snApp1.displayInfo();

        SocialNetwork snApp2 = new SocialNetwork("VK", "Mail.ru", "iOS", "Regional", 90000000);
        snApp2.run();
        snApp2.displayInfo();

        Game game1 = new Game("Chess", "Unknown", "PC", "Strategy", features);
        game1.run();
        game1.displayInfo();

        MobileGame mobileGame1 = new MobileGame("Candy Crush", "King", "iOS", "Puzzle", new String[]{"Colorful", "Simple Controls"}, true);
        mobileGame1.run();
        mobileGame1.displayInfo();

        System.out.println("Total Weather apps created: " + Weather.getWeatherAppCount());
        System.out.println("Total Social Network apps created: " + SocialNetwork.getSocialNetworkAppCount());
        System.out.println("Total games created: " + Game.getGameCount());
    }
}