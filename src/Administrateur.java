import jdk.jshell.JShell;

import java.util.HashSet;
import java.util.Scanner;
import java.util.*;
public class Administrateur extends Agence{



    public Administrateur(TreeSet<Bien> biens, TreeSet<Bien> bienArchives, HashSet<Proprietaire> listeProprietaire,
                          HashSet<Wilaya> listeWilaya, ArrayList<Message> listeMessage) {
        super(biens, bienArchives, listeProprietaire, listeWilaya, listeMessage);
        // TODO Auto-generated constructor stub
    }
    public int findPropBien(int ID) {
        int id=0;
        for(Proprietaire p : this.getListeProprietaire()) {
            for(Bien b : p.getListeBien()) {
                if(b.getID()==ID) {return p.getID();}
            }
        }
        return id;
    }
    public Proprietaire findProp(int ID) {
        for(Proprietaire p : this.getListeProprietaire()) {
            if(p.getID()==ID) return p;
        }
        return null;
    }

    public Bien findBien(int ID) {
        for(Bien b : this.getBiens()) {
            if(b.getID()==ID) return b;
        }
        return null;
    }

    public void Ajouter() throws NegativeValueException, HabituelException, NotAChoiceExeption {
        Scanner input = new Scanner(System.in);
        boolean negoc;
        boolean meuble;
        boolean habitable;
        boolean ascenceur0;
        System.out.println("Veuillez entrer l'ID du proprietaire : ");
        int ID = input.nextInt();
        input.nextLine();
        if(ID<0) {throw new NegativeValueException();}
        Proprietaire p = this.findProp(ID);
        if(p==null){throw new NotAChoiceExeption();}
        System.out.println("Veuillez indiquez si le bien est habitable (oui/non): ");
        String habit = input.nextLine();
        if(habit.equals("oui") || habit.equals("OUI")) {
            habitable=true;
        } else{
            habitable=false;
        }
        System.out.println("Veuillez entrer le type du bien : ");
        String typeBien = input.nextLine();
        System.out.println("Veuillez entrer l'adresse du bien : ");
        String adresse = input.nextLine();
        System.out.println("Veuillez entrer la superficie du bien : ");
        double superficie = input.nextDouble();
        input.nextLine();
        if(superficie<0){throw new NegativeValueException();}
        System.out.println("Veuillez entrer la nature de transaction du bien : ");
        String natu_trans = input.nextLine();
        System.out.println("Veuillez entrer le prix du bien : ");
        double prix = input.nextDouble();
        input.nextLine();
        if(prix<0){throw new NegativeValueException();}
        System.out.println("Veuillez préciser si le bien est négociable ou pas (oui/non): ");
        String negociable = input.nextLine();
        if(negociable.equals("oui") || negociable.equals("OUI")) {negoc=true;}else {negoc=false;}
        System.out.println("Veuillez entrer une description du bien : ");
        String description = input.nextLine();
        System.out.println("Veuillez entrer la date d'ajout du bien (jour/mois/année): ");
        String date0 = input.nextLine();
        Date date =new Date(date0);
        System.out.println("Veuillez entrer une photo du bien (URL): ");
        String photo = input.nextLine();
        System.out.println("Veuillez entrer l'ID du bien : ");
        int ID0 = input.nextInt();
        input.nextLine();
        if(ID0<0){throw new NegativeValueException();}
        System.out.println("Veuillez entrer le nom de la wilaya du bien : ");
        String nom_wilaya = input.nextLine();
        System.out.println("Veuillez indiquez le prix du mètre carré du wilaya : ");
        double prix_wilaya = input.nextDouble();
        input.nextLine();
        if(prix<0) {throw new NegativeValueException();}
        Wilaya wilaya = new Wilaya(nom_wilaya, prix_wilaya);
        if(habitable) {
            System.out.println("Veuillez préciser si le bien est meublé (oui/non) : ");
            String meuble0 = input.nextLine();
            if(meuble0.equals("oui") || meuble0.equals("OUI")) meuble=true;else meuble=false;
            System.out.println("Veuillez entrer le nombre de pièce du bien : ");
            int nbr_piece = input.nextInt();
            input.nextLine();
            if(nbr_piece<0){throw new NegativeValueException();}
            if(typeBien.equals("Maison") || typeBien.equals("maison") || typeBien.equals("MAISON")) {
                System.out.println("Veuillez entrer le nombre d'étages du maison : ");
                int nbr_etage = input.nextInt();
                input.nextLine();
                if(nbr_etage<0){throw new NegativeValueException();}
                System.out.println("Veuillez entrer le nombre de garages du maison : ");
                int nbr_garage = input.nextInt();
                input.nextLine();
                if(nbr_garage<0){throw new NegativeValueException();}
                System.out.println("Veuillez entrer le nombre de piscines du maison : ");
                int nbr_piscine = input.nextInt();
                input.nextLine();
                if(nbr_piscine<0){throw new NegativeValueException();}
                System.out.println("Veuillez entrer le nombre de jardins du maison : ");
                int nbr_jardin = input.nextInt();
                input.nextLine();
                if(nbr_jardin<0){throw new NegativeValueException();}
                System.out.println("Veuillez entrer la superficie habitable du bien : ");
                Double sup_habituel = input.nextDouble();
                input.nextLine();
                if(sup_habituel<0){throw new NegativeValueException();}
                if(sup_habituel>superficie) {throw new HabituelException();}
                Maison maison = new  Maison(adresse, superficie, natu_trans, prix,  p, negoc, description, date, photo, ID0, wilaya, meuble, nbr_piece, nbr_etage, nbr_garage, nbr_piscine, nbr_jardin, sup_habituel);
                p.getListeBien().add(maison);
                this.getBiens().add(maison);
                maison.Afficher();
                System.out.println("Le bien a été ajouté avec succes");
            }
            else {
                System.out.println("Veuillez entrer le numero de l'étage du bien : ");
                int num_etage = input.nextInt();
                input.nextLine();
                if(num_etage<0){throw new NegativeValueException();}
                System.out.println("Veuillez préciser si le bien s'agit d'un simplex ou d'un duplexe : ");
                String type = input.nextLine();
                System.out.println("Veuillez préciser si le batiment d'appartement dispose d'une ascenseur : ");
                String ascenceur = input.nextLine();
                if(ascenceur.equals("oui") || ascenceur.equals("OUI"))ascenceur0=true;else ascenceur0=false;
                Appartement appartement = new Appartement(adresse, superficie, natu_trans, prix, p, negoc, description, date, photo, ID0, wilaya,meuble, nbr_piece, num_etage, type,ascenceur0);
                p.getListeBien().add(appartement);
                this.getBiens().add(appartement);
                System.out.println("Le bien a été ajouté avec succes");
            }
        }else {
            System.out.println("Veuillez indiquez le statut juridique : ");
            String statu_juru = input.nextLine();
            System.out.println("Veuillez indiquez le nombre de facades : ");
            int nbr_facade = input.nextInt();
            input.nextLine();
            if(nbr_facade<0){throw new NegativeValueException();}
            Terrain terrain = new Terrain(adresse, superficie, natu_trans, prix, p, negoc, description, date, photo, ID0, wilaya, statu_juru, nbr_facade);
            p.getListeBien().add(terrain);
            this.getBiens().add(terrain);
            System.out.println("Le bien a été ajouté avec succes");
        }
    }

