package inheritanceattributes.book;

public class ShippedBook extends Book {

    private int shippingCost;

    public ShippedBook(String title, int price, int shippingCost) {
        super(title, price);
        this.shippingCost = shippingCost;
    }

    public int order(int pieces) { // kiszámolja a darabszám ismeretében a teljes árat, postaköltséggel együtt
        return purchase(pieces) + shippingCost;
    }

    public String toString() { // Egy ehhez hasonló szöveget ad vissza: "Gyűrűk ura: 3000 Ft, postaköltség: 1200 Ft"
        return getTitle() + ": " + purchase(1) + " Ft, postaköltség: " + shippingCost + " Ft";
    }
}
