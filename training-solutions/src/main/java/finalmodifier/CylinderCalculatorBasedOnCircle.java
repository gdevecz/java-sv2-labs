package finalmodifier;

public class CylinderCalculatorBasedOnCircle {

    public double calculateVolume(double r, double h) {
        CircleCalculator circleCalculator = new CircleCalculator();
        return h * circleCalculator.calculateArea(r);
    }

    public double calculateSurfaceArea(double r, double h) {
        CircleCalculator circleCalculator = new CircleCalculator();
        return h * circleCalculator.calculatePerimeter(r) + 2 * circleCalculator.calculateArea(r);
    }
}
