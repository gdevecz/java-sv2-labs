package abstractclass.exercise;

public class Divisor extends MathExercise {
    @Override
    public int getSolution(int a, int b) {
        return (int) Math.floor(a / b);
    }
}
