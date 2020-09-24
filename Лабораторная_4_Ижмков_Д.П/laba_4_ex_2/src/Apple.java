public class Apple extends Store implements Priceable {

    Apple(int price,int count) {
        this.price = price;
        this.count = count;
    }


    public int getPrice() {
        return count*price;
    }

}
