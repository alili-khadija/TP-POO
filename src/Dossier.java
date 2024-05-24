import java.util.ArrayList;
import java.util.List;


public class Dossier {
    private int numDossier;
    private List<RendezVous> rendezVous;
    private List<BilanOrthophonique> bilans;
    private List<FicheSuivi> fichesSuivi;

    public Dossier(int numDossier) {
        this.numDossier = numDossier;
        this.rendezVous = new ArrayList<>();
        this.bilans = new ArrayList<>();
        this.fichesSuivi = new ArrayList<>();//
    }

    public int getNumDossier() {
        return numDossier;
    }

    public void setNumDossier(int numDossier) {
        this.numDossier = numDossier;
    }

    public List<RendezVous> getRendezVous() {
        return rendezVous;
    }

    public List<BilanOrthophonique> getBilans() {
        return bilans;
    }

    public List<FicheSuivi> getFichesSuivi() {
        return fichesSuivi;
    }

    public void addRendezVous(RendezVous rv) {
        rendezVous.add(rv);
    }

    public void addBilan(BilanOrthophonique bilan) {
        bilans.add(bilan);
    }

    public void addFicheSuivi(FicheSuivi fiche) {
        fichesSuivi.add(fiche);
    }
}