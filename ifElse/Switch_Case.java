
public class Switch_Case {

    public static void main(String[] args) {

//  Question 1: The Missing Break (Fall-Through Trap)
// Write a Java program that takes an integer day (1 to 7). Use a switch statement 
// to print whether it's a "Weekday" (1-5) or "Weekend" (6-7).
// Constraint: You are allowed to use exactly two System.out.println() statements 
// and exactly one break statement in the entire switch block.
        int day = 7;

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println(".(This is WeekDay)");
                break;

            case 6:
            case 7:
                System.out.println(".(This is WeakEnd)");
        }

// Question 2: Calculator using Char Input
// Create a basic calculator using switch. Take two integers a and b, 
// and a character operator (+, -, *, /, %).
// Challenge: If the user enters / or % and b is 0, the program must print an error message instead of throwing an Exception, 
// and then exit the switch block gracefully
// ---------------------------------- Explanation --------------------------------------
// Is problem ko samajhne ke liye 3 main parts me break karte hain:
// 1. Basic Requirement (Karna kya hai?)
// Aapke paas teen inputs honge:Do numbers (e.g., int a = 10;, int b = 2;)Ek operation sign (e.g., char op = '/';)
// Aapko switch(op) lagana hai
// :case '+': $\rightarrow$ $a + b$ print kare
// case '-': $\rightarrow$ $a - b$ print kare
// case '*': $\rightarrow$ $a * b$ print kare
// case '/': $\rightarrow$ $a / b$ print kare
// case '%': $\rightarrow$ $a \% b$ print kare
// 2. Main Problem / Trap (Challenge kya hai?)Normal math me agar aap $10 / 0$ ya $10 \% 0$ karti hain, 
// to Java me turant ArithmeticException: / by zero aakar program crash ho jata hai.
// Question ye keh raha hai ki program crash nahi hona chahiye.3. Solution ka Logic (Sochna kaise hai?)
// Jab user case '/': ya case '%': me pahuche, to direct divide karne se pehle ek chota sa if-else check lagaiye:
// Check: Kya b == 0 hai?Agar haan: To error message print kar dijiye (e.g., "Cannot divide by zero!").
// Agar nahi: Tab aaram se result (a / b ya a % b) calculate karke print kijiye.Uske baad apna normal break; laga dijiye taaki program 
// switch se bina kisi error ke bahar nikal jaye.
        int a = 10;
        int b = 0;
        char operator = '/';

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                if (b == 0) {
                    System.out.println("Numbers is Not devide by 0");
                    break;
                }
                System.out.println(a / b);
                break;

            case '%':
                if (b == 0) {
                    System.out.println("Error: Cannot take modulus by 0");
                    break;
                }
                System.out.println(a / b);
                break;

            default:
                System.err.println("Invalid operator...");

        }

// Question 3: Vowel Checker with Enhanced Switch (Yield)
// (Note: Use Java 14+ Enhanced Switch -> syntax)
// Write a program that takes a String representing a single alphabet character. 
// Use an enhanced switch expression (not a statement) that returns a boolean.
// It should return true if the character is a vowel (A, E, I, O, U in both upper and lowercase)
//  and false otherwise. 
// Store the returned boolean in a variable and print it.
        char ch = 'x';
        boolean isVowel;

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                isVowel = true;
                break;

            default:
                isVowel = false;
        }

        System.out.println(isVowel);
    }

}
