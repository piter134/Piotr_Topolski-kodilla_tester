import java.util.Scanner;
public class UserDialogs {
    public static String getFirstLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first letter:");
            String letter = scanner.nextLine().trim();
            if (letter.length() == 1) {
                return letter.toUpperCase();
            }
        }
    }
}