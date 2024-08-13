import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("apple");
        list.add("mango");

        System.out.println(list.contains("apple"));

        list.set(0, "Orange");

        System.out.println(list);

        for(int i = 0; i < 4; i++){
            list.add(sc.nextLine());
        }
        
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }


        int[] arr = {1, 3, 23, 15, 9};
       
        System.out.println("Max value in array: " + maxRange(arr));
    }

    static int maxRange(int[] arr){
        int maxval = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
}