import java.util.Date;

public class Enfant extends Patient {
    private String classeEtude;
    private String numPere;
    private String numMere;

    public Enfant(String nom, String prenom, Date dateNaissance, String lieuNaissance, String adresse, Dossier dossier, String classeEtude, String numPere, String numMere) {
        super(nom, prenom, dateNaissance, lieuNaissance, adresse, dossier);
        this.classeEtude = classeEtude;
        this.numPere = numPere;
        this.numMere = numMere; //
    }

    public String getClasseEtude() {
        return classeEtude;
    }

    public void setClasseEtude(String classeEtude) {
        this.classeEtude = classeEtude;
    }

    public String getNumPere() {
        return numPere;
    }

    public void setNumPere(String numPere) {
        this.numPere = numPere;
    }

    public String getNumMere() {
        return numMere;
    }

    public void setNumMere(String numMere) {
        this.numMere = numMere;
    }
}