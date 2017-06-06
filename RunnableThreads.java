public class RunnableThreads implements Runnable{

    private String pid;
    private InventorySystemImplementation ims;

    RunnableThreads(String pid, InventorySystemImplementation ims){
        this.pid = pid;
        this.ims = ims;
    }

    @Override
    public void run() {
        System.out.println(this.toString() + " Running");
        RestockingResult rr = ims.restockProduct(pid, 10);
        System.out.println(rr.toString());
        System.out.println(this.toString() + " Finishing");
    }
}
