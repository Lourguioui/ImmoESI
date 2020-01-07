

public class Maison extends Habitable {
    private int nbr_etage;
    private int nbr_garage;
    private int nbr_piscine;
    private int nbr_jardin;
    private double sup_habituel;

    public Maison(String adresse, double superficie, String natu_trans, double prix, Proprietaire prop,
                  boolean negoc_prix, String description, String date_ajout, String photo, int ID, boolean meuble,
                  int nbr_piece, int nbr_etage, int nbr_garage, int nbr_piscine, int nbr_jardin, double sup_habituel,String nom,double prix_metre) {
        super(adresse, superficie, natu_trans, prix, prop, negoc_prix, description, date_ajout, photo, ID, meuble,
                nbr_piece,nom,prix_metre);
        this.nbr_etage = nbr_etage;
        this.nbr_garage = nbr_garage;
        this.nbr_piscine = nbr_piscine;
        this.nbr_jardin = nbr_jardin;
        this.sup_habituel = sup_habituel;
    }
    public int getNbr_etage() {
        return nbr_etage;
    }
    public void setNbr_etage(int nbr_etage) {
        this.nbr_etage = nbr_etage;
    }
    public int getNbr_garage() {
        return nbr_garage;
    }
    public void setNbr_garage(int nbr_garage) {
        this.nbr_garage = nbr_garage;
    }
    public int getNbr_piscine() {
        return nbr_piscine;
    }
    public void setNbr_piscine(int nbr_piscine) {
        this.nbr_piscine = nbr_piscine;
    }
    public int getNbr_jardin() {
        return nbr_jardin;
    }
    public void setNbr_jardin(int nbr_jardin) {
        this.nbr_jardin = nbr_jardin;
    }
    public double getSup_habituel() {
        return sup_habituel;
    }
    public void setSup_habituel(double sup_habituel) {
        this.sup_habituel = sup_habituel;
    }
    public void Afficher(){
        System.out.println("L'adresse de la maison est : " + getAdresse());
        System.out.println("La superficié de la maison est : " + getSuperficie());
        System.out.println("La nature de transaction de la maison est : " + getNatu_trans());
        System.out.println("Le prix de la maison est : " + getPrix());
        System.out.println("Le proprietaire de la mainson est : " + getProp().getNom());
        if(isNegoc_prix()) {
            System.out.println("Le prix de la maison est negociable.");
        }else{
            System.out.println("Le prix de la maison n'est pas negocuiable.");
        }
        System.out.println("Description : " + getDescription());
        System.out.println("La date d'ajout de la amison est : " + getDate_ajout());
        System.out.println("Le nombre des étage de dla maison est : " + getNbr_etage());
        System.out.println("Le nombre des garages de la maison est :" + getNbr_garage());
        System.out.println("Le nombre des pescines dans la maison est : " + getNbr_piscine());
        System.out.println("Le nombre des jardins dans la maison est : " + getNbr_jardin());
        System.out.println("La superficié habituel de la maison est : " + getSup_habituel());

    }
    public double calculer_prix(){
        double prix;
        prix = this.getPrix();
        if (this.getNatu_trans() == "Vente" || this.getNatu_trans() == "vente"){
            if(this.getNbr_jardin() > 0 || this.getNbr_piscine() > 0 || this.getNbr_garage() > 0) {
                prix =+ (prix*0.5)/100;
                if (this.getPrix() < 5000000){

                    if (this.wilaya.getPrix_metre() < 50000){
                        prix =+ (prix*3)/100;
                        return prix;
                    }else{
                        prix =+ (prix*3.5)/100;
                        return prix;
                    }
                }
                if (this.getPrix() >= 5000000 || this.getPrix() <= 15000000){
                    if (this.wilaya.getPrix_metre() < 50000){
                        prix =+ (prix*2)/100;
                        return prix;
                    }else{
                        prix =+ (prix*2.5)/100;
                        return prix;
                    }
                }
                if (this.getPrix() > 15000000){
                    if(this.wilaya.getPrix_metre() > 70000){
                        prix =+ (prix*1)/100;
                        return prix;
                    }else{
                        prix =+ (prix*2)/100;
                        return prix;
                    }
                }
            }else{
                if (this.getPrix() < 5000000){

                    if (this.wilaya.getPrix_metre() < 50000){
                        prix =+ (prix*3)/100;
                        return prix;
                    }else{
                        prix =+ (prix*3.5)/100;
                        return prix;
                    }
                }
                if (this.getPrix() >= 5000000 && this.getPrix() <= 15000000){
                    if (this.wilaya.getPrix_metre() < 50000){
                        prix =+ (prix*2)/100;
                        return prix;
                    }else{
                        prix =+ (prix*2.5)/100;
                        return prix;
                    }
                }
                if (this.getPrix() > 15000000){
                    if(this.wilaya.getPrix_metre() > 70000){
                        prix =+ (prix*1)/100;
                        return prix;
                    }else{
                        prix =+ (prix*2)/100;
                        return prix;
                    }
                }
            }
        }
        if (this.getNatu_trans() == "Location" || this.getNatu_trans() == "location"){
            if (this.getNbr_piscine() > 0){
                prix =+ 50000;
                if (this.getSuperficie() < 60){
                    if (this.wilaya.getPrix_metre() <50000){
                        prix =+ prix/100;
                        return prix;
                    }else{
                        prix =+ (prix*1.5)/100;
                        return prix;
                    }
                }
                if (this.getSuperficie() >= 60 && this.getSuperficie() <= 150){
                    if (this.wilaya.getPrix_metre() < 50000){
                        prix =+ (prix*2)/100;
                        return prix;
                    }else{
                        prix =+ (prix*2.5)/100;
                        return prix;
                    }

                }
                if(this.getSuperficie() > 150){
                    if (this.wilaya.getPrix_metre() < 50000){
                        prix =+ (prix*3)/100;
                        return prix;
                    }else{
                        prix =+ (prix*3.5)/100;
                        return prix;
                    }
                }
            }
        }
        if (this.getNatu_trans() == "Echange" || this.getNatu_trans() == "echange"){
            if(this.getNbr_jardin() > 0 || this.getNbr_piscine() > 0 || this.getNbr_garage() > 0) {
                prix =+ (prix*0.5)/100;
                if (this.getPrix() < 5000000){

                    if (this.wilaya.getPrix_metre() < 50000){
                        prix =+ (prix*3)/100;
                        return prix;
                    }else{
                        prix =+ (prix*3.5)/100;
                        return prix;
                    }
                }
                if (this.getPrix() >= 5000000 && this.getPrix() <= 15000000){
                    if (this.wilaya.getPrix_metre() < 50000){
                        prix =+ (prix*2)/100;
                        return prix;
                    }else{
                        prix =+ (prix*2.5)/100;
                        return prix;
                    }
                }
                if (this.getPrix() > 15000000){
                    if(this.wilaya.getPrix_metre() > 70000){
                        prix =+ (prix*1)/100;
                        return prix;
                    }else{
                        prix =+ (prix*2)/100;
                        return prix;
                    }
                }
            }else{
                if (this.getPrix() < 5000000){

                    if (this.wilaya.getPrix_metre() < 50000){
                        prix =+ (prix*3)/100;
                        return prix;
                    }else{
                        prix =+ (prix*3.5)/100;
                        return prix;
                    }
                }
                if (this.getPrix() >= 5000000 && this.getPrix() <= 15000000){
                    if (this.wilaya.getPrix_metre() < 50000){
                        prix =+ (prix*2)/100;
                        return prix;
                    }else{
                        prix =+ (prix*2.5)/100;
                        return prix;
                    }
                }
                if (this.getPrix() > 15000000){
                    if(this.wilaya.getPrix_metre() > 70000){
                        prix =+ (prix*1)/100;
                        return prix;
                    }else{
                        prix =+ (prix*2)/100;
                        return prix;
                    }
                }
            }
        }

        return prix;
    }
    public boolean equals(Maison m) {
        if(super.equals(m) && this.nbr_etage==m.getNbr_etage() && this.nbr_garage==m.getNbr_garage() && this.nbr_jardin==m.getNbr_jardin() && this.nbr_piscine==m.getNbr_piscine()&& this.sup_habituel==m.getSup_habituel()) return true;
        return false;
    }

    public int hashCode() {
        return (this.nbr_etage*this.nbr_garage) + (this.nbr_jardin*this.nbr_piscine) ;
    }



}
