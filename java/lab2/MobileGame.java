class MobileGame extends Game {
    // Поля
    private boolean isFreeToPlay;

    // Конструктор с параметрами
    public MobileGame(String title, String author, String os, String genre, String[] features, boolean isFreeToPlay) {
        super(title, author, os, genre, features);
        this.isFreeToPlay = isFreeToPlay;
    }

    // Конструктор по умолчанию
    public MobileGame() {
        this("", "", "", "", null, true);
    }

    // Геттеры и сеттеры
    public boolean isFreeToPlay() {
        return isFreeToPlay;
    }

    public void setFreeToPlay(boolean isFreeToPlay) {
        this.isFreeToPlay = isFreeToPlay;
    }

    // Переопределение метода run()
    @Override
    public void run() {
        System.out.println("Mobile Game is running on " + getOs() + (isFreeToPlay ? " (Free to Play)" : ""));
    }

    // Переопределение метода displayInfo()
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Free to Play: " + (isFreeToPlay ? "Yes" : "No"));
    }
}