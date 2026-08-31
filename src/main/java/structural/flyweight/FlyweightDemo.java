package structural.flyweight;

public class FlyweightDemo {

    public static void main(String[] args) {

        System.out.println("=== Flyweight Pattern ===");

        ShapeFactory factory =
                new ShapeFactory();

        Shape redCircle =
                factory.getCircle("Red");

        Shape anotherRedCircle =
                factory.getCircle("Red");

        Shape blueCircle =
                factory.getCircle("Blue");

        redCircle.draw(10, 20);
        anotherRedCircle.draw(30, 40);
        blueCircle.draw(50, 60);

        System.out.println(
                "Same Red instance: "
                        + (redCircle == anotherRedCircle)
        );

        System.out.println(
                "Cached shapes: "
                        + factory.getCacheSize()
        );
    }
}
