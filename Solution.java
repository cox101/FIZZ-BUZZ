import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution fizzBuzz = new Solution();
        int n = 15;
        List<String> result = fizzBuzz.fizzBuzz(n);
        for (String str : result) {
            System.out.println(str);
        }
    }
}


