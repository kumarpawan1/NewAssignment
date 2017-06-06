import java.util.StringJoiner;
import java.util.concurrent.atomic.AtomicInteger;

public class Product {
    private static final AtomicInteger idCounter = new AtomicInteger();
    private final String productId;
    private String productName;
    private String productLocation;
    private int productLevel;

    public Product(String name, String location) {
        this.productId = String.valueOf(idCounter.incrementAndGet());
        this.productName = name;
        this.productLocation = location;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductLocation() {
        return productLocation;
    }

    public void setProductLocation(String productLocation) {
        this.productLocation = productLocation;
    }

    public int getProductLevel() {
        return productLevel;
    }

    public void setProductLevel(int productLevel) {
        this.productLevel = productLevel;
    }
}
