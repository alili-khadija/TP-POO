public abstract class Question {
    private String enonce;
    private int score;

    public Question(String enonce, int score) {
        this.enonce = enonce;
        this.score = score;
    }

    public String getEnonce() {
        return enonce;
    }

    public void setEnonce(String enonce) {
        this.enonce = enonce;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}