import java.time.LocalDateTime;

/**
 * Classe représentant un message dans le système de chat.
 * Un message contient un identifiant, un contenu et une date d'envoi.
 */
public class Message {
    private int idMessage;
    private String contenu;
    private LocalDateTime dateEnvoi;

    /**
     * Constructeur pour initialiser tous les champs du message.
     * @param idMessage L'identifiant unique du message
     * @param contenu Le contenu textuel du message
     * @param dateEnvoi La date et heure d'envoi du message
     */
    public Message(int idMessage, String contenu, LocalDateTime dateEnvoi) {
        this.idMessage = idMessage;
        this.contenu = contenu;
        this.dateEnvoi = dateEnvoi;
    }

    /**
     * Retourne l'identifiant du message.
     * @return l'identifiant du message
     */
    public int getIdMessage() {
        return idMessage;
    }

    /**
     * Définit l'identifiant du message.
     * @param idMessage le nouvel identifiant du message
     */
    public void setIdMessage(int idMessage) {
        this.idMessage = idMessage;
    }

    /**
     * Retourne le contenu du message.
     * @return le contenu du message
     */
    public String getContenu() {
        return contenu;
    }

    /**
     * Définit le contenu du message.
     * @param contenu le nouveau contenu du message
     */
    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    /**
     * Retourne la date d'envoi du message.
     * @return la date d'envoi du message
     */
    public LocalDateTime getDateEnvoi() {
        return dateEnvoi;
    }

    /**
     * Définit la date d'envoi du message.
     * @param dateEnvoi la nouvelle date d'envoi du message
     */
    public void setDateEnvoi(LocalDateTime dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }

    /**
     * Affiche les détails du message au format [CHAT] date : contenu.
     */
    public void afficherDetails() {
        System.out.println("[CHAT] " + dateEnvoi + " : " + contenu);
    }

    /**
     * Retourne une représentation sous forme de chaîne du message.
     * @return la chaîne au format [CHAT] date : contenu
     */
    @Override
    public String toString() {
        return "[CHAT] " + dateEnvoi + " : " + contenu;
    }
}