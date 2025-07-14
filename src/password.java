import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = "please";
        int attempts = 1;
        int max_attempts = 3;
        boolean flag = false;
        do {
            System.out.println("Please enter your password: ");
            String check = sc.nextLine();
            if (check.equals(pass)){
                System.out.println("Correct password!");
                flag = true;
            }
            else {
                System.out.println("Incorrect! you have "+ (max_attempts-attempts)+ " tries left");
            }
            attempts++;

        }while (attempts<=max_attempts&&!flag);
        if(!flag)
            System.out.println("You have exceeded your number of attempts");
    }
}
