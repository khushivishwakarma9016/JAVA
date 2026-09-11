
class Student{
    String StudentName;
    int Age;

    public void PrintInfo()
    {
        System.out.println("StudentName Is : " + this.StudentName);
        System.out.println("StudentAge Is : " + this.Age);
    }

    public void getMarks(int marks1 , int marks2)
    {
        
        System.out.println("Marks Are :" + marks1  + " " + " " +   marks2);
    }
}
public class Practice {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.StudentName="khushi";
        s1.Age=22;

        s1.PrintInfo();
        s1.getMarks(50, 45);
    }
}
