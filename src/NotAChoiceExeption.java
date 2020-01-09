public class NotAChoiceExeption extends Exception {
    public NotAChoiceExeption() {
        super("Le choix que vous avez choisi n'est pas disponible");
    }
}
