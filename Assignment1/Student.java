package Assignment1;

/**
 * Student class to manage each student's ID and answers
 */
public class Student {
    private String studentID;
    private String answer;

    public Student(String studentID, String answer) {
        this.studentID = studentID;
        this.answer = answer;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getAnswer() {
        return answer;
    }
}
