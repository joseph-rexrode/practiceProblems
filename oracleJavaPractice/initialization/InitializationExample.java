package oracleJavaPractice.initialization;


public class InitializationExample {
    private String name = "Fluffy";

    { System.out.println("setting field"); }

    public InitializationExample() {
        name = "Tiny";
        System.out.println("setting constructor");
    }
    public static void main(String[] args) {
        InitializationExample initial = new InitializationExample();
        System.out.println(initial.name);
    }
}