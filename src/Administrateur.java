import jdk.jshell.JShell;

import java.util.HashSet;
import java.util.Scanner;
import java.util.*;
public class Administrateur extends Agence{


    public Administrateur(TreeSet<Bien> biens,TreeSet<Bien> bienArchives,HashSet<Proprietaire> listeProprietaire,
                          TreeSet<Wilaya> listeWilaya) {
        super(biens,  bienArchives, listeProprietaire, listeWilaya);
        // TODO Auto-generated constructor stub
    }

    public Proprietaire findProp(int ID) {
        for(Proprietaire p : this.listeProprietaire) {
            if(p.getID()==ID) return p;
        }
        return null;
    }

    public void Ajouter() throws NegativeValueException, HabituelException {
        Scanner input = new Scanner(System.in);
        boolean negoc=true;
        boolean meuble=true;
        boolean habitable=true;
        System.out.println("Veuillez entrer l'ID du proprietaire : ");
        int ID = input.nextInt();
        if(ID<0) {throw new NegativeValueException();}
        System.out.println("Veuillez indiquez si le bien est habitable (oui/non): ");
        String habit = input.nextLine();
        if(habit=="oui" || habit=="OUI") habitable=true;else habitable=false;
        Proprietaire p = this.findProp(ID);
        System.out.println("Veuillez entrer le type du bien : ");
        String typeBien = input.nextLine();
        System.out.println("Veuillez entrer l'adresse du bien : ");
        String adresse = input.nextLine();
        System.out.println("Veuillez entrer la superficie du bien : ");
        double superficie = input.nextDouble();
        if(superficie<0){throw new NegativeValueException();}
        System.out.println("Veuillez entrer la nature de transaction du bien : ");
        String natu_trans = input.nextLine();
        System.out.println("Veuillez entrer le prix du bien : ");
        double prix = input.nextDouble();
        if(prix<0){throw new NegativeValueException();}
        System.out.println("Veuillez préciser si le bien est négociable ou pas (oui/non): ");
        String negociable = input.nextLine();
        if(negociable=="oui" || negociable=="OUI") {negoc=true;}
        else negoc=false;
        System.out.println("Veuillez entrer une description du bien : ");
        String description = input.nextLine();
        System.out.println("Veuillez entrer la date d'ajout du bien : ");
        String date = input.nextLine();
        System.out.println("Veuillez entrer une photo du bien (URL): ");
        String photo = input.nextLine();
        System.out.println("Veuillez entrer l'ID du bien : ");
        int ID0 = input.nextInt();
        if(ID0<0){throw new NegativeValueException();}
        System.out.println("Veuillez entrer le nom de la wilaya du bien : ");
        String nom_wilaya = input.nextLine();
        System.out.println("Veuillez indiquez le prix du mètre carré du wilaya : ");
        double prix_metre = input.nextDouble();
        if(prix<0) {throw new NegativeValueException();}
        if(habitable) {
            System.out.println("Veuillez préciser si le bien est meublé (oui/non) : ");
            String meuble0 = input.nextLine();
            if(meuble0=="oui" || meuble0=="OUI") meuble=true;else meuble=false;
            System.out.println("Veuillez entrer le nombre de pièce du bien : ");
            int nbr_piece = input.nextInt();
            if(nbr_piece<0){throw new NegativeValueException();}
            if(typeBien=="Maison" || typeBien=="maison" || typeBien=="MAISON") {
                System.out.println("Veuillez entrer le nombre d'étages du maison : ");
                int nbr_etage = input.nextInt();
                if(nbr_etage<0){throw new NegativeValueException();}
                System.out.println("Veuillez entrer le nombre de garages du maison : ");
                int nbr_garage = input.nextInt();
                if(nbr_garage<0){throw new NegativeValueException();}
                System.out.println("Veuillez entrer le nombre de piscines du maison : ");
                int nbr_piscine = input.nextInt();
                if(nbr_piscine<0){throw new NegativeValueException();}
                System.out.println("Veuillez entrer le nombre de jardins du maison : ");
                int nbr_jardin = input.nextInt();
                if(nbr_jardin<0){throw new NegativeValueException();}
                System.out.println("Veuillez entrer la superficie habitable du bien : ");
                Double sup_habituel = input.nextDouble();
                if(sup_habituel<0){throw new NegativeValueException();}
                if(sup_habituel>superficie) {throw new HabituelException();}
                Maison maison = new  Maison(adresse, superficie, natu_trans, prix,  p, negoc, description, date, photo, ID0, meuble, nbr_piece, nbr_etage, nbr_garage, nbr_piscine, nbr_jardin, sup_habituel, nom_wilaya, prix_metre);
                p.getListeBien().add(maison);
                this.getBiens().add(maison);
                System.out.println("Le bien a été ajouté avec succes");
            }
            else {
                System.out.println("Veuillez entrer le numero de l'étage du bien : ");
                int num_etage = input.nextInt();
                if(num_etage<0){throw new NegativeValueException();}
                System.out.println("Veuillez préciser si le bien s'agit d'un simplex ou d'un duplexe : ");
                String type = input.nextLine();
                Appartement appartement = new Appartement(adresse, superficie, natu_trans, prix, p, negoc, description, date, photo, ID0, meuble, nbr_piece, num_etage, type,nom_wilaya, prix_metre);
                p.getListeBien().add(appartement);
                this.getBiens().add(appartement);
                System.out.println("Le bien a été ajouté avec succes");
            }
        }else {
            System.out.println("Veuillez indiquez le statut juridique : ");
            String statu_juru = input.nextLine();
            System.out.println("Veuillez indiquez le nombre de facades : ");
            int nbr_facade = input.nextInt();
            if(nbr_facade<0){throw new NegativeValueException();}
            Terrain terrain = new Terrain(adresse, superficie, natu_trans, prix, p, negoc, description, date, photo, ID0, statu_juru, nbr_facade,nom_wilaya,prix_metre);
            p.getListeBien().add(terrain);
            this.getBiens().add(terrain);
            System.out.println("Le bien a été ajouté avec succes");
        }
    }

