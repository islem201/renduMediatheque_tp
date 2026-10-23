package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}

	private void acceptAll(ItemVisitor visitor) {
		for (Item i : items) {
			i.accept(visitor);
		}
	}
	
	public void printCatalog() {
		acceptAll(new PrintCatalogVisitor());
	}
	
	public void printOnlyBooks() {
		acceptAll(new PrintOnlyBooksVisitor());
	}

	public void printOnlyCDs() {
		acceptAll(new PrintOnlyCDsVisitor());
	}

}
