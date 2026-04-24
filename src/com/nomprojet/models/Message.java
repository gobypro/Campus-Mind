import java.time.LocalDateTime;

/**
 * Classe Message
 * Représente un message envoyé dans le système de chat du coach
 */
public class Message {
    private int idMessage;
    private String contenu;
    private LocalDateTime dateEnvoi;

    /**
     * Constructeur de la classe Message
     * @param idMessage Identifiant unique du message
     * @param contenu Contenu textuel du message
     * @param dateEnvoi Date et heure d'envoi du message
     */
    public Message(int idMessage, String contenu, LocalDateTime dateEnvoi) {
        this.idMessage = idMessage;
        this.contenu = contenu;
        this.dateEnvoi = dateEnvoi;
    }

    /**
     * Affiche les détails du message
     */
    public void afficherDetails() {
        System.out.println("[CHAT] " + this.dateEnvoi + " : " + this.contenu);
    }

    // Getters et Setters
    public int getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(int idMessage) {
        this.idMessage = idMessage;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public LocalDateTime getDateEnvoi() {
        return dateEnvoi;
    }

    public void setDateEnvoi(LocalDateTime dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }

    /**
     * Retourne une représentation textuelle du message
     * @return String au format '[CHAT] date : contenu'
     */
    @Override
    public String toString() {
        return "[CHAT] " + this.dateEnvoi + " : " + this.contenu;
    }
}
