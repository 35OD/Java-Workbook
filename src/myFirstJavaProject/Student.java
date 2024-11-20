package myFirstJavaProject;

public class Student {

    public String name = "Ms. Jane Doe";
    public String letterGrade = "A";


    public void displayStudent(){
        System.out.println("Hello my name is: " + name);
        System.out.println(name + "'s grade is: " + letterGrade);
    }
    public void calcStudentAvg(){
        System.out.println(("I calculate the average "));
    }

    public int addTwoNumbers(int x, int y){
        int result = x + y;
        return result;
    }

}
