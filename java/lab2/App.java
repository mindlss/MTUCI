abstract class App {
    protected String title;
    protected String author;
    protected String os;

    public App(String title, String author, String os) {
        this.title = title;
        this.author = author;
        this.os = os;
    }

    public App() {
        this("", "", "");
    }

    // Абстрактный метод (должен быть реализован в дочерних классах)
    public abstract void run();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    // Метод для вывода информации
    public void displayInfo() {
        System.out.println("App Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("OS: " + os);
    }
}