import java.util.Scanner;

public class Pass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Your desired password: ");
        String pass = sc.nextLine();
        System.out.println("Please renter your password: ");
        int i = 0;
        String repeatPassword = sc.nextLine();
        do{
            if(repeatPassword.equals(pass)) {
                System.out.println("Correct password");
            break;
            }
            else if (!repeatPassword.equals(pass)&&i!=2){
                i++;
                System.out.println("Incorrect password, You have " + (3 - i) + " tries left");
                repeatPassword = sc.nextLine();
            }
            else {
                System.out.println("You have failed to enter your password. Please try again later");
                break;
            }
        }while (i<3);
    }
}
