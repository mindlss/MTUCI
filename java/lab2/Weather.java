class Weather extends App {
    // Поля
    private String regionWeather;
    private static int weatherAppCount = 0; // Статическая переменная для счетчика объектов

    // Конструктор с параметрами
    public Weather(String title, String author, String os, String region) {
        super(title, author, os);
        this.regionWeather = region;
        weatherAppCount++;  // Увеличение счетчика при создании объекта
    }

    // Конструктор по умолчанию
    public Weather() {
        this("", "", "", "");
    }

    // Геттеры и сеттеры
    public String getRegion() {
        return regionWeather;
    }

    public void setRegion(String regionWeather) {
        this.regionWeather = regionWeather;
    }

    // Реализация абстрактного метода run()
    @Override
    public void run() {
        System.out.println("Weather app is running for region: " + regionWeather);
    }

    // Переопределение метода для вывода информации
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Region: " + regionWeather);
    }

    // Статический метод для получения количества созданных приложений
    public static int getWeatherAppCount() {
        return weatherAppCount;
    }
}