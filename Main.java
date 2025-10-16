import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Grade> grades = new ArrayList<>();
        grades.add(new Grade("Math", 92));
        grades.add(new Grade("History", 87));
        Transcript transcript = new Transcript(grades);
        Student alice = new Student("Alice", transcript);
        //Copying student
        Student bob = new Student(alice);
        //Step 1: Try modifying Bob does it affect Alice?
        System.out.println("Before modification:");
        System.out.println(alice);
        System.out.println(bob);
        bob.getTranscript().getGrades().get(0).setScore(45); // mutating via copy
        System.out.println("\nAfter Bob modifies Math grade:");
        System.out.println(alice); // Should not be affected
        System.out.println(bob);
        //Step 2: Try modifying Alices History grade:");
        System.out.println(alice);
    }
}
/* Expected Output Before Fixing
Before modification:
Alice's Transcript: [Math: 92, History: 87]
Alice's Transcript: [Math: 92, History: 87]
After Bob modifies Math grade:
Alice's Transcript: [Math: 45, History: 87]
Bob's Transcript: [Math: 45, History: 87]
After external change to Alice Bob External code
shouldns grades.
*/