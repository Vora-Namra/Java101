public class StringDemo{
    public static void main(String[] args) {
        String s1 = "hello";

        String s3 = new String("hello");
        String s2 = s3;
        System.out.println(s2==s3);

        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
    }
}

// in this = will compare the reference of string object
//  in this equals() will compare the content of string object

//new keyword will create string in heap memory
