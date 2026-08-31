package creational.singleton;

public class SingletonDemo {

    public static void main(String[] args) {

        System.out.println("=== Singleton Pattern ===");

        Singleton first = Singleton.getInstance();
        Singleton second = Singleton.getInstance();

        System.out.println("Same instance: " + (first == second));

        first.execute();
    }
}
