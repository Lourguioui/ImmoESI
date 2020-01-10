import java.util.HashSet;
import java.util.*;
public class Proprietaire {
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String adresse;
    private int ID;
    private TreeSet<Bien> listeBien = new TreeSet<Bien>();

    public Proprietaire(String nom, String prenom, String email, String telephone, String adresse, int iD,
                        TreeSet<Bien> listeBien) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.adresse = adresse;
        ID = iD;
        this.listeBien = listeBien;
    }


    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getPrenom() {
        return prenom;
    }


    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getTelephone() {
        return telephone;
    }


    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


    public String getAdresse() {
        return adresse;
    }


    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    public int getID() {
        return ID;
    }


    public void setID(int iD) {
        ID = iD;
    }


    public TreeSet<Bien> getListeBien() {
        return listeBien;
    }


    public void setListeBien(TreeSet<Bien> listeBien) {
        this.listeBien = listeBien;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Proprietaire)) return false;
        Proprietaire that = (Proprietaire) o;
        return getID() == that.getID() &&
                getNom().equals(that.getNom()) &&
                getPrenom().equals(that.getPrenom()) &&
                getEmail().equals(that.getEmail()) &&
                getTelephone().equals(that.getTelephone()) &&
                getAdresse().equals(that.getAdresse()) &&
                getListeBien().equals(that.getListeBien());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNom(), getPrenom(), getEmail(), getTelephone(), getAdresse(), getID(), getListeBien());
    }

    public void Afficher() {
        System.out.println("le nom du proprietiare : " + this.nom);
        System.out.println("le prenom du proprietiare : " + this.prenom);
        System.out.println("l'adresse du proprietiare : " + this.adresse);
        System.out.println("l'email du proprietiare : " + this.email);
        System.out.println("le telephone du proprietiare : " + this.telephone);
    }

    public Bien findBien(int ID) {
        for (Bien b : this.listeBien) {
            if (b.getID() == ID) return b;
        }
        return null;
    }
    public void Afficher_listeBien(){
        for (Bien bien : this.getListeBien()){
            System.out.println("##################################################################################");
            bien.Afficher_bien();
            System.out.println("##################################################################################");

        }
    }
}
