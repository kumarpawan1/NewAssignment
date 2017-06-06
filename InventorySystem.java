public class InventorySystem {
    public static void main(String args[]) {
        InventorySystemImplementation ims = new InventorySystemImplementation();
        Product p1 = new Product("Mouse", "First Shelf");
        p1.setProductLevel(100);
        Product p2 = new Product("Keyboard", "Second Shelf");
        p2.setProductLevel(50);
        Product p3 = new Product("Bottle", "Third Shelf");
        p3.setProductLevel(200);

        ims.addProduct(p1);
        ims.addProduct(p2);
        ims.addProduct(p3);

        PickingResult pr = ims.pickProduct(p1.getProductId(), 50);
        System.out.println(pr.toString());

        RestockingResult rr = ims.restockProduct(p2.getProductId(), 50);
        System.out.println(rr.toString());

//        RunnableThreads rt1 = new RunnableThreads(p1.getProductId(), ims);
//        RunnableThreads rt2 = new RunnableThreads(p1.getProductId(), ims);
//
//        Thread t1 = new Thread(rt1);
//        Thread t2 = new Thread(rt2);
//
//        t1.start();
//        t2.start();
//
//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException e){
//            e.printStackTrace();
//        }
//
//        System.out.println("From Main Thread : " + p1.getProductLevel());

    }
}
