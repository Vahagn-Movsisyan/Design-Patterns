package creationalPatterns.prototype;

class Circle implements Shape {

    private int x, y, radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle at (" + x + "," + y + ") with radius " + radius);
    }

    @Override
    public Shape clone() {
        Circle circle = new Circle(x, y, radius);
        return circle;
    }
}
