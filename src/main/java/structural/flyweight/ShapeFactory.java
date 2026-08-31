package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private final Map<String, Shape> shapes =
            new HashMap<>();

    public Shape getCircle(String color) {

        return shapes.computeIfAbsent(
                color,
                Circle::new
        );
    }

    public int getCacheSize() {
        return shapes.size();
    }
}
