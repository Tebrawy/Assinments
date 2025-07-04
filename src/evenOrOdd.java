import java.util.*;
public class evenOrOdd {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x%2==0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
}
