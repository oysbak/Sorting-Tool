import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String ipAdress = scanner.nextLine();
        String regexExpression = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}"
        + "(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        if (ipAdress.matches(regexExpression)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
    }
}
