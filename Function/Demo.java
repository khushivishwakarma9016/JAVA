
// ++++++++++++++++++++++++++++++++++📘 Functions in Java — Theory Notes++++++++++++++++++++++++++



// 1. Definition

// A function (called a method in Java) is a reusable block of code that performs a specific task.

// It can take input (parameters), process logic, and return output (return value).




// 2. Types of Functions

// Predefined (Library Methods): Already available in Java, e.g., Math.sqrt(), System.out.println().

// User‑Defined Methods: Created by programmers to solve custom problems


// 3. Demo:

// returnType functionName(parameters) {
//     // body → logic
//     return value;
// }

// returnType → what the function gives back (int, double, void).
// functionName → identifier for the function.
// parameters → inputs.
// body → logic.
// return → sends result back to caller


// 4. Behind the Scenes (Unique Insights)

// When a function is called, Java creates a stack frame in memory.
// This frame stores parameters and local variables.
// Once the function finishes, the frame is destroyed, but the return value is passed back to the caller.
// Local variables live only inside their frame — that’s why they can’t be accessed outside.
// Java uses pass‑by‑value always:
// For primitives → a copy of the value is passed.
// For objects → a copy of the reference (address) is passed. 
// This means the object’s data can change, but the reference itself cannot be reassigned by the function.


// 5. Advantages

// Reusability: Write once, use many times.
// Readability: Breaks large programs into smaller, understandable parts.
// Debugging: Easier to isolate and fix errors.
// Maintenance: Changes only need to be made in one place.

public class Demo {
    public static void main(String[] args) {
        int result =factorial(5);
        System.out.println("Factoarial of Number 5 Is :" + result);

    }

    static int factorial(int num)
    {
        int mul=1;
        for (int i = 1; i <=num; i++)
        {
             mul = mul * i;
        }
        return mul;
    }
}
