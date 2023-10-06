package Assignment1;

import java.util.List;
import java.util.ArrayList;

/**
 * Question class to manage the question type and list of answers given for the question.
 */
public class Question {
    private String questionType;
    private List<String> candidateAnswers;

    public Question(String questionType) {
        this.questionType = questionType;
        this.candidateAnswers = new ArrayList<>();
    }

    // Set the list of answers from the students for the question
    public void setCandidateAnswers(List<String> candidateAnswers) {
        this.candidateAnswers = candidateAnswers;
    }

    // Return the question type for the question
    public String getQuestionType() {
        return questionType;
    }

    // Return the list of answers
    public List<String> getCandidateAnswers() {
        return candidateAnswers;
    }
}
