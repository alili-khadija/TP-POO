public class ReponseLibre extends Question {
    private String reponse;

    public ReponseLibre(String enonce, int score, String reponse) {
        super(enonce, score);
        this.reponse = reponse;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }
}//