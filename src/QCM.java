public class QCM extends Question {
    private String[] propositions;
    private String[] reponses;

    public QCM(String enonce, int score, String[] propositions, String[] reponses) {
        super(enonce, score);
        this.propositions = propositions;
        this.reponses = reponses;
    }

    public String[] getPropositions() {
        return propositions;
    }

    public void setPropositions(String[] propositions) {
        this.propositions = propositions;
    }

    public String[] getReponses() {
        return reponses;
    }

    public void setReponses(String[] reponses) {
        this.reponses = reponses;
    }
}//