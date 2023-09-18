public class ExcPractice {
    public static void main(String[] args) {
        System.out.println("Before try-catch block: ");
        System.out.println("a\n");

        try {
            System.out.println("Starting try block: ");
            System.out.println("b\n");
            throw new IllegalArgumentException();
        }
        catch (RuntimeException e) {
            System.out.println("Exception thrown and caught here: ");
            System.out.println("c\n");
        }
        finally {
            System.out.println("Finally block ran after catch statement: ");
            System.out.println("d\n");
        }
        System.out.println("e");
    }
}