    public void Supprimer() throws NegativeValueException{
        Scanner input = new Scanner(System.in);
        System.out.println("Veuillez entrer l'ID du proprietaire : ");
        int ID0 = input.nextInt();
        if(ID0<0) {throw new NegativeValueException();}
        System.out.println("Veuillez entrer l'ID du bien : ");
        int ID = input.nextInt();
        if(ID<0){throw new NegativeValueException();}
        Proprietaire p = this.findProp(ID0);
        p.getListeBien().remove(p.findBien(ID));
        this.getBiens().remove(p.findBien(ID));
        System.out.println("Le bien a été supprimé avec succes");

    }

    public void Archiver() throws NegativeValueException{
        Scanner input = new Scanner(System.in);
        System.out.println("Veuillez entrer l'ID du proprietaire : ");
        int ID0 = input.nextInt();
        if(ID0<0) {throw new NegativeValueException();}
        System.out.println("Veuillez entrer l'ID du bien : ");
        int ID = input.nextInt();
        if(ID<0){throw new NegativeValueException();}
        Proprietaire p = this.findProp(ID0);
        this.bienArchives.add(p.findBien(ID));
        p.getListeBien().remove(p.findBien(ID));
        this.getBiens().remove(p.findBien(ID));
        System.out.println("Le bien a été archivé avec succes");
    }
    public TreeSet<Bien> recherche_maison (TreeSet<Bien> biens){
        TreeSet<Bien> biens_maison = new TreeSet<Bien>();
        for (Bien bien : biens){
            if (bien instanceof Maison){
                biens_maison.add(bien);
            }
        }
        return biens_maison;
    }
    public TreeSet<Bien> recherche_appartement (TreeSet<Bien> biens){
        TreeSet<Bien> biens_appartement = new TreeSet<Bien>();
        for (Bien bien : biens){
            if (bien instanceof Appartement){
                biens_appartement.add(bien);
            }
        }
        return biens_appartement;
    }
    public TreeSet<Bien> recherche_terrain(TreeSet<Bien> biens){
        TreeSet<Bien> biens_terrain = new TreeSet<Bien>();
        for (Bien bien : biens){
            if (bien instanceof Terrain){
                biens_terrain.add(bien);
            }
        }
        return biens_terrain;
    }
    public TreeSet<Bien> recherche_wilaya (TreeSet<Bien> biens, String Wilaya){
        TreeSet<Bien> biens_wilaya = new TreeSet<Bien>();
        for (Bien bien : biens){
            if (bien.getWilaya().getNom().equals(Wilaya)){
                biens_wilaya.add(bien);
            }
        }
        return biens_wilaya;
    }
    public TreeSet<Bien> recherche_adresse (TreeSet<Bien> biens, String Adresse){
        TreeSet<Bien> biens_adresse = new TreeSet<Bien>();
        for (Bien bien : biens){
            if (bien.getAdresse().equals(Adresse)){
                biens_adresse.add(bien);
            }
        }
        return biens_adresse;
    }
    public TreeSet<Bien> recherche_transaction (TreeSet<Bien> biens, String Transaction){
        TreeSet<Bien> biens_transaction = new TreeSet<Bien>();
        for (Bien bien : biens){
            if (bien.getNatu_trans().equals(Transaction)){
                biens_transaction.add(bien);
            }
        }
        return biens_transaction;
    }
    public TreeSet<Bien> recherche_prix (TreeSet<Bien> biens, double prix){
        TreeSet<Bien> biens_prix = new TreeSet<Bien>();
        for (Bien bien : biens){
            if (bien.calculer_prix() == prix){
                biens_prix.add(bien);
            }
        }
        return biens_prix;
    }
    public TreeSet<Bien> recherche_entre_prix(TreeSet<Bien> biens, double prix1,double prix2){
        TreeSet<Bien> biens_entre_prix = new TreeSet<Bien>();
        for (Bien bien : biens){
            if (bien.calculer_prix() >= prix1 && bien.calculer_prix() <= prix2){
                biens_entre_prix.add(bien);
            }
        }
        return biens_entre_prix;
    }
    public TreeSet<Bien> recherche_sup_prix(TreeSet<Bien> biens, double prix){
        TreeSet<Bien> biens_sup_prix = new TreeSet<Bien>();
        for (Bien bien : biens){
            if (bien.calculer_prix() > prix){
                biens_sup_prix.add(bien);
            }
        }
        return biens_sup_prix;
    }
    public TreeSet<Bien> recherche_superficie(TreeSet<Bien> biens, double superficie){
        TreeSet<Bien> biens_superficie = new TreeSet<Bien>();
        for (Bien bien : biens){
            if (bien.getSuperficie() >= superficie){
                biens_superficie.add(bien);
            }
        }
        return biens_superficie;
    }
    public TreeSet<Bien> rechercche_inf_prix(TreeSet<Bien> biens, double prix){
        TreeSet<Bien> biens_inf_prix = new TreeSet<Bien>();
        for (Bien bien : biens){
            if (bien.calculer_prix() < prix){
                biens_inf_prix.add(bien);
            }
        }
        return biens_inf_prix;
    }
    public TreeSet<Bien> recherche_negoc (TreeSet<Bien> biens){
        TreeSet<Bien> biens_negoc = new TreeSet<Bien>();
        for (Bien bien : biens){
            if (bien.isNegoc_prix()){
                biens_negoc.add(bien);
            }
        }
        return biens_negoc;
    }
    public TreeSet<Bien> recherche_piece(TreeSet<Bien> biens, int nbr_pieces){
        TreeSet<Bien> biens_piece = new TreeSet<Bien>();
        for (Bien bien : biens){
            if (((Habitable) bien).getNbr_piece() > nbr_pieces){
                biens_piece.add(bien);

            }
        }
        return biens_piece;
    }
    public TreeSet<Bien> recherche_etage(TreeSet<Bien> biens, int nbr_etage){
        TreeSet<Bien> biens_etage = new TreeSet<Bien>();
        for (Bien bien : biens){

            if (((Maison) bien).getNbr_etage() == nbr_etage ){
                biens_etage.add(bien);
            }
        }
        return biens_etage;
    }
    public TreeSet<Bien> recherche_garage(TreeSet<Bien> biens, int nbr_garage){
        TreeSet<Bien> biens_etage = new TreeSet<Bien>();
        for (Bien bien : biens){
            if (((Maison) bien).getNbr_garage() == nbr_garage){
                biens_etage.add(bien);
            }
        }
        return biens_etage;
    }
    public TreeSet<Bien> recherche_piscine(TreeSet<Bien> biens, int nbr_piscine){
        TreeSet<Bien> biens_piscine = new TreeSet<Bien>();
        for (Bien bien : biens){
            if (((Maison) bien).getNbr_piscine() == nbr_piscine){
                biens_piscine.add(bien);
            }
        }
        return biens_piscine;
    }
    public TreeSet<Bien> recherche_jardin (TreeSet<Bien> biens, int nbr_jardin){
        TreeSet<Bien> biens_jardin = new TreeSet<Bien>();
        for (Bien bien : biens){
            if (((Maison) bien).getNbr_jardin() == nbr_jardin){
                biens_jardin.add(bien);
            }
        }
        return biens_jardin;
    }
    public TreeSet<Bien> recherceh_etage(TreeSet<Bien> biens, int etage){
        TreeSet<Bien> biens_etage = new TreeSet<Bien>();
        for (Bien bien : biens){
            if (((Appartement) bien).getEtage() == etage){
                biens_etage.add(bien);
            }
        }
        return biens_etage;
    }
    public TreeSet<Bien> recherceh_statu_jur(TreeSet<Bien> biens, String statu_jur){
        TreeSet<Bien> biens_statu_jur = new TreeSet<Bien>();
        for (Bien bien : biens){
            if (((Non_Habitable) bien).getStatu_juru() == statu_jur){
                biens_statu_jur.add(bien);
            }
        }
        return biens_statu_jur;
    }
    public TreeSet<Bien> recherche_facede(TreeSet<Bien> biens, int nbr_facede){
        TreeSet<Bien> biens_facede = new TreeSet<Bien>();
        for (Bien bien : biens){
            if (((Non_Habitable) bien).getNbr_facede() == nbr_facede){
                biens_facede.add(bien);
            }
        }
        return biens_facede;
    }
    public TreeSet<Bien> recherche_criteres() throws IsNotMaisonExeotion, NotAChoiceExeption{
        Scanner input = new Scanner(System.in);
        TreeSet<Bien> biens_filtre = new TreeSet<Bien>();
        TreeSet<Bien> biens_inter = new TreeSet<Bien>();
        int nbr_critere;
        int cpt,choix;
        System.out.println("######################################## Recherche par critere ###########################################################");
        System.out.println("Donnez lz nombre de critère que vous voulez utiliser :");
        nbr_critere = input.nextInt();
        cpt = 1;
        biens_filtre.addAll(this.getBiens());
        do {
            System.out.println("Choisir le critere num" + cpt + ":");
            System.out.println("1- Le type de la transaction.");
            System.out.println("2- La wilaya.");
            System.out.println("3- Le prix");
            System.out.println("4- Le type du bien.");
            System.out.println("5- La superficie minimal.");
            System.out.println("6- Le nombre minimal des pieces");
            choix = input.nextInt();
            if (choix <= 0 || choix > 6){ throw new NotAChoiceExeption();}
            switch (choix) {
                case 1:
                    String transaction;
                    System.out.println("Donnez le Type de la transaction :");
                    transaction = input.nextLine();
                    biens_inter.addAll(recherche_transaction(biens_filtre, transaction));
                    biens_filtre.clear();
                    biens_filtre.addAll(biens_inter);
                    biens_inter.clear();
                    break;
                case 2:
                    String wilaya;
                    System.out.println("Donnez la wilaya ");
                    wilaya = input.nextLine();
                    biens_inter.addAll(recherche_wilaya(biens_filtre,wilaya));
                    biens_filtre.clear();
                    biens_filtre.addAll(biens_inter);
                    biens_inter.clear();
                    break;

                case 3:
                    int choix1;
                    System.out.println("Choisir une des optios suivantes :");
                    System.out.println("1- Entre deux prix.");
                    System.out.println("2- Superieur à un prix.");
                    System.out.println("3- Inferieur à un prix.");
                    System.out.println("4- Prix fix.");
                    choix1 = input.nextInt();
                    if (choix1 <=0 || choix1 > 4){throw new NotAChoiceExeption();}
                    switch (choix){
                        case 1:
                            double prix1,prix2;
                            System.out.println("Donnez lz prix min :");
                            prix1 = input.nextDouble();
                            System.out.println("Donnez le prix max :");
                            prix2 = input.nextDouble();
                            biens_inter.addAll(recherche_entre_prix(biens_filtre,prix1,prix2));
                            biens_filtre.clear();
                            biens_filtre.addAll(biens_inter);
                            biens_inter.clear();

                        case 2:
                            double prix;
                            System.out.println("Donnez le prix min : ");
                            prix = input.nextDouble();
                            biens_inter.addAll(recherche_sup_prix(biens_filtre,prix));
                            biens_filtre.clear();
                            biens_filtre.addAll(biens_inter);
                            biens_inter.clear();

                        case 3:
                            double prix3;
                            System.out.println("Donnez le prix max : ");
                            prix3 = input.nextDouble();
                            biens_inter.addAll(rechercche_inf_prix(biens_filtre,prix3));
                            biens_filtre.clear();
                            biens_filtre.addAll(biens_inter);
                            biens_inter.clear();

                        case 4:
                            double prix0;
                            System.out.println("Donnez le prix que vous cherchez :");
                            prix0 = input.nextDouble();
                            biens_inter.addAll(recherche_prix(biens_filtre,prix0));
                            biens_filtre.clear();
                            biens_filtre.addAll(biens_inter);
                            biens_inter.clear();
                    }
                case 4:
                    int choix2;
                    System.out.println("Veillez indiquer le numero de type desire : ");
                    System.out.println("1- Maison.");
                    System.out.println("2-Appartemnt.");
                    System.out.println("3-Terrain.");
                    choix2 = input.nextInt();
                    switch (choix2){
                        case 1:
                            biens_inter.addAll(recherche_maison(biens_filtre));
                            biens_filtre.clear();
                            biens_filtre.addAll(biens_inter);
                            biens_inter.clear();

                        case 2:
                            biens_inter.addAll(recherche_appartement(biens_filtre));
                            biens_filtre.clear();
                            biens_filtre.addAll(biens_inter);
                            biens_inter.clear();

                        case 3:
                            biens_inter.addAll(recherche_terrain(biens_filtre));
                            biens_filtre.clear();
                            biens_filtre.addAll(biens_inter);
                            biens_inter.clear();
                    }
                case 5:
                    double superficie_min;
                    System.out.println("Donnez la superficie minimal desiré");
                    superficie_min = input.nextDouble();
                    biens_inter.addAll(recherche_superficie(biens_filtre,superficie_min));
                    biens_filtre.clear();
                    biens_filtre.addAll(biens_inter);
                    biens_inter.clear();
            }

            cpt ++;
        }while(cpt <= nbr_critere);

            return biens_filtre;
        }


