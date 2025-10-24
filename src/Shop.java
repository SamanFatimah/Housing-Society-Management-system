public class Shop {
    String ID;
    PlotType type;
    double price;

    // Constructor
    public Shop(String ID) {
        this.ID = ID;
        this.type = PlotType.COMM_SHOP;        // specific type
        this.price = PlotType.COMM_SHOP.price; // access price from enum
    }

    // Display shop details
    @Override
    public String toString() {
        return String.format(
            "ID: %s, Type: %s, Price: %.2f %s",
            ID, type.name(), price, type.currency
        );
    }
}
