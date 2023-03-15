public class Rectangle extends Shape {

    private final int height;
    private final int weight;

    public Rectangle(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public double getArea() {
        return height*weight;
    }

    @Override
    public void isShape() {
        System.out.println("shape: Rectangle and area: " + getArea());
    }
}