    public void Modifier() throws WrongInputException, HabituelException {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.println("Insérez l'ID du bien que vous voulez modifier.");
        int id = input.nextInt();
        input.nextLine();
        Bien bien_modif = this.findBien(id);
        Proprietaire prop_modif = this.findProp(bien_modif.getProp().getID());
        Bien bien_modif0 = prop_modif.findBien(id);
        if (bien_modif instanceof Maison) {
            System.out.println("Insérez -0- pour modifier l'adresse.");
            System.out.println("Insérez -1- pour modifier la superficie.");
            System.out.println("Insérez -2- pour modifier la nature de transaction.");
            System.out.println("Insérez -3- pour modifier le prix.");
            System.out.println("Insérez -4- pour modifier la négociabilité du prix.");
            System.out.println("Insérez -5- pour modifier la description.");
            System.out.println("Insérez -6- pour modifier la date d'ajout.");
            System.out.println("Insérez -7- pour modifier le nombre de pièces.");
            System.out.println("Insérez -8- pour modifier le nombre d'étage.");
            System.out.println("Insérez -9- pour modifier le nombre de garages.");
            System.out.println("Insérez -10- pour modifier le nombre de piscines.");
            System.out.println("Insérez -11- pour modifier le nombre de jardins.");
            System.out.println("Insérez -12- pour modifier la superficie habituel.");
            System.out.println("Veuillez préciser le nombre de critères que vous voulez choisir : ");
            int nbr = input.nextInt();
            input.nextLine();
            if (nbr < 0 || nbr > 14) {
                throw new WrongInputException();
            }
            for (int j = 1; j <= nbr; j++) {
                System.out.println("# Veuillez choisissez un critère parmi les critères ci-dessus : ");
                a = input.nextInt();
                input.nextLine();
                if (a < 0 || a > 14) {
                    throw new WrongInputException();
                }
                switch (a) {
                    case 0: {
                        System.out.println("Veuillez indiquez la nouvelle adresse du bien : ");
                        String adresse = input.nextLine();
                        bien_modif.setAdresse(adresse);
                        bien_modif0.setAdresse(adresse);
                        break;
                    }
                    case 1: {
                        System.out.println("Veuillez indiquez la nouvelle superficie du bien : ");
                        double superficie = input.nextDouble();
                        input.nextLine();
                        if (superficie < ((Maison) bien_modif).getSup_habituel()) {
                            throw new HabituelException();
                        }
                        bien_modif.setSuperficie(superficie);
                        bien_modif0.setSuperficie(superficie);
                        break;
                    }
                    case 2: {
                        System.out.println("Veuillez indiquez la nouvelle nature de transaction du bien : ");
                        String natu_tran = input.nextLine();
                        bien_modif.setNatu_trans(natu_tran);
                        bien_modif0.setNatu_trans(natu_tran);
                        break;
                    }
                    case 3: {
                        System.out.println("Veuillez indiquez le nouveau prix du bien : ");
                        double prix = input.nextDouble();
                        input.nextLine();
                        bien_modif.setPrix(prix);
                        bien_modif0.setPrix(prix);
                        break;
                    }
                    case 4: {
                        System.out.println("Veuillez indiquez la négociabilitée du prix (oui/non) : ");
                        String negoc0 = input.nextLine();
                        boolean negoc = bien_modif.isNegoc_prix();
                        if (negoc0.equals("oui") || negoc0.equals("OUI")) negoc = true;
                        else if (negoc0.equals("non") || negoc0.equals("NON")) negoc = false;
                        bien_modif.setNegoc_prix(negoc);
                        bien_modif0.setNegoc_prix(negoc);
                        break;
                    }
                    case 5: {
                        System.out.println("Veuillez indiquez la nouvelle déscription : ");
                        String description = input.nextLine();
                        bien_modif.setDescription(description);
                        bien_modif0.setDescription(description);
                        break;
                    }
                    case 6: {
                        System.out.println("Veuillez indiquez la nouvelle date d'ajout (jour/mois/année)");
                        String date0 = input.nextLine();
                        Date date = new Date(date0);
                        bien_modif.setDate_ajout(date);
                        bien_modif0.setDate_ajout(date);
                        break;
                    }
                    case 7: {
                        System.out.println("Veuillez indiquez le nouveau nombre de pièces : ");
                        int nbr_piece = input.nextInt();
                        input.nextLine();
                        ((Maison) bien_modif).setNbr_piece(nbr_piece);
                        ((Maison) bien_modif0).setNbr_piece(nbr_piece);
                        break;
                    }
                    case 8: {
                        System.out.println("Veuillez indiquez le nouveau nombre d'étages : ");
                        int nbr_etage = input.nextInt();
                        input.nextLine();
                        ((Maison) bien_modif).setNbr_etage(nbr_etage);
                        ((Maison) bien_modif0).setNbr_etage(nbr_etage);
                        break;
                    }
                    case 9: {
                        System.out.println("Veuillez indiquez le nouveau nombre de garages : ");
                        int nbr_garage = input.nextInt();
                        input.nextLine();
                        ((Maison) bien_modif).setNbr_garage(nbr_garage);
                        ((Maison) bien_modif0).setNbr_garage(nbr_garage);
                        break;
                    }
                    case 10: {
                        System.out.println("Veuillez indiquez le nouveau nombre de piscines : ");
                        int nbr_piscine = input.nextInt();
                        input.nextLine();
                        ((Maison) bien_modif).setNbr_piscine(nbr_piscine);
                        ((Maison) bien_modif0).setNbr_piscine(nbr_piscine);
                        break;
                    }
                    case 11: {
                        System.out.println("Veuillez indiquez le nouveau nombre de jardins : ");
                        int nbr_jardin = input.nextInt();
                        input.nextLine();
                        ((Maison) bien_modif).setNbr_jardin(nbr_jardin);
                        ((Maison) bien_modif0).setNbr_jardin(nbr_jardin);
                        break;
                    }
                    case 12: {
                        System.out.println("Veuillez indiquez la nouvelle superficie habituel du bien : ");
                        double sup_hab = input.nextDouble();
                        input.nextLine();
                        if (sup_hab > bien_modif.getSuperficie()) {
                            throw new HabituelException();
                        }
                        ((Maison) bien_modif).setSup_habituel(sup_hab);
                        ((Maison) bien_modif0).setSup_habituel(sup_hab);
                        break;
                    }
                }
            }
        } else if (bien_modif instanceof Appartement) {
            System.out.println("Insérez -0- pour modifier l'adresse.");
            System.out.println("Insérez -1- pour modifier la superficie.");
            System.out.println("Insérez -2- pour modifier la nature de transaction.");
            System.out.println("Insérez -3- pour modifier le prix.");
            System.out.println("Insérez -4- pour modifier la négociabilité du prix.");
            System.out.println("Insérez -5- pour modifier la description.");
            System.out.println("Insérez -6- pour modifier la date d'ajout.");
            System.out.println("Insérez -7- pour modifier le nombre de pièces.");
            System.out.println("Insérez -8- pour modifier le numéro d'étage.");
            System.out.println("Insérez -9- pour modifier le type.");
            System.out.println("Veuillez préciser le nombre de critères que vous voulez choisir : ");
            int nbr0 = input.nextInt();
            if (nbr0 < 0 || nbr0 > 14) {
                throw new WrongInputException();
            }
            for (int k = 1; k <= nbr0; k++) {
                System.out.println("# Veuillez choisissez un critère parmi les critères ci-dessus : ");
                b = input.nextInt();
                input.nextLine();
                if (b < 0 || b > 14) {
                    throw new WrongInputException();
                }
                switch (b) {
                    case 0: {
                        System.out.println("Veuillez indiquez la nouvelle adresse du bien : ");
                        String adresse = input.nextLine();
                        bien_modif.setAdresse(adresse);
                        bien_modif0.setAdresse(adresse);
                        break;
                    }
                    case 1: {
                        System.out.println("Veuillez indiquez la nouvelle superficie du bien : ");
                        double superficie = input.nextDouble();
                        input.nextLine();
                        bien_modif.setSuperficie(superficie);
                        bien_modif0.setSuperficie(superficie);
                        break;
                    }
                    case 2: {
                        System.out.println("Veuillez indiquez la nouvelle nature de transaction du bien : ");
                        String natu_tran = input.nextLine();
                        bien_modif.setNatu_trans(natu_tran);
                        bien_modif0.setNatu_trans(natu_tran);
                        break;
                    }
                    case 3: {
                        System.out.println("Veuillez indiquez le nouveau prix du bien : ");
                        double prix = input.nextDouble();
                        input.nextLine();
                        bien_modif.setPrix(prix);
                        bien_modif0.setPrix(prix);
                        break;
                    }
                    case 4: {
                        System.out.println("Veuillez indiquez la négociabilitée du prix (oui/non) : ");
                        String negoc0 = input.nextLine();
                        boolean negoc = bien_modif.isNegoc_prix();
                        if (negoc0.equals("oui") || negoc0.equals("OUI")) negoc = true;
                        else if (negoc0.equals("non") || negoc0.equals("NON")) negoc = false;
                        bien_modif.setNegoc_prix(negoc);
                        bien_modif0.setNegoc_prix(negoc);
                        break;
                    }
                    case 5: {
                        System.out.println("Veuillez indiquez la nouvelle déscription : ");
                        String description = input.nextLine();
                        bien_modif.setDescription(description);
                        bien_modif0.setDescription(description);
                        break;
                    }
                    case 6: {
                        System.out.println("Veuillez indiquez la nouvelle date d'ajout (jour/mois/année)");
                        String date0 = input.nextLine();
                        Date date = new Date(date0);
                        bien_modif.setDate_ajout(date);
                        bien_modif0.setDate_ajout(date);
                        break;
                    }
                    case 7: {
                        System.out.println("Veuillez indiquez le nouveau nombre de pièces : ");
                        int nbr_piece = input.nextInt();
                        input.nextLine();
                        ((Appartement) bien_modif).setNbr_piece(nbr_piece);
                        ((Appartement) bien_modif0).setNbr_piece(nbr_piece);
                        break;
                    }
                    case 8: {
                        System.out.println("Veuillez indiquez le nouveau numéro d'étage : ");
                        int num_etage = input.nextInt();
                        input.nextLine();
                        ((Appartement) bien_modif).setEtage(num_etage);
                        ((Appartement) bien_modif0).setEtage(num_etage);
                        break;
                    }
                    case 9: {
                        System.out.println("Veuillez indiquez le nouveau type : ");
                        String type = input.nextLine();
                        ((Appartement) bien_modif).setType(type);
                        ((Appartement) bien_modif0).setType(type);
                        break;
                    }
                }
            }


        } else if (bien_modif instanceof Terrain) {
            System.out.println("Insérez -0- pour modifier l'adresse.");
            System.out.println("Insérez -1- pour modifier la superficie.");
            System.out.println("Insérez -2- pour modifier la nature de transaction.");
            System.out.println("Insérez -3- pour modifier le prix.");
            System.out.println("Insérez -4- pour modifier la négociabilité du prix.");
            System.out.println("Insérez -5- pour modifier la description.");
            System.out.println("Insérez -6- pour modifier la date d'ajout.");
            System.out.println("Insérez -7- pour modifier le statut jurudique.");
            System.out.println("Insérez -8- pour modifier le nombre de facades.");
            System.out.println("Veuillez préciser le nombre de critères que vous voulez choisir : ");
            int nbr1 = input.nextInt();
            if (nbr1 < 0 || nbr1 > 14) {
                throw new WrongInputException();
            }
            for (int l = 1; l <= nbr1; l++) {
                System.out.println("# Veuillez choisissez un critère parmi les critères ci-dessus : ");
                c = input.nextInt();
                input.nextLine();
                if (c < 0 || c > 14) {
                    throw new WrongInputException();
                }
                switch (c) {
                    case 0: {
                        System.out.println("Veuillez indiquez la nouvelle adresse du bien : ");
                        String adresse = input.nextLine();
                        bien_modif.setAdresse(adresse);
                        bien_modif0.setAdresse(adresse);
                        break;
                    }
                    case 1: {
                        System.out.println("Veuillez indiquez la nouvelle superficie du bien : ");
                        double superficie = input.nextDouble();
                        input.nextLine();
                        bien_modif.setSuperficie(superficie);
                        bien_modif0.setSuperficie(superficie);
                        break;
                    }
                    case 2: {
                        System.out.println("Veuillez indiquez la nouvelle nature de transaction du bien : ");
                        String natu_tran = input.nextLine();
                        bien_modif.setNatu_trans(natu_tran);
                        bien_modif0.setNatu_trans(natu_tran);
                        break;
                    }
                    case 3: {
                        System.out.println("Veuillez indiquez le nouveau prix du bien : ");
                        double prix = input.nextDouble();
                        input.nextLine();
                        bien_modif.setPrix(prix);
                        bien_modif0.setPrix(prix);
                        break;
                    }
                    case 4: {
                        System.out.println("Veuillez indiquez la négociabilitée du prix (oui/non) : ");
                        String negoc0 = input.nextLine();
                        boolean negoc = bien_modif.isNegoc_prix();
                        if (negoc0.equals("oui") || negoc0.equals("OUI")) negoc = true;
                        else if (negoc0.equals("non") || negoc0.equals("NON")) negoc = false;
                        bien_modif.setNegoc_prix(negoc);
                        bien_modif0.setNegoc_prix(negoc);
                        break;
                    }
                    case 5: {
                        System.out.println("Veuillez indiquez la nouvelle déscription : ");
                        String description = input.nextLine();
                        bien_modif.setDescription(description);
                        bien_modif0.setDescription(description);
                        break;
                    }
                    case 6: {
                        System.out.println("Veuillez indiquez la nouvelle date d'ajout (jour/mois/année)");
                        String date0 = input.nextLine();
                        Date date = new Date(date0);
                        bien_modif.setDate_ajout(date);
                        bien_modif0.setDate_ajout(date);
                        break;
                    }
                    case 7: {
                        System.out.println("Veuillez indiquez le nouveau statut jurudique : ");
                        String statu_juru = input.nextLine();
                        ((Terrain) bien_modif).setStatu_juru(statu_juru);
                        ((Terrain) bien_modif0).setStatu_juru(statu_juru);
                        break;
                    }
                    case 8: {
                        System.out.println("Veuillez indiquez le nouveau le nombre de facades : ");
                        int nbr_facade = input.nextInt();
                        input.nextLine();
                        ((Terrain) bien_modif).setNbr_facede(nbr_facade);
                        ((Terrain) bien_modif).setNbr_facede(nbr_facade);
                        break;
                    }
                }
            }

        }
    }

