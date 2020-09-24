public class Banana extends Store implements Priceable{

    Banana(int price,int count) {
        this.price = price;
        this.count = count;
    }


    public int getPrice() {
        return count*price;
    }
}
