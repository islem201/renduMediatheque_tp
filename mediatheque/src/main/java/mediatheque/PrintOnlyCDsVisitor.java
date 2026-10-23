package mediatheque;

public class PrintOnlyCDsVisitor implements ItemVisitor {
	@Override
	public void visit(Book book) {
		// rien ne ce fait ici ca imprime que les livres
	}

	@Override
	public void visit(CD cd) {
		System.out.println(cd);
	}
}
