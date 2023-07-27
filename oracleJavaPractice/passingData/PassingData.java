package oracleJavaPractice.passingData;

public class PassingData {
    public static void main(String[] args) {
        int number = 1;
        String letters = "abc";

        number(number); // number stays as 1 because return value isn't assigned to anything

        letters = letters(letters);
        System.out.println(number + letters);

    }

    public static int number(int number) {
        number++;
        return number;
    }

    public static String letters(String letters) {
        letters += "d";
        return letters;
    }
}
