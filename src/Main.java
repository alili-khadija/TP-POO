import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Orthophoniste orthophoniste = new Orthophoniste("John", "Doe", "123 Main St", "555-1234", "john.doe@example.com", "password");

        Date dateNaissance = new Date();
        Dossier dossier = orthophoniste.createPatientDossier("Jane", "Doe", dateNaissance, "City", "456 Elm St");

        Patient patient = new Enfant("Jane", "Doe", dateNaissance, "City", "456 Elm St", dossier, "1st Grade", "123-4567", "123-7654");
        Date consultationDate = new Date();
        Consultation consultation = orthophoniste.scheduleConsultation(patient, consultationDate, "Jane", "Doe", 30);

        System.out.println(consultation);
    }
}