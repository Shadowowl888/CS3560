package Assignment1;

import java.util.List;
import java.util.ArrayList;

/**
 * Question class to manage the question type and list of answers given for the question
 */
public class Question {
    private String questionType;
    private List<String> candidateAnswers;

    public Question(String questionType) {
        this.questionType = questionType;
        this.candidateAnswers = new ArrayList<>();
    }

    public void setCandidateAnswers(List<String> candidateAnswers) {
        this.candidateAnswers = candidateAnswers;
    }

    public String getQuestionType() {
        return questionType;
    }

    public List<String> getCandidateAnswers() {
        return candidateAnswers;
    }
}
