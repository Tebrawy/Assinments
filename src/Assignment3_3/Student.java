package Assignment3_3;

public class Student {
    String name;
    int age;
    double gpa;

    public Student(String name, int age , double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    void displayinfo(){
        System.out.println(name + " is "+ age + " years old, and his gpa is "+ gpa);
    }
    void study(){
        gpa+= 0.5;
    }

    public static void main(String[] args) {
        Student Ahmed = new Student("Ahmed",19,3.4);
        Student Marwan = new Student("Marwan",21,2.5);
        Marwan.displayinfo();
        Ahmed.displayinfo();
        Marwan.study();
        Marwan.displayinfo();
    }
}
