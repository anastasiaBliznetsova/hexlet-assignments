package exercise;

// BEGIN
public class Cottage implements Home{
    double area;
    int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public String toString() {
        return floorCount + " этажный коттедж площадью " + area + " метров";
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public int compareTo(Home home) {
        if (home.getArea() < area) {
            return 1;
        } else if (home.getArea() == area) {
            return 0;
        }
        return -1;
    }
}
// END
