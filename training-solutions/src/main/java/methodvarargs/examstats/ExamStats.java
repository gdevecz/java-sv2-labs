package methodvarargs.examstats;

public class ExamStats {

    private int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        if (isResultBlank(results)) {
            throw new IllegalArgumentException("The results is empty.");
        }
        double limit = getRealLimit(limitInPercent);
        return getNumberOfBetter(limitInPercent, results);
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        if (isResultBlank(results)) {
            throw new IllegalArgumentException("The results is empty.");
        }
        double limit = getRealLimit(limitInPercent);
        return isFailedExist(limit, results);
    }

    private boolean isResultBlank(int[] results) {
        return results.length == 0;
    }

    private boolean isFailedExist(double limit, int[] results) {
        for (int point : results) {
            if (point < limit) {
                return true;
            }
        }
        return false;
    }

    private double getRealLimit(int limitInPercent) {
        return (double) maxPoints * (limitInPercent / 100.0);
    }

    private int getNumberOfBetter(int limit, int... results) {
        int counter = 0;
        for (int point : results) {
            if (point > limit) {
                counter++;
            }
        }
        return counter;
    }
}
