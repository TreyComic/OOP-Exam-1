public class Manager extends Employee{
    final double extraDiscount = 5;
    double salary;
    public Manager(String name, Size size) {
        super(name, size);
    }
    @Override
    void printInfo() {
        System.out.println(name + "is size " + size);
    }
    @Override
    public Cloth printPriceAfterDiscount(double price){
        System.out.println((price /100 ) * (discount + extraDiscount));
        return null;
    }
}
