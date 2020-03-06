package _2_oop._hw._hw_3_inheritance_polymorphism;

public final class ShapeUtils {

    private ShapeUtils() {

    }

    public static boolean isRectangle(Shape inputShape) {
        return inputShape instanceof Rectangle;
    }

    public static boolean isTriangle(Shape inputShape) {

        return inputShape instanceof Triangle;
    }
}
