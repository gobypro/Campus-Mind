
    /**
 * Classe Etudiant
 * Hérite de Utilisateur et représente un étudiant du système MindCare
 */
public class Etudiant extends Utilisateur {
    private String niveau;

    /**
     * Constructeur de la classe Etudiant
     * @param id Identifiant unique de l'étudiant
     * @param nom Nom de l'étudiant
     * @param email Email de l'étudiant
     * @param motDePasse Mot de passe de l'étudiant
     * @param niveau Niveau d'étude de l'étudiant
     */
    public Etudiant(int id, String nom, String email, String motDePasse, String niveau) {
        super(id, nom, email, motDePasse);
        this.niveau = niveau;
    }

    /**
     * Enregistre l'humeur/état émotionnel de l'étudiant
     */
    public void enregistrerHumeur() {
        System.out.println("[MOOD] L'étudiant " + this.nom + " enregistre son état émotionnel");
    }

    /**
     * Affiche les détails de l'étudiant incluant le niveau d'étude
     */
    @Override
    public void afficherDetails() {
        System.out.println("=== Détails Étudiant ===");
        System.out.println("ID    : " + this.id);
        System.out.println("Nom   : " + this.nom);
        System.out.println("Email : " + this.email);
        System.out.println("Niveau: " + this.niveau);
        System.out.println("========================");
    }

    // Getters et Setters
    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
}

