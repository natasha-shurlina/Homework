package Lesson2;
//задача 1


public class Things {

    int price;

    public Things(int price) {
        this.price = price;
    }
}


class Clothes extends Things {

    String category;

    public Clothes (int price, String category) {
        super(price);
        this.category = category;
    }
}


class Blazer extends Clothes {

    int size = 42;

    public Blazer(int price, String category, int size) {
        super(price, category);
        this.size = size;
    }
}


class Test {

    public static void main(String[] args) {
        Blazer first = new Blazer
                (900, "blazer", 8);
    }
}