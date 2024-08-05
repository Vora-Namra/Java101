import java.util.Scanner;

public class ScanCalc {
public int operation(int num1,int num2 ,String operation) {
        if(operation.equals("+")) {
            return num1 + num2;
        } else if(operation.equals("-")) {
            return num1 - num2;
        } else if(operation.equals("*")) {
            return num1 * num2;
        } else if(operation.equals("/")) {
            return num1 / num2;
        } else {
            return 0;
        }

}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter operation as +, -, *, /: ");
        String operation = sc.next ();
        ScanCalc obj = new ScanCalc();  
        System.out.println("Result: " + obj.operation(num1, num2, operation));
    }
}