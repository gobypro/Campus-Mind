
public class Coach extends Utilisateur {
    private String specialite;

    public Coach(int id, String nom, String email, String motDePasse, String specialite) {
        super(id, nom, email, motDePasse);
        this.specialite = specialite;
    }

    public void gererDisponibilites() {
        System.out.println("[SYSTEM] Le coach " + getNom() + " met à jour son calendrier");
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}
