package question5;

public class Goods {
    public Goods(String name, int price) {
        this.name = name;
        this.price = price;
    }

    private String name = null;
    private int price = 0;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
