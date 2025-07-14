import java.util.Scanner;

public class Eligibilty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your age: ");
        int age = sc.nextInt();
        System.out.println("Please insert your nationality: ");
        String nationality = sc.next();
        nationality = nationality.toLowerCase();
        if (age >= 18 && nationality.equals("egyptian")) {
            System.out.println("Eligible to vote");
        }
        else {
            System.out.println("Not eligible");
        }
    }
}
