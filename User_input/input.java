
import java.util.Scanner;

public class input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String name = sc.nextLine();

        System.out.println("Username is: " + name);

// Write a program that:
// Asks the user to enter name, marks in 3 subjects (Math, Science, English).
// Calculates the average marks.
        // input :
        System.out.println("Enter Student Name");
        String StudentName = sc.nextLine();
        System.out.println("Student_Name :" + StudentName);

        System.out.println("Enter Your Marks ");
        int Subject_One = sc.nextInt();
        System.out.println("Enter Your Marks In Maths :" + Subject_One);

        System.out.println("Enter Your Marks ");
        int Subject_two = sc.nextInt();
        System.out.println("Enter Your Marks In English :" + Subject_two);

        System.out.println("Enter Your Marks ");
        int Subject_three = sc.nextInt();
        System.out.println("Enter Your Marks In Science :" + Subject_three);

        // output :
        System.out.println("Student :" + StudentName);

        double average = (Subject_One + Subject_two + Subject_three) / 3.0;
        System.out.println("Average " + average);

        System.out.println("\n--- Report Card ---");
        System.out.println("Student: " + StudentName);
        System.out.println("Average: " + average);

        if (average >= 70) {
            System.out.println("Distinction");
        } else if (average >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

    }

}

// System class --> printstrem out (Object) ---> println() method :
// Scnner is slower then buffredreader it means bufferReader is Fast and Scnner is slow .
// stream --> flow of data 
// we have two type of stream  (class (both strem are classes ))
// --> 1. input stream (data flow in to the program )
// --> 2. output stream (data flow out of the program)
// scnner works on Tokenization :
// method of Scnner :
// --> nextInt() → reads an integer (whole number).
// --> nextFloat() → reads a float (decimal number).
// --> nextDouble() → reads a double (large decimal number).
// --> nextLine() → reads a full line (string with spaces).
// --> next() → reads a single word (string without spaces).
// --> nextBoolean() → reads a boolean value (true or false).
// --> nextLong() → reads a long integer.
// --> nextShort() → reads a short integer.
// --> nextByte() → reads a byte value.
//  *  Old Java (before Scanner) → Input was taken using BufferedReader or DataInputStream.
//     Example: BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     It was more complex: needed exception handling (IOException) and manual type conversion (string → int, etc.).
// *  New Java (after Java 5) → Scanner class was introduced.
//    Much simpler: directly reads different data types (nextInt(), nextLine(), etc.).
//    No need for manual parsing or complex exception handling.
//    More user‑friendly and widely used in modern Java programs.
