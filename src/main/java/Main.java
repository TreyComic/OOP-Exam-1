public class Main {
    public static void main(String[] args) {
        Size small = Size.S;
        Size medium = Size.M;
        Size large = Size.L;
        Size extraLarge = Size.XL;

        //Q1
        Cloth[] arrayStorage;
        arrayStorage = new Cloth[3];
        arrayStorage[0] = new Cloth("jeans", 19.99, small);
        arrayStorage[1] = new Cloth("socks", 10.99, large);
        arrayStorage[2] = new Cloth("slacks", 24.99, medium);
        for(int i = 0; i < arrayStorage.length; i++){
            System.out.println(arrayStorage[i]);
        }

        //Q2

        //Q3a
        Student mark = new Student("Mark", small);
        Student ken = new Student("Ken", extraLarge);

        //3b
        mark.printUniqueStudentID();
        ken.printUniqueStudentID();
        mark.printUniqueStudentID();

        //Q4
        ken.printInfo();

        //Q5


        //Q6
        Manager nikolai = new Manager("Nikolai", large);
        HourlyEmployee stephano = new HourlyEmployee("Stephano", medium, 10);
        Business McDonalds = new Business("6 piece inc.", 23, 19.99);

        //Q7a
        Customer[] customers = new Customer[3];
        customers[0] = new Customer("Mikaila", large);
        customers[1] = new Customer("Alvaro", large);
        customers[2] = new Customer("Cesar", large);

        //Q7b
        Cloth Mikaila = customers[0].printPriceAfterDiscount(23.33);//ff
        Cloth Alvaro = customers[0].printPriceAfterDiscount(2.05);
        Cloth Cesar = customers[0].printPriceAfterDiscount(12.97);
        //Q8a
        Business SlimJim = new Business("Slim Jims", 532, -100);

        //Q8b

        //Q9a


        //Q9b


        //Q10a
        HourlyEmployee managerToEmployee = new HourlyEmployee("Cecilia", medium, 9.0);

        //Q10b
        System.out.println(managerToEmployee.hourlyWage);
    }
}
