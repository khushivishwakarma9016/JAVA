public class ifElse {
    public static void main(String[] args) {


    // 1️⃣ Grade Calculator
    // Q1. Write a Java program that takes marks (0–100) as input and 
    // prints grade according to the following rules

    // Marks ≥ 90 → Grade A
    // Marks ≥ 75 → Grade B
    // Marks ≥ 60 → Grade C
    // Marks ≥ 40 → Grade D
    // Marks < 40 → Fail
    // 👉 Example Input: marks=82 → Output: Grade B

        int marks = 82;

        if (marks >=90)
        {
            System.out.println("Grade A");
        }
        else if(marks>=60)
        {
            System.out.println( "Grade B");
        }
         else if(marks>=40)
        {
            System.out.println( "Grade C");
        }
         else if(marks<40)
        {
            System.out.println( "Grade D");
        }
        else{
            System.out.println ("Fail");
        }










    }
}
