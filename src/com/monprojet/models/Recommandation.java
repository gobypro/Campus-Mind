/**
 * Classe Recommandation
 * Représente une recommandation ou conseil donné à un utilisateur
 */
public class Recommandation {
    private int idReco;
    private String contenu;

    /**
     * Constructeur de la recommandation
     * @param idReco Identifiant unique de la recommandation
     * @param contenu Contenu textuel de la recommandation
     */
    public Recommandation(int idReco, String contenu) {
        this.idReco = idReco;
        this.contenu = contenu;
    }

    /**
     * Retourne l'identifiant de la recommandation
     * @return id de la recommandation
     */
    public int getIdReco() {
        return idReco;
    }

    /**
     * Définit l'identifiant de la recommandation
     * @param idReco nouvel identifiant
     */
    public void setIdReco(int idReco) {
        this.idReco = idReco;
    }

    /**
     * Retourne le contenu de la recommandation
     * @return contenu de la recommandation
     */
    public String getContenu() {
        return contenu;
    }

    /**
     * Définit le contenu de la recommandation
     * @param contenu nouveau contenu
     */
    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    /**
     * Affiche les détails de la recommandation avec un message adapté
     * à l'état émotionnel fourni.
     * @param etatEmotionnel état émotionnel de l'utilisateur
     */
    public void afficherDetails(String etatEmotionnel) {
        String conseilAdapté;

        switch (etatEmotionnel.toLowerCase()) {
            case "heureux":
                conseilAdapté = "Profitez de cette énergie positive et continuez comme ça.";
                break;
            case "stressé":
                conseilAdapté = "Respirez profondément, prenez une pause et recentrez-vous.";
                break;
            case "triste":
                conseilAdapté = "Accordez-vous un moment de douceur et n'hésitez pas à parler à quelqu'un.";
                break;
            case "fatigué":
                conseilAdapté = "Faites une courte pause, hydratez-vous et reposez-vous un peu.";
                break;
            default:
                conseilAdapté = "Restez attentif à vos besoins et avancez calmement.";
                break;
        }

        System.out.println("[CONSEIL] " + this.contenu);
        System.out.println("État émotionnel : " + etatEmotionnel);
        System.out.println("Conseil adapté : " + conseilAdapté);
    }

    /**
     * Affiche les détails de la recommandation sans état émotionnel
     */
    public void afficherDetails() {
        System.out.println("[CONSEIL] " + this.contenu);
    }
}
