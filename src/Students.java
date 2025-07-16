import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of students: ");
        int j = sc.nextInt();
        for (int i = j;i>0;i--){
            System.out.println("Please name of student: ");
            String name = sc.next();
            System.out.println("Please enter 3 exam scores: ");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();
            double average = avg(x,y,z);
            char grade = 'F';
            if (average >= 85)
                grade = 'A';
            else if (average >= 70)
                grade = 'B';
            else if (average >= 50)
                grade = 'C';
            else
                grade = 'F';
            System.out.println(name + " has an average of "+ average + " and garde of "+ grade);
        }
    }
    public static double avg(double x, double y, double z){
        return (x+y+z)/3;
    }
}
