import java.util.Scanner;

public class countsDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a digit to know its number of digits: ");
        int x = sc.nextInt();
        int countsDigits = 0;
        while (x>0) {
            x=x/10;
            countsDigits++;
        }
        System.out.println("Number of digits: "+countsDigits);
    }
}
