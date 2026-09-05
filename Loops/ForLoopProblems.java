// Problem 1: Divide by 2 Series
// Question: Write a loop that starts with i = 128 and keeps dividing i by 2 until it becomes 1.
// Print the series and count how many times the loop runs.

public class ForLoopProblems {
    public static void main(String[] args) {
        
        // -------------------------------
        // Problem 1: Divide by 2 series
        // -------------------------------
        int count = 0;
        for (int i = 128; i >= 1; i = i / 2) {
            System.out.println(i);
            count++;
        }
        System.out.println("How Many Times Loops Executed: " + count);




        // -------------------------------
        // Problem 2: Alternating Sign Series
        // Question: User gives a number N. Calculate the alternating sum:
        // S = 1 - 2 + 3 - 4 + 5 - 6 ... ± N
        // Example: N = 5 → Result = 3
        // -------------------------------





        int n = 5;   // Example input
        int add = 0; // odd numbers sum
        int sub = 0; // even numbers sum

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sub = sub + i;   // even → subtract later
            } else {
                add = add + i;   // odd → add
            }
        }

        int result = add - sub;  // odd sum - even sum
        System.out.println("Alternating Series Result = " + result);
    }


    // Practice Question (1 line)
    // Question: Write a loop with two variables x = 2 and y = 20 
    // where x increases by 3 and y decreases by 5 until x < y.
    // Print the values of x and y.






    // 2. Inverted Triangle

    // * * * * *
    // * * * *
    // * * *
    // * *
    // *


    
    

}
