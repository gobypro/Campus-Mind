Humeur.java
import java.util.Date;

/**
 * Classe Humeur
 * Représente l'état émotionnel d'un utilisateur à un moment donné
 */
public class Humeur {
    private int idHumeur;
    private String etat;
    private Date date;

    /**
     * Constructeur complet de la classe Humeur
     * @param idHumeur Identifiant unique de l'humeur
     * @param etat État émotionnel (ex: "Heureux", "Triste", "Stressé")
     * @param date Date et heure de l'enregistrement
     */
    public Humeur(int idHumeur, String etat, Date date) {
        this.idHumeur = idHumeur;
        this.etat = etat;
        this.date = date;
    }

    /**
     * Affiche les détails de l'humeur (date et état)
     */
    public void afficherDetails() {
        System.out.println("=== Détails Humeur ===");
        System.out.println("ID   : " + this.idHumeur);
        System.out.println("État : " + this.etat);
        System.out.println("Date : " + this.date);
        System.out.println("======================");
    }

    /**
     * Retourne une représentation textuelle de l'humeur
     * @return String au format 'Humeur{etat}'
     */
    @Override
    public String toString() {
        return "Humeur{etat='" + this.etat + "'}";
    }

    // Getters et Setters
    public int getIdHumeur() {
        return idHumeur;
    }

    public void setIdHumeur(int idHumeur) {
        this.idHumeur = idHumeur;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}