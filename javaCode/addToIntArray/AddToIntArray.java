package javaCode.addToIntArray;

import java.util.ArrayList;
import java.util.List;

public class AddToIntArray {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> answer = new ArrayList<>();
        String k_String = Integer.toString(k);
        int[] k_Digits = new int[k_String.length()];

        for (int i = 0; i < k_Digits.length; i++) {
            k_Digits[i] = k_String.charAt(i) - '0';
        }

        int[] maxDigits = (num.length > k_Digits.length) ? num : k_Digits;
        int[] minDigits = (maxDigits == num) ? k_Digits: num;

        for (int i = 0; i < maxDigits.length; i++) {

            int digitSum = (maxDigits.length - i > minDigits.length) ?
                                maxDigits[i] :
                                maxDigits[i] + minDigits[minDigits.length - i];
            

            if (digitSum > 9) {
                digitSum -= 10;
                if (i - 1 < 0) {
                    answer.add(1);
                }
                else {
                    answer.set(i - 1, answer.get(i - 1) + 1);
                }
            }

            answer.add(digitSum);
        }

        return answer;
    }
}
