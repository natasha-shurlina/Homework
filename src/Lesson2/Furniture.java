package Lesson2;
// задача 2

public class Furniture {

    private int price;
    private String material;

    public Furniture(int price, String material){
        this.price = price;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Цена за материал '" + this.material + "': " + this.price;
    }

    @Override
    public boolean equals(Object obj) {
        return this.material == ((Furniture) obj).material;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPrice(){
        return material;
    }

    public int getMaterial(){
        return price;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void result(){
        System.out.println("Материал: " + material + ", стоймость мебели: " + price);
    }
}

class Table extends Furniture {

    int weight;
    String colour;

    public Table(int price, String material, int weight, String colour) {
        super(price, material);
        this.weight = weight;
        this.colour = colour;
    }

    @Override
    public void result() {
        System.out.println("Вес стола: " + weight + "кг, цвет: " + colour);
    }
}

class Main {
    public static void main(String[] args) {
        Furniture furniture = new Furniture(6000, "дерево");
        furniture.result();
        System.out.println(furniture.toString());

        Table Child = new Table(3500, "искусственный камень", 5, "белый");
        Table Desktop = new Table(8000, "искусственный камень", 15, "серый");
        System.out.println(Child.equals(Desktop));
        Child.result();
    }
}
