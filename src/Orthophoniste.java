import java.util.*;

// Orthophoniste class
public class Orthophoniste {
    private String nom;
    private String prenom;
    private String adresse;
    private String numTelephone;
    private String email;
    private String motDePasse;

    public Orthophoniste(String nom, String prenom, String adresse, String numTelephone, String email, String motDePasse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.numTelephone = numTelephone;
        this.email = email;
        this.motDePasse = motDePasse;
    }

    public Dossier createPatientDossier(String nom, String prenom, Date dateNaissance, String lieuNaissance, String adresse) {
        int numDossier = generateDossierNumber();
        Dossier dossier = new Dossier(numDossier);
        return dossier;
    }

    public Consultation scheduleConsultation(Date date, String nom, String prenom, int age) {
        Consultation consultation = new Consultation(date, nom, prenom, age);
        return consultation;
    }

    public Suivi scheduleFollowUp(Date date, int numDossier, TypeSeanceSuivi typeSeance) {
        Suivi suivi = new Suivi(date, numDossier, typeSeance);
        return suivi;
    }

    public Atelier scheduleWorkshop(Date date, String theme, int[] numDossiers) {
        Atelier atelier = new Atelier(date, theme, numDossiers);
        return atelier;
    }

    private int generateDossierNumber() {
        return (int) (Math.random() * 10000);
    }
}
