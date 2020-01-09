public class IsNotMaisonExeotion extends Exception {
    public IsNotMaisonExeotion(){
        super("Vous pouvez pas appliquer ce filtre car les bien sont pas des maisons d'après le filtre precednt");
    }
}
