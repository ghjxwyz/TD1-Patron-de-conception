package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
    private final List<Item> items = new LinkedList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void accept(ItemVisitor visitor) {
        for (Item item : items) {
            item.accept(visitor);
        }
    }
}
