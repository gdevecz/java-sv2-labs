package classstructureconstructors;

public class Store {

    private String product;
    private int stock;

    public Store(String product) {
        this.product = product;
        this.stock = 0;
    }

    public void store(int add){
        this.stock += add;
    }

    public void dispatch(int substract){
        this.stock -= substract;
    }

    @Override
    public String toString() {
        return "product: " + product + "\nstock: " + stock;
    }
}
