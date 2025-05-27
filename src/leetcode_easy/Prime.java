package leetcode_easy;

import java.util.ArrayList;
import java.util.List;

public class Prime {

    public boolean primeCheck(int n) {
        for (int i = 2; i < n; i++) {
            for (int j = 2; j < i; j++) {
                if (n % j == 0) {
                    return false;
                }
            }

        }
        return true;
    }

    public List<Integer> primeList(int n) {
        List<Integer> primeList = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (primeCheck(i)) {
                primeList.add(i);
            }
        }
        return primeList;
    }

    public static void main(String[] args) {
        Prime primeObj = new Prime();
        System.out.println(primeObj.primeCheck(13));

        System.out.println(primeObj.primeList(13));

    }
}
