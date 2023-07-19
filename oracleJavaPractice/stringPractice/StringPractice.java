package oracleJavaPractice.stringPractice;

public class StringPractice {
    public static void main(String[] args) {

        // METHOD CHAINING

        String a = "abc";
        String b = a.toUpperCase();

        b = b.replace('B', '2').replace('C', '3');

        System.out.println("a: " + a + "\nb: " + b);
    }
}
