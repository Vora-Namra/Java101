public class StaticDemo {
    public static void main(String[] args) {
       // greeting(); can't access non-static method from static context
       hello(); // can access static method from static context
    }           //static means we can access any static method without creating object of class
    public void greeting(){
        System.out.println("Hello");
    }
    static void hello(){
        System.out.println("hii there");
    }
}
