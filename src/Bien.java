import java.util.*;
abstract class Bien {
    private String adresse;
    private double superficie;
    private String natu_trans;
    private double prix;
    private Proprietaire prop;
    private boolean negoc_prix;
    private String description;
    private String date_ajout;
    private String photo;
    private int ID;
    Wilaya wilaya;
    public Bien(String adresse, double superficie, String natu_trans, double prix, Proprietaire prop,
                boolean negoc_prix, String description, String date_ajout, String photo, int ID,String nom,double prix_metre) {
        this.adresse = adresse;
        this.superficie = superficie;
        this.natu_trans = natu_trans;
        this.prix = prix;
        this.prop = prop;
        this.negoc_prix = negoc_prix;
        this.description = description;
        this.date_ajout = date_ajout;
        this.photo = photo;
        this.ID = ID;
        this.wilaya.setNom(nom);
        this.wilaya.setPrix_metre(prix_metre);
    }

    public String getAdresse() {
        return adresse;
    }


    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    public double getSuperficie() {
        return superficie;
    }


    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }


    public String getNatu_trans() {
        return natu_trans;
    }


    public void setNatu_trans(String natu_trans) {
        this.natu_trans = natu_trans;
    }


    public double getPrix() {
        return prix;
    }


    public void setPrix(double prix) {
        this.prix = prix;
    }


    public Proprietaire getProp() {
        return prop;
    }


    public void setProp(Proprietaire prop) {
        this.prop = prop;
    }


    public boolean isNegoc_prix() {
        return negoc_prix;
    }


    public void setNegoc_prix(boolean negoc_prix) {
        this.negoc_prix = negoc_prix;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getDate_ajout() {
        return date_ajout;
    }


    public void setDate_ajout(String date_ajout) {
        this.date_ajout = date_ajout;
    }


    public String getPhoto() {
        return photo;
    }


    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getID() {
        return ID;
    }


    public void setID(int iD) {
        ID = iD;
    }

    public Wilaya getWilaya() {
        return wilaya;
    }

    public abstract void Afficher();

    public abstract double calculer_prix();

    public boolean equals(Bien b) {
        if(this.getAdresse()==b.getAdresse() && this.getSuperficie()==b.getSuperficie() && this.getNatu_trans()==b.getNatu_trans() && this.getPrix()==b.getPrix() && this.getProp()==b.getProp() && this.isNegoc_prix()==b.isNegoc_prix() && this.getDescription()==b.getDescription() && this.getDate_ajout()==b.getDate_ajout()&& this.getPhoto()==b.getPhoto() && this.ID==b.getID()) return true;
        return false;
    }

    public int hashCode() {
        return 31*this.adresse.length();
    }
}
