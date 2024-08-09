public class ClassObj{
    public static void main(String[] args) {
        Car ferrari = new Car("Ferrari", 100000000, "yellow");
        ferrari.display();
        
    }
}
class Car{
    String name;
    int price;
    String color;
    Car(String name, int price, String color){
        this.name = name;
        this.price = price;
        this.color = color;
    }
    void display(){
        System.out.println(" Name: " + name + "\n Price: " + price + "\n Color: " + color);
    }
}