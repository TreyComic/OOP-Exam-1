public class HourlyEmployee extends Employee {
    float hoursWorked;
    double hourlyWage;
    public HourlyEmployee(String name, Size size, double hourlyWage) {
        super(name, size);
        this.hourlyWage = hourlyWage;
    }
    @Override
    void printInfo() {
        System.out.println(name + "is size " + size);
    }
}
