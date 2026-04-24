import java.util.Date;

public class Humeur {
    private int idHumeur;
    private String etat;
    private Date date;

    public Humeur(int idHumeur, String etat, Date date) {
        this.idHumeur = idHumeur;
        this.etat = etat;
        this.date = date;
    }

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

    @Override
    public String toString() {
        return "Humeur{" + etat + "}";
    }

    public void afficherDetails() {
        System.out.println("Date : " + date + " — État : " + etat);
    }
}