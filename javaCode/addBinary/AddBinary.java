package javaCode.addBinary;

public class AddBinary {
    public String addBinary(String a, String b) {
        // declare answer variable
        String answer = "";
        int carry = 0;
        String smaller = a;
        String bigger = b;
        
        if (a.length() > b.length()) {
            smaller = b;
            bigger = a;
        }

        // iterate through both strings going right to left
        for (int i = 0; i < bigger.length() ; i++) {
            // if either one of the values doesn't exist
            if (smaller.length() - i - 1 < 0) {
                char binNum = bigger.charAt(bigger.length() - 1 - i);
                // if carry is 0
                    // add existing value to answer
                if (carry == 0) {
                    answer = binNum + answer;
                    continue;
                }
                // carry is 1?
                    // add carry to existing value and add that to answer
                else {
                    if (binNum == '0') {
                        answer = '1' + answer;
                        carry = 0;
                        continue;
                    }
                    else {
                        answer = '0' + answer;
                        carry = 1;
                        continue;
                    }
                }
            }
            
            // else -> both values exist -> add
            else {
                char binNumA = a.charAt(a.length() - 1 - i);
                char binNumB = b.charAt(b.length() - 1 - i);
                // if both are 0
                    // if carry is 0 -> add 0 to answer
                if (binNumA == '0' && binNumB == '0') {
                    if (carry == 0) {
                        answer = '0' + answer;
                        continue;
                    }
                    // else -> add 1 to answer and set carry to 0
                    else {
                        answer = '1' + answer;
                        carry = 0;
                        continue;
                    }
                }

                // else if (a[i] or b[i] is 0) -> means b[i]/a[i] is 1
                    // if carry is 0 -> add 1 to answer
                    // else -> add 0 to answer and keep carry as 1
                else if (binNumA == '0' || binNumB == '0') {
                    answer = (carry == 0) ? '1' + answer: '0' + answer;
                    continue;
                }
                // else both are 1 
                    // if carry is 0 -> add 0 to answer and set carry to 1
                    // else -> add 1 to answer and keep carry as 1
                else {
                    answer = (carry == 0) ? '0' + answer: '1' + answer;
                    carry = 1;
                    continue;
                }
            }
        }
        return (carry == 1) ? '1' + answer: answer;
    }
}
