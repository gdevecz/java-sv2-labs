package collectionsset;

import java.util.*;

public class QuestionGame {

    private List<RightAnswer> rightAnswers;

    public QuestionGame(List<RightAnswer> rightAnswers) {
        this.rightAnswers = rightAnswers;
    }

    public void addRightAnswer(RightAnswer newRightAnswer) {
        rightAnswers.add(newRightAnswer);
    }

    public Set<String> drawWinners() {
        if (rightAnswers.size() < 5) {
            throw new IllegalArgumentException("Not enough right answers!");
        }
        Set<String> winners = new HashSet<>();
        int limit = 5;
        Random rnd = new Random();
        while (!rightAnswers.isEmpty() && winners.size() < limit) {
            int index = rnd.nextInt(rightAnswers.size());
            winners.add(rightAnswers.get(index).getName());
            rightAnswers.remove(index);
        }
        return winners;
    }
}
