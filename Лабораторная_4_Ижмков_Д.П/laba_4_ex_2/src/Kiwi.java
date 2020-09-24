public class Kiwi extends Store implements Priceable{

    Kiwi(int price,int count) {
        this.price = price;
        this.count = count;
    }


    public int getPrice() {
        return count*price;
    }
}
