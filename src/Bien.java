import java.util.*;
import java.util.*;
abstract class Bien implements Comparable<Bien>{
    private String adresse;
    private double superficie;
    private String natu_trans;
    private double prix;
    private Proprietaire prop;
    private boolean negoc_prix;
    private String description;
    private Date date_ajout;
    private String photo;
    private int ID;
    Wilaya wilaya;


    public Bien(String adresse, double superficie, String natu_trans, double prix, Proprietaire prop,
                boolean negoc_prix, String description, Date date_ajout, String photo, int iD, Wilaya wilaya) {
        this.adresse = adresse;
        this.superficie = superficie;
        this.natu_trans = natu_trans;
        this.prix = prix;
        this.prop = prop;
        this.negoc_prix = negoc_prix;
        this.description = description;
        this.date_ajout = date_ajout;
        this.photo = photo;
        ID = iD;
        this.wilaya = wilaya;
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

    public Date getDate_ajout() {
        return date_ajout;
    }

    public void setDate_ajout(Date date_ajout) {
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

    public void setWilaya(Wilaya wilaya) {
        this.wilaya = wilaya;
    }

    public abstract double calculer_prix();
    public abstract void Afficher();

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ID;
        result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
        result = prime * result + ((date_ajout == null) ? 0 : date_ajout.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((natu_trans == null) ? 0 : natu_trans.hashCode());
        result = prime * result + (negoc_prix ? 1231 : 1237);
        result = prime * result + ((photo == null) ? 0 : photo.hashCode());
        long temp;
        temp = Double.doubleToLongBits(prix);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((prop == null) ? 0 : prop.hashCode());
        temp = Double.doubleToLongBits(superficie);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((wilaya == null) ? 0 : wilaya.hashCode());
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
        Bien other = (Bien) obj;
        if (ID != other.ID)
            return false;
        if (adresse == null) {
            if (other.adresse != null)
                return false;
        } else if (!adresse.equals(other.adresse))
            return false;
        if (date_ajout == null) {
            if (other.date_ajout != null)
                return false;
        } else if (!date_ajout.equals(other.date_ajout))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (natu_trans == null) {
            if (other.natu_trans != null)
                return false;
        } else if (!natu_trans.equals(other.natu_trans))
            return false;
        if (negoc_prix != other.negoc_prix)
            return false;
        if (photo == null) {
            if (other.photo != null)
                return false;
        } else if (!photo.equals(other.photo))
            return false;
        if (Double.doubleToLongBits(prix) != Double.doubleToLongBits(other.prix))
            return false;
        if (prop == null) {
            if (other.prop != null)
                return false;
        } else if (!prop.equals(other.prop))
            return false;
        if (Double.doubleToLongBits(superficie) != Double.doubleToLongBits(other.superficie))
            return false;
        if (wilaya == null) {
            if (other.wilaya != null)
                return false;
        } else if (!wilaya.equals(other.wilaya))
            return false;
        return true;
    }

    @Override
    public int compareTo(Bien o) {
        return this.date_ajout.compareTo(o.getDate_ajout());
    }




}
