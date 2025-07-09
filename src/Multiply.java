import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get its multiples: ");
        int x = sc.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i + " x "+x+" ="+(x*i));
        }
    }
}
