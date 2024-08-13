public class StaticClass {
 static class Test{
    String name;
    public Test(String name){
        this.name = name;
    }
 }
 public static void main(String[] args) {
    Test a = new Test("namra");
    Test b = new Test("Vora");

    System.out.println(a.name);
    System.out.println(b.name);
    
 }
}
