class SocialNetwork extends App {
    // Поля
    private String typeSN;
    private int userCountSN;
    private static int socialNetworkAppCount = 0;  // Статическая переменная для счетчика объектов

    // Конструктор с параметрами
    public SocialNetwork(String title, String author, String os, String type, int userCount) {
        super(title, author, os);
        this.typeSN = type;
        this.userCountSN = userCount;
        socialNetworkAppCount++;  // Увеличение счетчика при создании объекта
    }

    // Конструктор по умолчанию
    public SocialNetwork() {
        this("", "", "", "", 0);
    }

    // Геттеры и сеттеры
    public String getType() {
        return typeSN;
    }

    public void setType(String typeSN) {
        this.typeSN = typeSN;
    }

    public int getUserCount() {
        return userCountSN;
    }

    public void setUserCount(int userCountSN) {
        this.userCountSN = userCountSN;
    }

    // Реализация абстрактного метода run()
    @Override
    public void run() {
        System.out.println("Social network of type " + typeSN + " is running with " + userCountSN + " users.");
    }

    // Переопределение метода для вывода информации
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Social Network Type: " + typeSN);
        System.out.println("User Count: " + userCountSN);
    }

    // Статический метод для получения количества созданных приложений
    public static int getSocialNetworkAppCount() {
        return socialNetworkAppCount;
    }
}