abstract class Patient {
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String lieuNaissance;
    private String adresse;
    private Dossier dossier;

    public Patient(String nom, String prenom, Date dateNaissance, String lieuNaissance, String adresse, Dossier dossier) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.lieuNaissance = lieuNaissance;
        this.adresse = adresse;
        this.dossier = dossier;
    }

    public Dossier getDossier() {
        return dossier;
    }
}//
