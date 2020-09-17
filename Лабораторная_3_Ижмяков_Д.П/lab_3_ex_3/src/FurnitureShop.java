public class FurnitureShop {
    private Chair chair;
    private Sofa sofa;

    void BuyFur(Furniture fur) {
        System.out.println("Вы купили " + fur.info());
    }
}
