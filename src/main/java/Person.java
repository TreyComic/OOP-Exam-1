public abstract class Person {
    protected String name;
    Size size;

    public Person(String name){
        this.name = name;
    }

    abstract void printInfo();
}
