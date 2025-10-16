import java.util.*;

public class Transcript {
    private List<Grade> grades;

    public Transcript(List<Grade> grades) {
        // Deep copy of each Grade object
        this.grades = new ArrayList<>();
        for (Grade g : grades) {
            this.grades.add(new Grade(g));
        }
    }

    // Copy constructor (deep copy)
    public Transcript(Transcript other) {
        this.grades = new ArrayList<>();
        for (Grade g : other.grades) {
            this.grades.add(new Grade(g));
        }
    }

    // Defensive copy to prevent external modification
    public List<Grade> getGrades() {
        List<Grade> copy = new ArrayList<>();
        for (Grade g : grades) {
            copy.add(new Grade(g));
        }
        return copy;
    }

    @Override
    public String toString() {
        return grades.toString();
    }
}
