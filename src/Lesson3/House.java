package Lesson3;

public class House {
    private static int floor;
    private int entrance;

    public House(int entrance, int floor){
        this.entrance = entrance;
        this.floor = floor;
        System.out.println("ConstructorHouse");
    }

    static{
        System.out.println("StaticBlockHouse");
        floor = 10;
    }

    {
        System.out.println("SimpleBlockHouse");
        entrance = 7;
    }

    private void information(){
        System.out.println("подъезд" + entrance + "этаж" + floor);
    }

}

class Flat extends House{
    private static int apartamentNumber;
    private int numberOfResidents;

    static{
        System.out.println("StaticBlockFlat");
        apartamentNumber = 10;
    }

    {
        System.out.println("SimpleBlockFlat");
        numberOfResidents = 3;
    }

    public Flat(int floor, int entrance) {
        super(floor,entrance);
        System.out.println("ConstructorFlat");
    }


    //@Override
    public void information () {
        System.out.println("номер квартиры " + apartamentNumber +
                ", количество жильцов " + numberOfResidents);
    }

}

class Test {
    public static void main(String[] args) {
        House first = new House(4,6);
        Flat second = new Flat(4,8);
        second.information();

    }
}
