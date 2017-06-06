public class InventorySystemImplementation implements InventoryManagementSystem {

    private InventoryDatabase invDB;
    private static boolean tempCounter = true;

    public InventorySystemImplementation() {
        invDB = new InventoryDatabase();
    }

    public void addProduct(Product p) {
        invDB.addToDatabase(p);
    }

    @Override
    public PickingResult pickProduct(String productId, int amountToPick) {
        Product p = invDB.getProduct(productId);
        PickingResult pr;
        synchronized (p) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int level = p.getProductLevel();
            if(level < amountToPick) {
                pr = new PickingResult(productId, p.getProductName(), false, 0, 0, "Not enough stock.");
            }
            else {
                p.setProductLevel(level - amountToPick);
                pr = new PickingResult(productId, p.getProductName(), true, level, level - amountToPick, "");
            }
        }
        return pr;
    }

    @Override
    public RestockingResult restockProduct(String productId, int amountToRestock) {
        Product p = invDB.getProduct(productId);
        RestockingResult rr;
        synchronized (p) {
            int level = p.getProductLevel();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            p.setProductLevel(level + amountToRestock);
            rr = new RestockingResult(productId, p.getProductName(), true, level, level + amountToRestock, "");
        }
        return rr;
    }
}
