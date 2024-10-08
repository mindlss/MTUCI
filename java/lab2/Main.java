public class Main {
    public static void main(String[] args) {
        Weather weatherApp1 = new Weather("WeatherPro", "Weather Inc.", "Android", "Europe");
        weatherApp1.run();
        weatherApp1.displayInfo();

        System.out.println("______________");

        Weather weatherApp2 = new Weather("Sunny", "TechLabs", "iOS", "Asia");
        weatherApp2.run();
        weatherApp2.displayInfo();

        System.out.println("______________");

        SocialNetwork snApp1 = new SocialNetwork("Facebook", "Meta", "Android", "Global", 2000000000);
        snApp1.run();
        snApp1.displayInfo();

        System.out.println("______________");

        SocialNetwork snApp2 = new SocialNetwork("VK", "Mail.ru", "iOS", "Regional", 90000000);
        snApp2.run();
        snApp2.displayInfo();

        System.out.println("______________");

        Game game1 = new Game("Chess", "Unknown", "PC", "Strategy",
                new String[] { "Multiplayer", "High Score", "Achievements" });
        game1.run();
        game1.displayInfo();

        System.out.println("______________");

        MobileGame mobileGame1 = new MobileGame("Candy Crush", "King", "iOS", "Puzzle",
                new String[] { "Colorful", "Simple Controls" }, true);
        mobileGame1.run();
        mobileGame1.displayInfo();

        System.out.println("______________");
        System.out.println("______________");

        System.out.println("Total Weather apps created: " + Weather.getWeatherAppCount());
        System.out.println("Total Social Network apps created: " + SocialNetwork.getSocialNetworkAppCount());
        System.out.println("Total games created: " + Game.getGameCount());

        System.out.println("______________");
    }
}