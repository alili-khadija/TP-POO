import java.util.ArrayList;
import java.util.List;

public class Exo {
    private String consigne;
    private String nomMaterial;
    private List<Integer> scores;

    public Exo(String consigne, String nomMaterial) {
        this.consigne = consigne; //
        this.nomMaterial = nomMaterial;
        this.scores = new ArrayList<>();
    }

    public String getConsigne() {
        return consigne;
    }

    public void setConsigne(String consigne) {
        this.consigne = consigne;
    }

    public String getNomMaterial() {
        return nomMaterial;
    }

    public void setNomMaterial(String nomMaterial) {
        this.nomMaterial = nomMaterial;
    }

    public void addScore(int score) {
        if (score >= 1 && score <= 10) {
            scores.add(score);
        } else {
            System.out.println("Invalid score. Must be between 1 and 10.");
        }
    }

    public double getAverageScore() {
        if (scores.isEmpty()) {
            return 0;
        }
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return total / (double) scores.size();
    }
}