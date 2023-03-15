public class Circle extends Shape {
    private static final double PI = 3.14;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI*radius*radius;
    }

    @Override
    public void isShape() {
        System.out.println("shape: Circle and area: " + getArea());
    }
}
