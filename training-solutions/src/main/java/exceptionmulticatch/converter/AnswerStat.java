package exceptionmulticatch.converter;

public class AnswerStat {

    private BinaryStringConverter binaryStringConverter;

    public AnswerStat(BinaryStringConverter binaryStringConverter) {
        this.binaryStringConverter = binaryStringConverter;
    }

    public boolean[] convert(String str) {
        try {
            return binaryStringConverter.binaryStringToBooleanArray(str);
        } catch (NullPointerException | IllegalArgumentException e) {
            throw new InvalidBinaryStringException(e);
        }
    }

    public int answerTruePercent(String answers) {
        boolean[] tmp = convert(answers);
        int sumOfTrue = 0;
        for (boolean actual : tmp) {
            if (actual == true) {
                sumOfTrue++;
            }
        }
        return (int) (Math.round(sumOfTrue / (double) tmp.length * 100));
    }
}
