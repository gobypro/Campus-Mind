public class Administrateur extends Utilisateur {

    public Administrateur(int id, String nom, String email, String motDePasse) {
        super(id, nom, email, motDePasse);
    }

    public void gererUtilisateurs() {
        System.out.println("[ADMIN] " + getNom() + " gère la liste des comptes");
    }
}