    public void Supprimer() throws NegativeValueException{
        Scanner input = new Scanner(System.in);

        System.out.println("Veuillez entrer l'ID du bien : ");
        int ID = input.nextInt();
        input.nextLine();
        if(ID<0){throw new NegativeValueException();}
        int ID0 = this.findPropBien(ID);
        if(ID0<0) {throw new NegativeValueException();}
        Proprietaire p = this.findProp(ID0);
        Bien b = this.findBien(ID);
        p.getListeBien().remove(p.findBien(ID));
        this.getBiens().remove(b);
        System.out.println("Le bien a été supprimé avec succes");
    }

    public void Archiver() throws NegativeValueException{
        Scanner input = new Scanner(System.in);
        System.out.println("Veuillez entrer l'ID du bien : ");
        int ID = input.nextInt();
        if(ID<0){throw new NegativeValueException();}
        int ID0 = this.findPropBien(ID);
        if(ID0<0) {throw new NegativeValueException();}
        Proprietaire p = this.findProp(ID0);
        Bien b = this.findBien(ID);
        this.getBienArchives().add(p.findBien(ID));
        this.getBiens().remove(b);
        p.getListeBien().remove(p.findBien(ID));
        System.out.println("Le bien a été archivé avec succes");
    }

    public void afficherBiens() {
        for(Bien b : this.getBiens()) {
            b.Afficher_bien();
        }
    }