        /*TreeSet<Bien> biens_filtre = new TreeSet<Bien>();
        int choix;

        System.out.println("---- Recherche par critere----");
        System.out.println("Choisir le numero du critere ou des critéres que vous souhaitez :");
        System.out.println("1- Le type de la transaction.");
        System.out.println("2- La wilaya.");
        System.out.println("3- Le prix");
        System.out.println("4- Le type du bien.");
        System.out.println("5- La superficie minimal.");
        System.out.println("6- Le nombre minimal des pieces");
        choix = input.nextInt();
        if (choix < 1 || choix > 6){
            throw new NotAChoiceExeption();
            return biens_filtre;
        }
        switch (choix){
            case 1 :
                int choix1;
                String natur_trans;
                System.out.println("Donner la nature de transactions que vous desirez :  ");
                natur_trans = input.nextLine();
                biens_filtre.addAll(recherche_transaction(this.getBiens(), natur_trans ));
                System.out.println("Vous voulez filtrer selon un autre ?");
                System.out.println("1-OUI");
                System.out.println("2-NON");
                choix1 = input.nextInt();
               if (choix1 == 1){
                   System.out.println("---- Recherche par critere----");
                   System.out.println("Choisir le numero du critere ou des critéres que vous souhaitez :");
                   System.out.println("1- La wilaya.");
                   System.out.println("2- Le prix");
                   System.out.println("3- Le type du bien.");
                   System.out.println("4- La superficie minimal.");
                   System.out.println("5- Le nombre minimal des pieces");
                   choix = input.nextInt();
                   switch (choix){
                       case 1:
                           String wilaya;
                           System.out.println("Donnez le nom de la wilaya desire");
                           wilaya = input.nextLine();
                           biens_filtre.addAll(recherche_wilaya(biens_filtre,wilaya));

                   }
               }else{
                   if (choix1 == 2){
                       return biens_filtre;
                   }else{
                       throw new NotAChoiceExeption();
                       return biens_filtre;

                   }
               }



        }
    }*/
    //public HashSet<Bien>
   /* public void rechercherCritere() throws NegativeValueException, HabituelException{
        Scanner input = new Scanner(System.in);
        boolean meuble0,meuble2,negoc;
        int habitable,f,b,c,d,e;
        System.out.println("-Insérez -00- si vous voulez effectuer une recherche générale dans les biens.");
        System.out.println("-Insérez -01- si le bien est habitable.");
        System.out.println("-Insérez -02- si le bien n'est pas habitable.");
        System.out.println("Veuillez entrer un numéro : ");
        habitable = input.nextInt();
        switch(habitable) {
            case 0:
                System.out.println("-Insérez -01- si vous voulez rechercher par l'adresse.");
                System.out.println("-Insérez -02- si vous voulez rechercher par la superficie.");
                System.out.println("-Insérez -03- si vous voulez rechercher par la nature de la transaction.");
                System.out.println("-Insérez -04- si vous voulez rechercher par le prix.");
                System.out.println("-Insérez -05- si le prix du bien est négociable ou pas (oui/non).");
                System.out.println("-Insérez -06- si vous voulez rechercher par la déscription.");
                System.out.println("-Insérez -07- si vous voulez rechercher par date d'ajout.");
                System.out.println("-Insérez -08- si vous voulez rechercher par la photo.");
                System.out.println("-Insérez -09- si vous voulez rechercher par le nom de la wilaya.");
                System.out.println("-Insérez -10- si vous voulez rechercher par le prix du mètre de la wilaya.");
                System.out.println("-Insérez -11- si vous voulez rechercher par ID.");
                System.out.println("Veuillez entrer un numéro : ");
                e = input.nextInt();
                switch(e) {
                    case 1:
                        System.out.println("Veuillez indiquez l'adresse du bien : ");
                        String adresse = input.nextLine();
                        for(Bien bi : this.getBiens()) {
                            if(bi.getAdresse()==adresse) {bi.Afficher();}
                        }
                        break;
                    case 2:
                        System.out.println("Veuillez indiquez la superficie du bien : ");
                        double superficie = input.nextDouble();
                        if(superficie<0) {throw new NegativeValueException();}
                        for(Bien bi : this.getBiens()) {
                            if(bi.getSuperficie()==superficie) {}
                        }
                        break;
                    case 3:
                        System.out.println("Veuillez indiquez la nature de la transaction du bien : ");
                        String natu_tran = input.nextLine();
                        for(Bien bi : this.getBiens()) {
                            if(bi.getNatu_trans()==natu_tran) {}
                        }
                        break;
                    case 4:
                        System.out.println("Veuillez indiquez le prix du bien : ");
                        double prix = input.nextDouble();
                        if(prix<0){throw new NegativeValueException();}
                        for(Bien bi : this.getBiens()) {
                            if(bi.getPrix()==prix) {}
                        }
                        break;
                    case 5:
                        System.out.println("Veuillez indiquez si le prix du bien est négociable ou pas (oui/non): ");
                        String negoc_prix = input.nextLine();
                        if(negoc_prix=="oui" || negoc_prix=="OUI") negoc=true;else negoc=false;
                        for(Bien bi : this.getBiens()) {
                            if(bi.isNegoc_prix()==negoc) {}
                        }
                        break;
                    case 6:
                        System.out.println("Veuillez indiquez la déscription du bien : ");
                        String description = input.nextLine();
                        for(Bien bi : this.getBiens()) {
                            if(bi.getDescription()==description) {}
                        }
                        break;
                    case 7:
                        System.out.println("Veuillez indiquez la date d'ajout du bien : ");
                        String date = input.nextLine();
                        for(Bien bi : this.getBiens()) {
                            if(bi.getDate_ajout()==date) {}
                        }
                        break;
                    case 8:
                        System.out.println("Veuillez indiquez l'url de la photo du bien : ");
                        String photo = input.nextLine();
                        for(Bien bi : this.getBiens()) {
                            if(bi.getPhoto()==photo) {}
                        }
                        break;
                    case 9:
                        System.out.println("Veuillez indiquez le nom de la wilaya du bien : ");
                        String nom_wilaya = input.nextLine();
                        for(Bien bi : this.getBiens()) {
                            if(bi.getWilaya().getNom()==nom_wilaya) {}
                        }
                        break;
                    case 10:
                        System.out.println("Veuillez indiquez le prix du mètre carré de la wilaya du bien : ");
                        double prix_wilaya = input.nextDouble();
                        for(Bien bi : this.getBiens()) {
                            if(bi.getWilaya().getPrix_metre()==prix_wilaya) {}
                        }
                        break;
                    case 11:
                        System.out.println("Veuillez indiquez l'ID du bien : ");
                        int id = input.nextInt();
                        for(Bien bi : this.getBiens()) {
                            if(bi.getID()==id) {}
                        }
                        break;
                }
                break;
            case 1:
                System.out.println("-Insérez -01- si le bien est une maison.");
                System.out.println("-Insérez -02- si le bien est une appartement.");
                System.out.println("Veuillez entrer un numéro : ");
                f = input.nextInt();
                switch(f) {
                    case 1 :
                        System.out.println("-Insérez -01- si vous voulez rechercher par nombre d'étage.");
                        System.out.println("-Insérez -02- si vous voulez rechercher par nombre de garage.");
                        System.out.println("-Insérez -03- si vous voulez rechercher par nombre de piscine.");
                        System.out.println("-Insérez -04- si vous voulez rechercher par nombre de jardin.");
                        System.out.println("-Insérez -05- si vous voulez rechercher par la superficie habituel.");
                        System.out.println("-Insérez -06- si vous voulez rechercher par nombre de pièce.");
                        System.out.println("-Insérez -07- si vous voulez rechercher un bien meublé ou pas.");
                        System.out.println("-Insérez -08- si vous voulez rechercher par l'adresse.");
                        System.out.println("-Insérez -09- si vous voulez rechercher par la superficie.");
                        System.out.println("-Insérez -10- si vous voulez rechercher par la nature de la transaction.");
                        System.out.println("-Insérez -11- si vous voulez rechercher par le prix.");
                        System.out.println("-Insérez -12- si le prix du bien est négociable ou pas (oui/non).");
                        System.out.println("-Insérez -13- si vous voulez rechercher par la déscription.");
                        System.out.println("-Insérez -14- si vous voulez rechercher par date d'ajout.");
                        System.out.println("-Insérez -15- si vous voulez rechercher par la photo.");
                        System.out.println("-Insérez -16- si vous voulez rechercher par le nom de la wilaya.");
                        System.out.println("-Insérez -17- si vous voulez rechercher par le prix du mètre de la wilaya.");
                        System.out.println("-Insérez -18- si vous voulez rechercher par ID.");
                        System.out.println("Veuillez entrer un numéro : ");
                        b = input.nextInt();
                        switch(b) {
                            case 1:
                                System.out.println("Veuillez indiquez le nombre d'étages du bien : ");
                                int nbr_etage = input.nextInt();
                                if(nbr_etage<0){throw new NegativeValueException();}
                                for(Maison m : this.getMaisons()) {
                                    if(m.getNbr_etage()==nbr_etage) {}
                                }
                                break;
                            case 2:
                                System.out.println("Veuillez indiquez le nombre de garages du bien : ");
                                int nbr_garage = input.nextInt();
                                if(nbr_garage<0){throw new NegativeValueException();}
                                for(Maison m : this.getMaisons()) {
                                    if(m.getNbr_garage()==nbr_garage) {}
                                }
                                break;
                            case 3:
                                System.out.println("Veuillez indiquez le nombre de piscines du bien : ");
                                int nbr_piscine = input.nextInt();
                                if(nbr_piscine<0){throw new NegativeValueException();}
                                for(Maison m : this.getMaisons()) {
                                    if(m.getNbr_piscine()==nbr_piscine) {}
                                }
                                break;
                            case 4:
                                System.out.println("Veuillez indiquez le nombre de jardin du bien : ");
                                int nbr_jardin = input.nextInt();
                                if(nbr_jardin<0){throw new NegativeValueException();}
                                for(Maison m : this.getMaisons()) {
                                    if(m.getNbr_jardin()==nbr_jardin) {}
                                }
                                break;
                            case 5:
                                System.out.println("Veuillez indiquez le nombre de pièce du bien : ");
                                int nbr_piece = input.nextInt();
                                if(nbr_piece<0){throw new NegativeValueException();}
                                for(Maison m : this.getMaisons()) {
                                    if(m.getNbr_piece()==nbr_piece) {}
                                }
                                break;
                            case 6:
                                System.out.println("Veuillez indiquez la superficie habituel bien : ");
                                double sup_habi = input.nextDouble();
                                if(sup_habi<0){throw new NegativeValueException();}
                                for(Maison m : this.getMaisons()) {
                                    if(m.getSup_habituel()==sup_habi) {}
                                }
                                break;
                            case 7:
                                System.out.println("Veuillez indiquez si le bien est meublé ou pas (oui/non): ");
                                String meuble = input.nextLine();
                                if(meuble=="oui" || meuble=="OUI") meuble0=true;else meuble0=false;
                                for(Maison m : this.getMaisons()) {
                                    if(m.isMeuble()==meuble0) {}
                                }
                                break;
                            case 8:
                                System.out.println("Veuillez indiquez l'adresse du bien : ");
                                String adresse = input.nextLine();
                                for(Maison m : this.getMaisons()) {
                                    if(m.getAdresse()==adresse) {}
                                }
                                break;
                            case 9:
                                System.out.println("Veuillez indiquez la superficie du bien : ");
                                double superficie = input.nextDouble();
                                if(superficie<0){throw new NegativeValueException();}

                                for(Maison m : this.getMaisons()) {
                                    if(m.getSuperficie()==superficie) {}
                                }
                                break;
                            case 10:
                                System.out.println("Veuillez indiquez la nature de la transaction du bien : ");
                                String natu_tran = input.nextLine();
                                for(Maison m : this.getMaisons()) {
                                    if(m.getNatu_trans()==natu_tran) {}
                                }
                                break;
                            case 11:
                                System.out.println("Veuillez indiquez le prix du bien : ");
                                double prix = input.nextDouble();
                                if(prix<0){throw new NegativeValueException();}
                                for(Maison m : this.getMaisons()) {
                                    if(m.getPrix()==prix) {}
                                }
                                break;
                            case 12:
                                System.out.println("Veuillez indiquez si le prix du bien est négociable ou pas (oui/non): ");
                                String negoc_prix = input.nextLine();
                                if(negoc_prix=="oui" || negoc_prix=="OUI") negoc=true;else negoc=false;
                                for(Maison m : this.getMaisons()) {
                                    if(m.isNegoc_prix()==negoc) {}
                                }
                                break;
                            case 13:
                                System.out.println("Veuillez indiquez la déscription du bien : ");
                                String description = input.nextLine();
                                for(Maison m : this.getMaisons()) {
                                    if(m.getDescription()==description) {}
                                }
                                break;
                            case 14:
                                System.out.println("Veuillez indiquez la date d'ajout du bien : ");
                                String date = input.nextLine();
                                for(Maison m : this.getMaisons()) {
                                    if(m.getDate_ajout()==date) {}
                                }
                                break;
                            case 15:
                                System.out.println("Veuillez indiquez l'url de la photo du bien : ");
                                String photo = input.nextLine();
                                for(Maison m : this.getMaisons()) {
                                    if(m.getPhoto()==photo) {}
                                }
                                break;
                            case 16:
                                System.out.println("Veuillez indiquez le nom de la wilaya du bien : ");
                                String nom_wilaya = input.nextLine();
                                for(Maison m : this.getMaisons()) {
                                    if(m.getWilaya().getNom()==nom_wilaya) {}
                                }
                                break;
                            case 17:
                                System.out.println("Veuillez indiquez le prix du mètre carré de la wilaya du bien : ");
                                double prix_wilaya = input.nextDouble();
                                for(Maison m : this.getMaisons()) {
                                    if(m.getWilaya().getPrix_metre()==prix_wilaya) {}
                                }
                                break;
                            case 18:
                                System.out.println("Veuillez indiquez l'ID du bien : ");
                                int id = input.nextInt();
                                for(Maison m : this.getMaisons()) {
                                    if(m.getID()==id) {}
                                }
                                break;
                        }
                        break;
                    case 2 :
                        System.out.println("-Insérez -01- si vous voulez rechercher par le numero d'étage.");
                        System.out.println("-Insérez -02- si vous voulez rechercher par le type (simplex/duplexe).");
                        System.out.println("-Insérez -03- si vous voulez rechercher par nombre de pièce.");
                        System.out.println("-Insérez -04- si vous voulez rechercher un bien meublé ou pas.");
                        System.out.println("-Insérez -05- si vous voulez rechercher par l'adresse.");
                        System.out.println("-Insérez -06- si vous voulez rechercher par la superficie.");
                        System.out.println("-Insérez -07- si vous voulez rechercher par la nature de la transaction.");
                        System.out.println("-Insérez -08- si vous voulez rechercher par le prix.");
                        System.out.println("-Insérez -09- si le prix du bien est négociable ou pas (oui/non).");
                        System.out.println("-Insérez -10- si vous voulez rechercher par la déscription.");
                        System.out.println("-Insérez -11- si vous voulez rechercher par date d'ajout.");
                        System.out.println("-Insérez -12- si vous voulez rechercher par la photo.");
                        System.out.println("-Insérez -13- si vous voulez rechercher par le nom de la wilaya.");
                        System.out.println("-Insérez -14- si vous voulez rechercher par le prix du mètre de la wilaya.");
                        System.out.println("-Insérez -15- si vous voulez rechercher par ID.");
                        System.out.println("Veuillez entrer un numéro : ");
                        c = input.nextInt();
                        switch(c) {
                            case 1:
                                System.out.println("Veuillez indiquez le numero d'étage du bien : ");
                                int num_etage = input.nextInt();
                                if(num_etage<0){throw new NegativeValueException();}
                                for(Appartement a : this.getAppartements()) {
                                    if(a.getEtage()==num_etage) {}
                                }
                                break;
                            case 2:
                                System.out.println("Veuillez indiquez le type (simplex/duplexe) du bien : ");
                                String type = input.nextLine();
                                for(Appartement a : this.getAppartements()) {
                                    if(a.getType()==type) {}
                                }
                                break;
                            case 3:
                                System.out.println("Veuillez indiquez le nombre de pièce du bien : ");
                                int nbr_piece = input.nextInt();
                                if(nbr_piece<0){throw new NegativeValueException();}
                                for(Appartement a : this.getAppartements()) {
                                    if(a.getNbr_piece()==nbr_piece) {}
                                }
                                break;
                            case 4:
                                System.out.println("Veuillez indiquez si le bien est meublé ou pas (oui/non): ");
                                String meuble1 = input.nextLine();
                                if(meuble1=="oui" || meuble1=="OUI") meuble2=true;else meuble2=false;
                                for(Appartement a : this.getAppartements()) {
                                    if(a.isMeuble()==meuble2) {}
                                }
                                break;
                            case 5:
                                System.out.println("Veuillez indiquez l'adresse du bien : ");
                                String adresse = input.nextLine();
                                for(Appartement a : this.getAppartements()) {
                                    if(a.getAdresse()==adresse) {}
                                }
                                break;
                            case 6:
                                System.out.println("Veuillez indiquez la superficie du bien : ");
                                double superficie = input.nextDouble();
                                if(superficie<0){throw new NegativeValueException();}
                                for(Appartement a : this.getAppartements()) {
                                    if(a.getSuperficie()==superficie) {}
                                }
                                break;
                            case 7:
                                System.out.println("Veuillez indiquez la nature de la transaction du bien : ");
                                String natu_tran = input.nextLine();
                                for(Appartement a : this.getAppartements()) {
                                    if(a.getNatu_trans()==natu_tran) {}
                                }
                                break;
                            case 8:
                                System.out.println("Veuillez indiquez le prix du bien : ");
                                double prix = input.nextDouble();
                                if(prix<0){throw new NegativeValueException();}
                                for(Appartement a : this.getAppartements()) {
                                    if(a.getPrix()==prix) {}
                                }
                                break;
                            case 9:
                                System.out.println("Veuillez indiquez si le prix du bien est négociable ou pas (oui/non): ");
                                String negoc_prix = input.nextLine();
                                if(negoc_prix=="oui" || negoc_prix=="OUI") negoc=true;else negoc=false;
                                for(Appartement a : this.getAppartements()) {
                                    if(a.isNegoc_prix()==negoc) {}
                                }
                                break;
                            case 10:
                                System.out.println("Veuillez indiquez la déscription du bien : ");
                                String description = input.nextLine();
                                for(Appartement a : this.getAppartements()) {
                                    if(a.getDescription()==description) {}
                                }
                                break;
                            case 11:
                                System.out.println("Veuillez indiquez la date d'ajout du bien : ");
                                String date = input.nextLine();
                                for(Appartement a : this.getAppartements()) {
                                    if(a.getDate_ajout()==date) {}
                                }
                                break;
                            case 12:
                                System.out.println("Veuillez indiquez l'url de la photo du bien : ");
                                String photo = input.nextLine();
                                for(Appartement a : this.getAppartements()) {
                                    if(a.getPhoto()==photo) {}
                                }
                                break;
                            case 13:
                                System.out.println("Veuillez indiquez le nom de la wilaya du bien : ");
                                String nom_wilaya = input.nextLine();
                                for(Appartement a : this.getAppartements()) {
                                    if(a.getWilaya().getNom()==nom_wilaya) {}
                                }
                                break;
                            case 14:
                                System.out.println("Veuillez indiquez le prix du mètre carré de la wilaya du bien : ");
                                double prix_wilaya = input.nextDouble();
                                for(Appartement a : this.getAppartements()) {
                                    if(a.getWilaya().getPrix_metre()==prix_wilaya) {}
                                }
                                break;
                            case 15:
                                System.out.println("Veuillez indiquez l'ID du bien : ");
                                int id = input.nextInt();
                                for(Appartement a : this.getAppartements()) {
                                    if(a.getID()==id) {}
                                }
                                break;
                        }
                        break;
                }
            case 2:
                System.out.println("-Insérez -01- si vous voulez rechercher par le statut jurudique.");
                System.out.println("-Insérez -02- si vous voulez rechercher par le nombre de facades.");
                System.out.println("-Insérez -03- si vous voulez rechercher par l'adresse.");
                System.out.println("-Insérez -04- si vous voulez rechercher par la superficie.");
                System.out.println("-Insérez -05- si vous voulez rechercher par la nature de la transaction.");
                System.out.println("-Insérez -06- si vous voulez rechercher par le prix.");
                System.out.println("-Insérez -07- si le prix du bien est négociable ou pas (oui/non).");
                System.out.println("-Insérez -08- si vous voulez rechercher par la déscription.");
                System.out.println("-Insérez -09- si vous voulez rechercher par date d'ajout.");
                System.out.println("-Insérez -10- si vous voulez rechercher par la photo.");
                System.out.println("-Insérez -11- si vous voulez rechercher par le nom de la wilaya.");
                System.out.println("-Insérez -12- si vous voulez rechercher par le prix du mètre de la wilaya.");
                System.out.println("-Insérez -13- si vous voulez rechercher par ID.");
                System.out.println("Veuillez entrer un numéro : ");
                d = input.nextInt();
                switch(d) {
                    case 1:
                        System.out.println("Veuillez indiquez le statut jurudique du bien : ");
                        String statu_juru = input.nextLine();
                        for(Terrain t : this.getTerrains()) {
                            if(t.getStatu_juru()==statu_juru) {}
                        }
                        break;
                    case 2:
                        System.out.println("Veuillez indiquez le nombre de facades du bien : ");
                        int nbr_facade = input.nextInt();
                        if(nbr_facade<0){throw new NegativeValueException();}
                        for(Terrain t : this.getTerrains()) {
                            if(t.getNbr_facede()==nbr_facade) {}
                        }
                        break;
                    case 3:
                        System.out.println("Veuillez indiquez l'adresse du bien : ");
                        String adresse = input.nextLine();
                        for(Terrain t : this.getTerrains()) {
                            if(t.getAdresse()==adresse) {}
                        }
                        break;
                    case 4:
                        System.out.println("Veuillez indiquez la superficie du bien : ");
                        double superficie = input.nextDouble();
                        if(superficie<0){throw new NegativeValueException();}
                        for(Terrain t : this.getTerrains()) {
                            if(t.getSuperficie()==superficie) {}
                        }
                        break;
                    case 5:
                        System.out.println("Veuillez indiquez la nature de la transaction du bien : ");
                        String natu_tran = input.nextLine();
                        for(Terrain t : this.getTerrains()) {
                            if(t.getNatu_trans()==natu_tran) {}
                        }
                        break;
                    case 6:
                        System.out.println("Veuillez indiquez le prix du bien : ");
                        double prix = input.nextDouble();
                        if(prix<0){throw new NegativeValueException();}
                        for(Terrain t : this.getTerrains()) {
                            if(t.getPrix()==prix) {}
                        }
                        break;
                    case 7:
                        System.out.println("Veuillez indiquez si le prix du bien est négociable ou pas (oui/non): ");
                        String negoc_prix = input.nextLine();
                        if(negoc_prix=="oui" || negoc_prix=="OUI") negoc=true;else negoc=false;
                        for(Terrain t : this.getTerrains()) {
                            if(t.isNegoc_prix()==negoc) {}
                        }
                        break;
                    case 8:
                        System.out.println("Veuillez indiquez la déscription du bien : ");
                        String description = input.nextLine();
                        for(Terrain t : this.getTerrains()) {
                            if(t.getDescription()==description) {}
                        }
                        break;
                    case 9:
                        System.out.println("Veuillez indiquez la date d'ajout du bien : ");
                        String date = input.nextLine();
                        for(Terrain t : this.getTerrains()) {
                            if(t.getDate_ajout()==date) {}
                        }
                        break;
                    case 10:
                        System.out.println("Veuillez indiquez l'url de la photo du bien : ");
                        String photo = input.nextLine();
                        for(Terrain t : this.getTerrains()) {
                            if(t.getPhoto()==photo) {}
                        }
                        break;
                    case 11:
                        System.out.println("Veuillez indiquez le nom de la wilaya du bien : ");
                        String nom_wilaya = input.nextLine();
                        for(Terrain t : this.getTerrains()) {
                            if(t.getWilaya().getNom()==nom_wilaya) {}
                        }
                        break;
                    case 12:
                        System.out.println("Veuillez indiquez le prix du mètre carré de la wilaya du bien : ");
                        double prix_wilaya = input.nextDouble();
                        for(Terrain t : this.getTerrains()) {
                            if(t.getWilaya().getPrix_metre()==prix_wilaya) {}
                        }
                        break;
                    case 13:
                        System.out.println("Veuillez indiquez l'ID du bien : ");
                        int id = input.nextInt();
                        for(Terrain t : this.getTerrains()) {
                            if(t.getID()==id) {}
                        }
                        break;
                }
                break;
        }
    }*/

}
