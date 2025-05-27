public class ArrayCheck {

    public boolean arrayCheck(int[] arr) {
        for (int j : arr) {
            if (j == 3 || j == 5) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // Write a code to test if an array of integers does not contain a 3 or a 5
        ArrayCheck arrayCheck = new ArrayCheck();
      System.out.println(arrayCheck.arrayCheck(new int[]{1, 2, 6, 7, 7}));
    }
}
