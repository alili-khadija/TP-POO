public class TestQuestion extends Question {
    private Question[] questions;

    public TestQuestion(String enonce, int score, Question[] questions) {
        super(enonce, score);
        this.questions = questions;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }
}//