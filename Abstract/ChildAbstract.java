package Abstract;
public class ChildAbstract extends ParentAbstract{

    ChildAbstract(int age){
        super(age);
    }
    void career(String name){
       System.out.println(name+ " is a Developer");
   }
   void partener(String name,int age){
       System.out.println("name: "+name+" age: "+age);
   }
}