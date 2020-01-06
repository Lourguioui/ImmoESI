import java.util.HashSet;
public class Proprietaire {
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String adresse;
    private int ID;
    private HashSet<Bien> listeBien = new HashSet<Bien>();
    public Proprietaire(String nom, String prenom, String email, String telephone, String adresse, int ID,
                        HashSet<Bien> listeBien) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.adresse = adresse;
        this.ID=ID;
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
    public HashSet<Bien> getListeBien() {
        return listeBien;
    }
    public void setListeBien(HashSet<Bien> listeBien) {
        this.listeBien = listeBien;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public boolean equals(Proprietaire p) {
        if(this.nom==p.getNom() && this.prenom==p.getPrenom() && this.email==p.getEmail() && this.telephone==p.getTelephone() && this.adresse==p.getAdresse() && this.listeBien==p.getListeBien() && this.ID==p.getID()) return true;
        return false;
    }
    public int hashCode() {
        return 31*this.nom.length();
    }

    public Bien findBien(int ID) {
        for(Bien b : this.listeBien) {
            if(b.getID()==ID) return b;
        }
        return null;
    }

}
