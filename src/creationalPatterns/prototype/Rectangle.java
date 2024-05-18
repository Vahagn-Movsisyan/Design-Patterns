package creationalPatterns.prototype;

public class Rectangle implements Shape {

    private int x, y, width, height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle at (" + x + "," + y + ") with width " + width + " and height " + height);
    }

    @Override
    public Shape clone() {
        Rectangle rectangle = new Rectangle(x, y, width, height);
        return rectangle;
    }
}
