import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int x = sc.nextInt();
        if (x%2==0)
            System.out.println(x + " is an even number");
        else
            System.out.println(x + " is an odd number");
    }
}
