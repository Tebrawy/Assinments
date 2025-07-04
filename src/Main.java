import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println("The addition of these numbers: "+(x+y));
        System.out.println("The subtraction of these numbers: "+(x-y));
        System.out.println("The multiplication of these numbers: "+(x*y));
        System.out.println("The division of these numbers: "+(x/y));
    }
}