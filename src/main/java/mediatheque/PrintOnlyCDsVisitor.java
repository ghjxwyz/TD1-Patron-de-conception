package mediatheque;

public class PrintOnlyCDsVisitor implements ItemVisitor {
    @Override
    public void visit(Book book) {
        // Ce visiteur ignore les livres.
    }

    @Override
    public void visit(CD cd) {
        System.out.println(cd);
    }
}
