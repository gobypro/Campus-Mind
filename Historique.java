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

        System.out.println("\n=== Évolution de vos humeurs ===");
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm");

        for (Humeur h : humeurs) {
            if (h == null) continue;
            int niveau = convertirEtatEnNiveau(h.getEtat());
            String dateFormatee = h.getDate() != null ? sdf.format(h.getDate()) : "Date inconnue   ";
            
            // Génération de la barre (ex: [====> ])
            String barre = "[";
            if (niveau > 0) {
                barre += "=".repeat(niveau - 1) + ">" + " ".repeat(5 - niveau);
            } else {
                barre += "     "; // Cas par défaut si le niveau est 0
            }
            barre += "]";
            
            // Affichage formaté : [Date] [===> ] (4/5) - Heureux
            System.out.printf("[%s] %s (%d/5) - %s%n", dateFormatee, barre, niveau, h.getEtat());
        }
        System.out.println("================================\n");
    }

    /**
     * Analyse et affiche les tendances émotionnelles détectées
     * 
     * @param humeurs Liste des humeurs à analyser
     */
    public void analyserTendances(List<Humeur> humeurs) {
        if (humeurs == null || humeurs.isEmpty()) {
            System.out.println("Aucune donnée pour analyser les tendances.");
            return;
        }

        double somme = 0;
        int count = 0;
        for (Humeur h : humeurs) {
            if (h == null) continue;
            somme += convertirEtatEnNiveau(h.getEtat());
            count++;
        }
        
        if (count == 0) {
            System.out.println("Aucune donnée d'humeur valide pour analyser les tendances.");
            return;
        }
        
        double moyenne = somme / count;
        
        System.out.println("\n=== Analyse des Tendances ===");
        System.out.printf("Moyenne de l'humeur : %.2f/5%n", moyenne);
        
        if (moyenne < 2.5) {
            System.out.println("⚠️ ALERTE : Tendance très basse. Prenez du temps pour vous ou consultez un coach.");
        } else if (moyenne > 4.0) {
            System.out.println("🌟 FÉLICITATIONS : Tendance extrêmement positive ! Continuez comme ça.");
        } else {
            System.out.println("✓ Tendance générale : Stable et équilibrée.");
        }
        System.out.println("=============================\n");
    }

    /**
     * Affiche le graphique des humeurs
     * 
     * @param humeurs Liste des humeurs à afficher
     */
    public void afficherGraphiqueHumeur(List<Humeur> humeurs) {
        genererGraphique(humeurs);
    }

    /**
     * Convertit un état émotionnel en niveau numérique
     * 
     * @param etat L'état émotionnel
     * @return Un niveau de 1 à 5
     */
    private int convertirEtatEnNiveau(String etat) {
        if (etat == null || etat.trim().isEmpty()) {
            return 3; // Par défaut : neutre
        }
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