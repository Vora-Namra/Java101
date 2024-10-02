public class StringDemo{
    public static void main(String[] args) {
        String s1 = "hello";

        String s3 = new String("hello");
        String s2 = s3;
        System.out.println(s2==s3);

        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));

        //character at index 
        System.out.println(s2.charAt(0));


        //concat
        s2 = s2.concat(" hii");
        System.out.println(s2);

        //substring
        System.out.println(s2.substring(0, 4));

        //last index
        System.out.println(s2.lastIndexOf('l'));

        //start with
        System.out.println(s2.startsWith("he"));

        //contains
        System.out.println(s2.contains("hii"));
    }
}

// in this = will compare the reference of string object
//  in this equals() will compare the content of string object

//new keyword will create string in heap memory
