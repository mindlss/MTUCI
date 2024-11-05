import java.util.regex.*;

public class IPValidator {
    public static boolean isValidIP(String ip) {
        String simplePattern = "^([0-9]{1,3}\\.){3}[0-9]{1,3}$";
        if (!ip.matches(simplePattern)) return false;
        
        String[] parts = ip.split("\\.");
        for (String part : parts) {
            int number = Integer.parseInt(part);
            if (number < 0 || number > 255) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValidIP("192.168.1.1")); // true
        System.out.println(isValidIP("256.100.50.25")); // false
    }
}
