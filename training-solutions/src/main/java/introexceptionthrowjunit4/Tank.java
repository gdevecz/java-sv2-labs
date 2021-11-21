package introexceptionthrowjunit4;

public class Tank {

    private int angle;

    public void modifyAngle(int angleNumber) {
        int newAngle = (angle + angleNumber);
        while (newAngle < 0) {
            newAngle += 360;
        }
        newAngle %= 360;
        if (newAngle > 80 && newAngle < 280) {
            throw new IllegalArgumentException("The new angle is unreachable!");
        }
        angle = newAngle;
    }

    public int getAngle() {
        return angle;
    }
}
