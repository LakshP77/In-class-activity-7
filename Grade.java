public class Grade {
    private String subject;
    private int score;

    public Grade(String subject, int score) {
        this.subject = subject;
        this.score = score;
    }

    // Copy constructor for deep copying
    public Grade(Grade other) {
        this.subject = other.subject;
        this.score = other.score;
    }

    public String getSubject() {
        return subject;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return subject + ": " + score;
    }
}
