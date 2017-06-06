public class PickingResult {
    private boolean isSuccess;
    private int levelBefore, levelAfter;
    private String errorMsg;
    private String productId;
    private String productName;

    public PickingResult(String productId, String productName, boolean isSuccess, int levelBefore, int levelAfter, String errorMsg) {
        this.productId = productId;
        this.isSuccess = isSuccess;
        this.levelBefore = levelBefore;
        this.levelAfter = levelAfter;
        this.errorMsg = errorMsg;
        this.productName = productName;
    }

    public String toString() {
        if(isSuccess)
            return productName + " picked: Level Before: " + levelBefore + " Level After: " + levelAfter;
        else
            return "Error while picking " + productName + ": " + errorMsg;
    }
}
