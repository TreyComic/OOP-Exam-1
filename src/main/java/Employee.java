public class Employee extends Customer implements Payable {
    final double discount = 10;
    public Employee(String name, Size size) {
        super(name, size);
    }
    public double calculatePay(){
        return Double.parseDouble(null);
    }
    @Override
    void printInfo() {
        System.out.println(name + "is size " + size);
    }

    @Override
    public Cloth printPriceAfterDiscount(double price){
        System.out.println((price /100 ) * discount);
        return null;
    }

}
