public class Palindrome {


    public boolean checkPalindrome(String palindrome) {
        for (int i = 0; i < palindrome.length(); i++) {
            if (palindrome.charAt(i) != palindrome.charAt(palindrome.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // palindrome
        // Test case 1 = null -> true
        // Test case 2 = aab -> false
        // Test case 3 = level -> true
        Palindrome palindromeObj = new Palindrome();
        System.out.println(palindromeObj.checkPalindrome("abcd"));
        System.out.println(palindromeObj.checkPalindrome("level"));
        System.out.println(palindromeObj.checkPalindrome("aab"));

    }
}
