public class Customer extends Person {
    Cloth[] clothingItems;
    double discount;

    public Customer(String name, Size size) {
        super(name);
    }

    @Override
    void printInfo() {
        System.out.println(name + " is size " + size);
    }

    public Cloth printPriceAfterDiscount(double price){
        double total = price;
        System.out.println(total);
        return null;
    }
}
