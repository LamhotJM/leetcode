import java.util.Scanner;

public class Polindrom {


    public boolean checkPolindrom(String polindrom) {
        for (int i = 0; i < polindrom.length(); i++) {
            if (polindrom.charAt(i) != polindrom.charAt(polindrom.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // polindrom
        // Test case 1 = null -> true
        // Test case 2 = aab -> false
        // Test case 3 = level -> true
        //Scanner scanner = new Scanner(System.in);
        Polindrom polindrom = new Polindrom();
        System.out.println(polindrom.checkPolindrom("abcd"));
        System.out.println(polindrom.checkPolindrom("level"));
        System.out.println(polindrom.checkPolindrom("aab"));
        //System.out.println(polindrom.checkPolindrom(null));

    }
}
