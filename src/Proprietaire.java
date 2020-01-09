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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ID;
        result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((listeBien == null) ? 0 : listeBien.hashCode());
        result = prime * result + ((nom == null) ? 0 : nom.hashCode());
        result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
        result = prime * result + ((telephone == null) ? 0 : telephone.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Proprietaire other = (Proprietaire) obj;
        if (ID != other.ID)
            return false;
        if (adresse == null) {
            if (other.adresse != null)
                return false;
        } else if (!adresse.equals(other.adresse))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (listeBien == null) {
            if (other.listeBien != null)
                return false;
        } else if (!listeBien.equals(other.listeBien))
            return false;
        if (nom == null) {
            if (other.nom != null)
                return false;
        } else if (!nom.equals(other.nom))
            return false;
        if (prenom == null) {
            if (other.prenom != null)
                return false;
        } else if (!prenom.equals(other.prenom))
            return false;
        if (telephone == null) {
            if (other.telephone != null)
                return false;
        } else if (!telephone.equals(other.telephone))
            return false;
        return true;
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
}