package operators;

public class HeadingNorth {

    public int getNumberOfNewDirections(){
        int numberOfChangeDirection = 1;
        int difference = 10;
        for(int direction = difference; (direction % 360) != 0; direction += difference) {
            difference += 10;
            numberOfChangeDirection++;
        }
        return numberOfChangeDirection;
    }
}
