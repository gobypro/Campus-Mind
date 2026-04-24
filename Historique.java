import java.util.List;

/**
 * Classe Historique
 * Gère l'historique des humeurs et l'analyse des tendances émotionnelles
 */
public class Historique {

    /**
     * Génère et affiche un graphique simulé basé sur l'historique des humeurs
     * 
     * @param humeurs Liste des humeurs à afficher dans le graphique
     */
    public void genererGraphique(List<Humeur> humeurs) {
        if (humeurs == null || humeurs.isEmpty()) {
            System.out.println("Aucune donnée d'humeur à afficher.");
            return;
        }

        System.out.println("\n📊 === Évolution de vos humeurs ===");
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm");

        for (Humeur h : humeurs) {
            int niveau = convertirEtatEnNiveau(h.getEtat());
            String dateFormatee = h.getDate() != null ? sdf.format(h.getDate()) : "Date inconnue   ";
            
            // Génération de la barre (ex: [====>     ] ou étoiles)
            // On utilise ici les étoiles pour un rendu propre, plus le mot-clé
            String barreEtoiles = "★".repeat(Math.max(0, niveau)) + "☆".repeat(Math.max(0, 5 - niveau));
            
            // Format: [Date] ★★★★☆ (4/5) - Heureux
            System.out.printf("[%s] %s (%d/5) - %s%n", dateFormatee, barreEtoiles, niveau, h.getEtat());
        }
        System.out.println("===================================\n");
    }

    /**
     * Analyse et affiche les tendances émotionnelles détectées
     */
    public void analyserTendances() {
        // TODO: Implémenter l'algorithme d'analyse des données (moyenne, pics, baisses)
    }

    /**
     * Affiche le graphique des humeurs
     * 
     * @param humeurs Liste des humeurs à afficher
     */
    public void afficherGraphiqueHumeur(List<Humeur> humeurs) {
        // TODO: Appeler la génération de graphique
    }

    /**
     * Convertit un état émotionnel en niveau numérique
     * 
     * @param etat L'état émotionnel
     * @return Un niveau de 1 à 5
     */
    private int convertirEtatEnNiveau(String etat) {
        switch (etat.toLowerCase()) {
            case "très heureux":
            case "euphorique":
                return 5;
            case "heureux":
            case "content":
                return 4;
            case "neutre":
            case "normal":
                return 3;
            case "triste":
            case "mélancolique":
                return 2;
            case "très triste":
            case "déprimé":
                return 1;
            default:
                return 3;
        }
    }
}