package Assignment1;

/**
 * Question
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
