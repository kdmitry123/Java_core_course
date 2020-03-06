package _2_oop._hw._hw_3_inheritance_polymorphism;

public abstract class Shape implements CanEqual {

    public boolean isTriangle(){
        return false;
    }

    public boolean isRectangle(){
        return false;
    }

    public abstract double getArea();

    public String getName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public boolean equalSquares(Shape inputShape) {
        return this.getArea() == inputShape.getArea();
    }
}
