package stringPractice;

public class StringPractice {
    public static void main(String[] args) {

        // METHOD CHAINING

        String a = "abc";
        String b = a.toUpperCase();

        b = b.replace('B', '2').replace('C', '3');

        System.out.println("a: " + a + "\nb: " + b);


        // STRING BUILDER CLASS

        StringBuilder alpha = new StringBuilder();

        // prevents inefficiency of using immutable String class

        for (char current = 'a'; current <= 'z'; current++) {
            alpha.append(current);
        }

        System.out.println(alpha);
    }
}
