package constructorPractice;

class Primate {
    public Primate() {
        System.out.println("Primate"); // this one prints first bc Java executes 
                                        // parent constructor first
    }
}

class Ape extends Primate {
    public Ape() {
        System.out.println("Ape");
    }
}

public class Constructors extends Ape {
    public static void main(String[] args) {
        new Constructors();
    }
}
