class Game extends App {
    // Поля
    private String genreGame;
    private String[] featuresGame;
    private static int gameCount = 0; // Статическая переменная для счетчика объектов

    // Конструктор с параметрами
    public Game(String title, String author, String os, String genre, String[] features) {
        super(title, author, os);
        this.genreGame = genre;
        this.featuresGame = features;
        gameCount++;
    }

    // Конструктор по умолчанию
    public Game() {
        this("", "", "", "", null);
    }

    // Геттеры и сеттеры
    public String getGenre() {
        return genreGame;
    }

    public void setGenre(String genre) {
        this.genreGame = genre;
    }

    public String[] getFeatures() {
        return featuresGame;
    }

    public void setFeatures(String[] features) {
        this.featuresGame = features;
    }

    // Реализация абстрактного метода run()
    @Override
    public void run() {
        System.out.println("Game is running on " + os);
    }

    // Метод для вывода информации
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Genre: " + genreGame);
        System.out.println("Features: " + String.join(", ", featuresGame));
    }

    // Статический метод для получения количества игр
    public static int getGameCount() {
        return gameCount;
    }
}