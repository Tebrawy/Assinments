import java.util.Scanner;

public class studentsArray {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int numberOfStudentsPassed = 0;
        System.out.println("Please enter number of students: ");
        int numberOfStudents = sc.nextInt();
        System.out.println("Please enter number of subjects: ");
        int numberOfSubjects = sc.nextInt();
        int[][] grades = new int[numberOfStudents][numberOfSubjects];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Please enter student number "+ (i+1) + " marks");
            for (int j = 0; j< numberOfSubjects; j++){
                int mark = sc.nextInt();
                grades[i][j]= mark;
            }
        }
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Average mark of student "+ (i+1) + " is "+Average(grades[i]));
            highestLowest(grades[i]);
        }
        for(int i = 0; i< grades.length;i++){
            System.out.print("Student #"+(i+1)+" ");
            for (int j =0;j< grades[i].length;j++)
                System.out.print(grades[i][j]+" ");
            System.out.println();
        }
        for (int i = 0; i < grades.length; i++) {
            if (Average(grades[i])>=50)
                numberOfStudentsPassed +=1;
        }
        System.out.println("Number of students who passed = "+ numberOfStudentsPassed);
    }
    public static double Average(int[] marks){
        int sum = 0;
        int avg;
        int numberOfElements = marks.length;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        avg = sum/numberOfElements;
        return avg;
    }
    public static void highestLowest(int[] marks){
        int highest = marks[0];
        int lowest = marks [0];
        for (int i = 1; i < marks.length; i++) {
            if (highest<= marks[i])
                highest = marks[i];
            if (lowest>= marks[i])
                lowest = marks[i];
        }
        System.out.println("Highest grade = " + highest + " and lowest grade = "+ lowest);
    }
}
