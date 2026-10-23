package mediatheque;

public class PrintOnlyBooksVisitor implements ItemVisitor {
	@Override
	public void visit(Book book) {
		System.out.println(book);
	}

	@Override
	public void visit(CD cd) {
		// rien ne ce fait ici ca imprime que les livres
	}
}