    public void afficherBienArchives() {
        for(Bien b : this.getBienArchives()) {
            b.Afficher_bien();
        }
    }

    public void afficherProprietaire() {
        for(Proprietaire p : this.getListeProprietaire()) {
            p.Afficher();
        }
    }

    public void afficherWilaya() {
        for(Wilaya w : this.getListeWilaya()) {
            w.Afficher();
        }
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
    public TreeSet<Bien> recherche_habitable (TreeSet<Bien> biens){
        TreeSet<Bien> biens_habitable = new TreeSet<Bien>();
        for (Bien bien : biens){
            if (bien instanceof Habitable){
                biens_habitable.add(bien);
            }
        }
        return biens_habitable;
    }
    public TreeSet<Bien> recherche_nonhabitable(TreeSet<Bien> biens){
        TreeSet<Bien> biens_nonhabitable = new TreeSet<Bien>();
        for (Bien bien : biens){
            if (bien instanceof Non_Habitable){
                biens_nonhabitable.add(bien);
            }
        }
        return biens_nonhabitable;
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
            if (bien instanceof Maison) {
                Bien bien1;
                bien1 = (Maison) bien;
                if (bien1.calculer_prix() == prix) {
                    biens_prix.add(bien1);
                }
            }
            if (bien instanceof Appartement) {
                Bien bien2;
                bien2 = (Appartement) bien;
                if (bien2.calculer_prix() == prix) {
                    biens_prix.add(bien2);
                }
            }
            if (bien instanceof Terrain) {
                Bien bien3;
                bien3 = (Terrain) bien;
                if (bien3.calculer_prix() == prix) {
                    biens_prix.add(bien3);
                }
            }
        }
        return biens_prix;
    }
    public TreeSet<Bien> recherche_entre_prix(TreeSet<Bien> biens, double prix1,double prix2){
        TreeSet<Bien> biens_entre_prix = new TreeSet<Bien>();
        for (Bien bien : biens){
            if (bien instanceof Maison) {
                Bien bien1;
                bien1 = (Maison) bien;
                if (bien1.calculer_prix() >= prix1 && bien1.calculer_prix() <= prix2) {
                    biens_entre_prix.add(bien1);
                }
            }
            if (bien instanceof Appartement) {
                Bien bien2;
                bien2 = (Appartement) bien;
                if (bien2.calculer_prix() >= prix1 && bien2.calculer_prix() <= prix2) {
                    biens_entre_prix.add(bien2);
                }
            }
            if (bien instanceof Terrain) {
                Bien bien3;
                bien3 = (Maison) bien;
                if (bien3.calculer_prix() >= prix1 && bien3.calculer_prix() <= prix2) {
                    biens_entre_prix.add(bien3);
                }
            }
        }
        return biens_entre_prix;
    }
    public TreeSet<Bien> recherche_sup_prix(TreeSet<Bien> biens, double prix){
        TreeSet<Bien> biens_sup_prix = new TreeSet<Bien>();
        for (Bien bien : biens){
            if (bien instanceof Maison) {
                Bien bien1;
                bien1 = (Maison) bien;
                if (bien1.calculer_prix() > prix) {
                    biens_sup_prix.add(bien1);
                }
            }
            if (bien instanceof Appartement) {
                Bien bien2;
                bien2 = (Appartement) bien;
                if (bien2.calculer_prix() > prix) {
                    biens_sup_prix.add(bien2);
                }
            }
            if (bien instanceof Terrain) {
                Bien bien3;
                bien3 = (Maison) bien;
                if (bien3.calculer_prix() > prix) {
                    biens_sup_prix.add(bien3);
                }
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
            if (bien instanceof Maison) {
                Bien bien1;
                bien1 = (Maison) bien;
                if (bien1.calculer_prix() < prix) {
                    biens_inf_prix.add(bien1);
                }
            }
            if (bien instanceof Appartement) {
                Bien bien2;
                bien2 = (Appartement) bien;
                if (bien2.calculer_prix() < prix) {
                    biens_inf_prix.add(bien2);
                }
            }
            if (bien instanceof Terrain) {
                Bien bien3;
                bien3 = (Terrain) bien;
                if (bien3.calculer_prix() < prix) {
                    biens_inf_prix.add(bien3);
                }
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
    public TreeSet<Bien> recherche_nbr_etage(TreeSet<Bien> biens, int nbr_etage){
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
    public TreeSet<Bien> recherche_criteres() throws IsNotMaisonExeotion, NotAChoiceExeption,NegativeValueException{
        Scanner input = new Scanner(System.in);
        TreeSet<Bien> biens_filtre = new TreeSet<Bien>();
        TreeSet<Bien> biens_inter = new TreeSet<Bien>();
        int nbr_critere;
        int cpt,choix;
        System.out.println("######################################## Recherche par critere ###########################################################");
        System.out.println("Donnez le nombre de critère que vous voulez utiliser :");
        nbr_critere = input.nextInt();
        cpt = 1;
        biens_filtre.addAll(this.getBiens());
        do {
            System.out.println("1- Le type de la transaction.");
            System.out.println("2- La wilaya.");
            System.out.println("3- Le prix");
            System.out.println("4- Le type du bien.");
            System.out.println("5- La superficie minimal.");
            System.out.println("6- Le nombre minimal des pieces");
            System.out.println("Choisir le critere num" + cpt + ":");
            choix = input.nextInt();
            input.nextLine();
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
                    System.out.println("1- Entre deux prix.");
                    System.out.println("2- Superieur à un prix.");
                    System.out.println("3- Inferieur à un prix.");
                    System.out.println("4- Prix fix.");
                    System.out.println("Choisir une des optios suivantes :");

                    choix1 = input.nextInt();
                    if (choix1 <=0 || choix1 > 4){throw new NotAChoiceExeption();}
                    switch (choix){
                        case 1:
                            double prix1,prix2;
                            System.out.println("Donnez lz prix min :");
                            prix1 = input.nextDouble();
                            if (prix1 < 0){throw new NegativeValueException();}
                            System.out.println("Donnez le prix max :");
                            prix2 = input.nextDouble();
                            biens_inter.addAll(recherche_entre_prix(biens_filtre,prix1,prix2));
                            biens_filtre.clear();
                            biens_filtre.addAll(biens_inter);
                            biens_inter.clear();
                            break;

                        case 2:
                            double prix;
                            System.out.println("Donnez le prix min : ");
                            prix = input.nextDouble();
                            biens_inter.addAll(recherche_sup_prix(biens_filtre,prix));
                            biens_filtre.clear();
                            biens_filtre.addAll(biens_inter);
                            biens_inter.clear();
                            break;

                        case 3:
                            double prix3;
                            System.out.println("Donnez le prix max : ");
                            prix3 = input.nextDouble();
                            biens_inter.addAll(rechercche_inf_prix(biens_filtre,prix3));
                            biens_filtre.clear();
                            biens_filtre.addAll(biens_inter);
                            biens_inter.clear();
                            break;

                        case 4:
                            double prix0;
                            System.out.println("Donnez le prix que vous cherchez :");
                            prix0 = input.nextDouble();
                            biens_inter.addAll(recherche_prix(biens_filtre,prix0));
                            biens_filtre.clear();
                            biens_filtre.addAll(biens_inter);
                            biens_inter.clear();
                            break;
                    }
                    break;
                case 4:
                    int choix2;
                    System.out.println("1- Habitable.");
                    System.out.println("2-Non habitable.");
                    System.out.println("Veillez indiquer le numero de type desire : ");

                    choix2 = input.nextInt();
                    if (choix2<0){throw new NegativeValueException();}
                    switch (choix2){
                        case 1:
                            biens_inter.addAll(recherche_habitable(biens_filtre));
                            biens_filtre.clear();
                            biens_filtre.addAll(biens_inter);
                            biens_inter.clear();
                            break;

                        case 2:
                            biens_inter.addAll(recherche_nonhabitable(biens_filtre));
                            biens_filtre.clear();
                            biens_filtre.addAll(biens_inter);
                            biens_inter.clear();
                            break;

                    }
                    break;
                case 5:
                    double superficie_min;
                    System.out.println("Donnez la superficie minimal desiré");
                    superficie_min = input.nextDouble();
                    if (superficie_min<0){throw new NegativeValueException();}
                    biens_inter.addAll(recherche_superficie(biens_filtre,superficie_min));
                    biens_filtre.clear();
                    biens_filtre.addAll(biens_inter);
                    biens_inter.clear();
                    break;

                case 6:
                    int nbr_piece;
                    System.out.println("Donnez le nombre des pieces desire :");
                    nbr_piece = input.nextInt();
                    biens_inter.addAll(recherche_habitable(biens_filtre));
                    biens_filtre.clear();
                    biens_filtre.addAll(biens_inter);
                    biens_inter.clear();
                    biens_inter.addAll(recherche_piece(biens_filtre,nbr_piece));
                    biens_filtre.clear();
                    biens_filtre.addAll(biens_inter);
                    biens_inter.clear();
                    break;
            }

            cpt ++;
        }while(cpt <= nbr_critere);

            return biens_filtre;
        }

    public TreeSet<Bien> Ajouter_criter(TreeSet<Bien> biens_filtre) throws NotAChoiceExeption, NegativeValueException, WrongInputException{
        Scanner input = new Scanner(System.in);
        TreeSet<Bien> biens_inter = new TreeSet<Bien>();
        int choix;
        System.out.println("############################################# Ajouter critere ############################################");
        System.out.println("1-Par adresse .");
        System.out.println("2- Par nombre d'etage");
        System.out.println("3-Le prix et negociable ou pas");
        System.out.println("4-Le nombre de garages.");
        System.out.println("5-Par nombre de piscines");
        System.out.println("6-Par nombre de facede.");
        System.out.println("Choisir le numero du critère que vous desirez ajouter :");
        choix = input.nextInt();
        if (choix <= 0 || choix > 6){throw new NotAChoiceExeption();}
        if (choix < 0){throw new NegativeValueException();}
        input.nextLine();
        switch (choix){
            case 1:
                String adresse;
                System.out.println("Donnez l'adresse :");
                adresse = input.nextLine();
                if (!(adresse instanceof String)){throw new WrongInputException();}
                biens_inter.addAll(recherche_adresse(biens_filtre,adresse));
                biens_filtre.clear();
                biens_filtre.addAll(biens_inter);
                biens_inter.clear();
                break;
            case 2:
                int nbr_etage;
                System.out.println("Donnez le nombre d'etage :");
                nbr_etage = input.nextInt();
                if (nbr_etage<0){throw new NegativeValueException();}
                input.nextLine();
                biens_inter.addAll(recherche_maison(biens_filtre));
                biens_filtre.clear();
                biens_filtre.addAll(biens_inter);
                biens_inter.clear();
                biens_inter.addAll(recherche_nbr_etage(biens_filtre,nbr_etage));
                biens_filtre.clear();
                biens_filtre.addAll(biens_inter);
                biens_inter.clear();
                break;
            case 3:
                biens_inter.addAll(recherche_negoc(biens_filtre));
                biens_filtre.clear();
                biens_filtre.addAll(biens_inter);
                biens_inter.clear();
                break;
            case 4:
                int nbr_garage;
                System.out.println("Donnez le nombre des garage recherche");
                nbr_garage = input.nextInt();
                if (nbr_garage<0){throw new NegativeValueException();}
                input.nextLine();
                biens_inter.addAll(recherche_maison(biens_filtre));
                biens_filtre.clear();
                biens_filtre.addAll(biens_inter);
                biens_inter.clear();
                biens_inter.addAll(recherche_garage(biens_filtre,nbr_garage));
                biens_filtre.clear();
                biens_filtre.addAll(biens_inter);
                biens_inter.clear();
                break;

            case 5:
                int nbr_piscine;
                System.out.println("Donnez le nombre des piscines desire :");
                nbr_piscine = input.nextInt();
                if (nbr_piscine<0){throw new NegativeValueException();}
                input.nextLine();
                biens_inter.addAll(recherche_maison(biens_filtre));
                biens_filtre.clear();
                biens_filtre.addAll(biens_inter);
                biens_inter.clear();
                biens_inter.addAll(recherche_piscine(biens_filtre,nbr_piscine));
                biens_filtre.clear();
                biens_filtre.addAll(biens_inter);
                biens_inter.clear();
                break;
            case 6:
                int nbr_facede;
                System.out.println("Donnez le nombre des facede desire :");
                nbr_facede = input.nextInt();
                if (nbr_facede<0){throw new NegativeValueException();}
                input.nextLine();
                biens_inter.addAll(recherche_terrain(biens_filtre));
                biens_filtre.clear();
                biens_filtre.addAll(biens_inter);
                biens_inter.getClass();
                biens_inter.addAll(recherche_facede(biens_filtre,nbr_facede));
                biens_filtre.clear();
                biens_filtre.addAll(biens_inter);
                biens_inter.clear();
                break;
        }
        return biens_filtre;

    }
    public void Afficher_listeBien(){
        for (Bien bien : this.getBiens()){
            System.out.println("##################################################################################");
                bien.Afficher_bien();
            System.out.println("##################################################################################");

        }
    }
    public void afficherMessages() {
        for(Message m : this.getListeMessage()) {
            m.Afficher();
        }
    }

}
