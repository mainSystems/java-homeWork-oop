public class Traingle extends Shape {
    private final int height1;
    private final int height2;
    private final int height3;

    public Traingle(int height1, int height2, int height3) {
        this.height1 = height1;
        this.height2 = height2;
        this.height3 = height3;
    }

    @Override
    public double getArea() {
        int p = (height1+height2+height3)/2;
        return Math.sqrt(p*(p-height1)*(p-height2)*(p-height3));
    }

    @Override
    public void isShape() {
        System.out.println("shape: Triangle and area: " + getArea());
    }
}
