package Abstract;
public abstract class ParentAbstract {
    int age;
    ParentAbstract(int age){
        this.age = age;
        System.out.println(age);
    }

    abstract void  career(String name);
    abstract void partener(String name , int age);
}

