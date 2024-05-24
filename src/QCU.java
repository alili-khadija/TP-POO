public class QCU extends Question {
    private String[] propositions;
    private String reponse;

    public QCU(String enonce, int score, String[] propositions, String reponse) {
        super(enonce, score);
        this.propositions = propositions;
        this.reponse = reponse;
    }

    public String[] getPropositions() {
        return propositions;
    }

    public void setPropositions(String[] propositions) {
        this.propositions = propositions;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }
}