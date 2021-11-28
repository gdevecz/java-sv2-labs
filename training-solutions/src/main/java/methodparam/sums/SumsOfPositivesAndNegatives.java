package methodparam.sums;

import java.util.List;

public class SumsOfPositivesAndNegatives {

    private double sumOfPositives;

    private double sumOfNegatives;

    public SumsOfPositivesAndNegatives(double sumOfPositives, double sumOfNegatives) {
        this.sumOfPositives = sumOfPositives;
        this.sumOfNegatives = sumOfNegatives;
    }

    public double getSumOfPositives() {
        return sumOfPositives;
    }

    public double getSumOfNegatives() {
        return sumOfNegatives;
    }
}

