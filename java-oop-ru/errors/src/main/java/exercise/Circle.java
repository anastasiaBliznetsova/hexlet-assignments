package exercise;

// BEGIN
class Circle {
    Point point;
    int radius;

    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getSquare() throws NegativeRadiusException {
        if (radius < 0) {
            negativeRadiusException();
        }
        return Math.PI * Math.pow(radius, 2);
    }

    public static void negativeRadiusException() throws NegativeRadiusException {
        throw new NegativeRadiusException("");
    }
}
// END
