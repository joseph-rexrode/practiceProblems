package oracleJavaPractice.test1;

public class test1 {
    public static void main(String[] args) {

        float value1 = 102.0f;
        float value2 = (int)102.0;
        // float value3 = 1f * 0.0; // doesn't work bc 0.0 is double
        float value4 = 1f * (short)0.0;
        // float value5 = 1f * (boolean)0; // argument is undefined so doesn't work either

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value4);

        System.out.println("Hello world!");
    }
}