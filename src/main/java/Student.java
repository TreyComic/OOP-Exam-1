public class Student extends Customer{
    public static long studentID;
    public long id;
    final double discount = 5;
    public Student(String name, Size size) {
        super(name, size);
        studentID++;
        id = studentID;
        this.size = size;
    }
    public void printUniqueStudentID(){
        System.out.println(name + "s StudentID is " + id);
    }
    @Override
    void printInfo() {
        System.out.println(name + " is size " + size);
    }
    @Override
    public Cloth printPriceAfterDiscount(double price){
        System.out.println((price /100 ) * discount);
        return null;
    }
}
