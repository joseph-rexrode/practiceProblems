package javaCode.validParenthesis;

import java.util.ArrayList;

public class Result {
    public boolean isValid(String s) {
        // if s[i-1] is open bracket, s[i] must either be:
            // close bracket same type
            // open bracket
        // if s[i-1] is close bracket, s[i] must either be:
            // open bracket
            // another close bracket 

        ArrayList<Character> open = new ArrayList<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' ||
                s.charAt(i) == '[' ||
                s.charAt(i) == '{') {
                    open.add(open.size(), s.charAt(i));
                }
            else {
                switch(s.charAt(i)) {
                    case ')':
                        if ((open.size() == 0) || 
                            open.get(open.size() - 1) != '(') {
                                return false;
                        }
                        else {
                            System.out.println("This is fine");
                            open.remove(open.size() - 1);
                            break;
                        }
                    case ']':
                        if ((open.size() == 0) || 
                            open.get(open.size() - 1) != '[') {
                                return false;
                        }
                        else {
                            System.out.println("This is fine");
                            open.remove(open.size() - 1);
                            break;
                        }
                    case '}':
                        if ((open.size() == 0) || 
                            open.get(open.size() - 1) != '{') {
                                return false;
                        }
                        else {
                            System.out.println("This is fine");
                            open.remove(open.size() - 1);
                            break;
                        }
                }
            }
        }
        if (open.size() > 0) { return false; }
        return true;
    }
}
