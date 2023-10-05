package Assignment1;

import java.util.Map;
import java.util.HashMap;

/**
 * VotingService to manage the answering process for the question and keep track of counts for each answer choice.
 */
public class VotingService {
    private Question question;
    private Map<String, Integer> answerCounts;
    //private int answerCounts;

    public VotingService(Question question) {
        this.question = question;
        this.answerCounts = new HashMap<>();
        for (String answer : question.getCandidateAnswers()) {
            answerCounts.put(answer, 0);
        }
    }

    public void submitAnswer(Student student) {
        // Check if the student has already submitted an answer
        answerCounts.put(student.getAnswer(), answerCounts.getOrDefault(student.getAnswer(), 0) + 1);
    }

    public void displayResults() {
        for (Map.Entry<String, Integer> entry : answerCounts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
