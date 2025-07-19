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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void displayinfo(){
        System.out.println(name + " is "+ age + " years old, and his gpa is "+ gpa);
    }
    public void study(){
        if (gpa < 4)
            gpa += 0.1;
        else
            System.out.println("You have maximum gpa");
    }

    public static void main(String[] args) {
        Student Ahmed = new Student("Ahmed",19,3.4);
        Student Marwan = new Student("Marwan",21,2.5);
        Ahmed.getGpa();
        Ahmed.getAge();
        Ahmed.getName();
        Marwan.setAge(28);
        Marwan.setName("Tebry");
        Marwan.setGpa(4);
        Marwan.displayinfo();
        Ahmed.study();
        Ahmed.displayinfo();
        Marwan.study();
        Marwan.displayinfo();
    }
}
