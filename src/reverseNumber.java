import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be reversed: ");
        int x = sc.nextInt();
        String reverse = "";
        while(x>0){
            reverse = reverse+x%10;
            x=x/10;
        }
        System.out.println("The reversed output: "+ reverse);
    }
}
