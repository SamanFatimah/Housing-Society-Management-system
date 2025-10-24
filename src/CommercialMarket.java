public class CommercialMarket {
    Shop[] shops = new Shop[15]; // logical size 12–20 shops

    // Constructor
    public CommercialMarket() {
        // Materialize the array
        for (int i = 0; i < shops.length; i++) {
            String ID = String.format("S-%03d", i + 1);
            shops[i] = new Shop(ID);
        }
    }

    // Display all shops
    public void displayMarket() {
        System.out.println("Commercial Market Shops:");
        for (int i = 0; i < shops.length; i++) {
            System.out.println(shops[i]);
        }
    }
}
