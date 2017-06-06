import java.util.HashMap;

public class InventoryDatabase {
    private HashMap<String, Product> inventoryDatabase;

    public InventoryDatabase() {
        inventoryDatabase = new HashMap<>();
    }

    public HashMap<String, Product> getInventoryDatabase() {
        return inventoryDatabase;
    }

    public void addToDatabase(Product p) {
        inventoryDatabase.put(p.getProductId(), p);
    }

    public void removeFromDatabase(Product p) {
        inventoryDatabase.remove(p);
    }

    public Product getProduct(String pid) {
        return inventoryDatabase.get(pid);
    }

}
