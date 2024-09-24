public class SocialNetwork extends App {
    private String typeSN;
    private int userCountSN;

    public SocialNetwork (String title, String author, String os, String type, int userCount){
        super (title, author, os);
        typeSN = type;
        userCountSN = userCount;
    }

    public SocialNetwork() {
        this ("", "", "", "", 0);
    }

    public String getType () {
        return typeSN;
    }

    public int getUserCount () {
        return userCountSN;
    }

    public void setType (String val) {
        typeSN = val;
    }

    public void setUserCount (int val) {
        userCountSN = val;
    }
}
