public class App {
    private String titleApp;
    private String authorApp;
    private String osApp;

    public App (String title, String author, String os) {
        titleApp = title;
        authorApp = author;
        osApp = os;
    }

    public App () {
        this("", "", "");
    }

    public String getTitle () {
        return titleApp;
    }

    public String getAuthor () {
        return authorApp;
    }

    public String getOs () {
        return osApp;
    }

    public void setTitle ( String val) {
        titleApp = val;
    }

    public void setAuthor ( String val) {
        authorApp = val;
    }

    public void setOs ( String val) {
        osApp = val;
    }
}
