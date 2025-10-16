// Student.java
public class Student {
    private String name;
    private Transcript transcript;

    public Student(String name, Transcript transcript) {
        this.name = name;
        this.transcript = transcript;
    }

    // Copy constructor
    public Student(Student other) {
        this.name = other.name;
        this.transcript = other.transcript;
    }

    public String getName() {
        return name;
    }

    public Transcript getTranscript() {
        return transcript;
    }

    @Override
    public String toString() {
        return name + "'s Transcript: " + transcript.toString();
    }
}
