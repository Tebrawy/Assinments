import java.util.*;
public class upperCase {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toUpperCase();
        System.out.println("The length of the string is: "+ s.length());
        System.out.println(s.charAt(0));
    }
}
