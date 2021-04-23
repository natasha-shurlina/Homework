package Lesson3;

public abstract class Class1 {

    private int number;
    private int count;

    public Class1(int number, int count) {
    }

    public int getNumber() {
        return number;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void result (){
        System.out.println(number + count);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public abstract void abstractMethod();
}

class Class2 extends Class1{
    private String name;
    private int age;

    public Class2 (int number, int count, String name, int age){
        super(number, count);
        this.age = age;
        this.name = name;
    }

    @Override
    public void abstractMethod(){
        System.out.println("возраст " + age + ", имя " + name);
    }

    @Override
    public void result (){
        System.out.println("имя " + name + ", возраст " + age);
    }

}

class Main {
    public static void main(String[] args) {
        Class2 class2 = new Class2(3, 5, "Роман", 4);
        class2.abstractMethod();
        class2.result();
    }
}