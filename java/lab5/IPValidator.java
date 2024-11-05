import java.util.regex.*;

public class IPValidator {
    public static void main(String[] args) {
        String ip = "192.168.1.1";
        Pattern pattern = Pattern.compile(
            "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$"
        );
        Matcher matcher = pattern.matcher(ip);

        if (matcher.matches()) {
            System.out.println("IP-адрес корректен!");
        } else {
            System.out.println("Некорректный IP-адрес!");
        }
    }
}
