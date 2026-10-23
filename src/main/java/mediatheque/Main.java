package mediatheque;

public class Main {
    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();
        mediatheque.addItem(new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
        mediatheque.addItem(new Book("Philip K. Dick", "Le Maître du haut chateau"));
        mediatheque.addItem(new CD(12, "Sergeant Peppers"));
        mediatheque.addItem(new Book("J.K. Rowling", "Harry Potter à l’école des sorciers"));
        mediatheque.addItem(new Book("Michel Tournier", "Vendredi ou la Vie sauvage"));
        mediatheque.addItem(new CD(14, "Discovery"));

        System.out.println("=== Catalogue complet ===");
        mediatheque.accept(new PrintCatalogVisitor());
        System.out.println("\n=== Livres uniquement ===");
        mediatheque.accept(new PrintOnlyBooksVisitor());
        System.out.println("\n=== CD uniquement ===");
        mediatheque.accept(new PrintOnlyCDsVisitor());
    }
}
