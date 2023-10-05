package Assignment1;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

/**
 * The SimulationDriver class simulates the entire question voting process.
 */
public class SimulationDriver {
    public static void main(String[] args) {
        // Create a question and configure it's question type
        Question question = new Question("Multiple Choice");
        question.setCandidateAnswers(Arrays.asList("A", "B", "C", "D"));

        System.out.println("What is the answer to this question? (Hint: Pick B)");
        System.out.println("A. CS3560");
        System.out.println("B. Bruh");
        System.out.println("C. Hi");
        System.out.println("D. Yes");

        // Create a VotingService with the configured question
        VotingService votingService = new VotingService(question);

        // Generate and submit student answers (simulates the student answering process)
        List<Student> students = generateRandomStudents();
        for (Student student : students) {
            votingService.submitAnswer(student);
        }

        // Display the results
        System.out.println("\nResults:");
        votingService.displayResults();

        System.out.println("\nStudent Answers:");
        System.out.println("UID\t\t\tAnswers\t\tCorrect?");
        for (Student student : students) {
            System.out.println(student.getStudentID() + "\t\t" + student.getAnswer() + "\t\t" + "Yes");
        }
    }

    private static List<Student> generateRandomStudents() {
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
