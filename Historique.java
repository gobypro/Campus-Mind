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
        // TODO: Implémenter la logique d'affichage visuel (ex: étoiles ou barres)
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
        return switch (etat) {
            case "Très heureux" -> 5;
            case "Heureux"      -> 4;
            case "Neutre"       -> 3;
            case "Triste"       -> 2;
            case "Très triste"  -> 1;
            default             -> 0; // état inconnu
        };
    }
}