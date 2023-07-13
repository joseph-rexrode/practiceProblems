package oracleJavaPractice.appBtest;

public class AppBTest {
    public static void main(String[] args) {
        int x = 0;
        while (++x < 5) {
            x += 1;
        }
        String message = x > 5 ? "greater than": "less than";

        System.out.println(message + ", " + x);
    }
}
