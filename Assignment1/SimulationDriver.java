package Assignment1;
import java.util.*;

/**
 * The SimulationDriver class simulates the entire question voting process.
 */
public class SimulationDriver {
    public static void main(String[] args) {
        // Create a question and configure it's question type
        Question question = new Question("Multiple Choice");
        question.setCandidateAnswers(Arrays.asList("A", "B", "C", "D"));

        // Create a VotingService with the configured question
        VotingService votingService = new VotingService(question);

        // Generate and submit student answers (simulates the student answering process)
        List<Student> students = generateRandomStudents();
        for (Student student : students) {
            votingService.submitAnswer(student);
        }

        // Display the results
        votingService.displayResults();
    }

    public static List<Student> generateRandomStudents() {
        List<Student> students = new ArrayList<>();
        Random random = new Random();

        // Generate a random number of students (between 10 and 50)
        int numStudents = random.nextInt(41) + 10;
        
        for (int i = 1; i <= numStudents; i++) {
            String studentID = "Student" + i;
            String[] candidateAnswers = {"A", "B", "C", "D"};
            String answer = candidateAnswers[random.nextInt(candidateAnswers.length)];

            Student student = new Student(studentID, answer);
            students.add(student);
        }

        return students;
    }
}
