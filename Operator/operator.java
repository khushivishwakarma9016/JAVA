public class operator {
    public static void main(String[] args) {
        

// Arithmetic Operators
// Q1. Write a Java program to take two integers and print 
// their sum, difference, product, quotient, and remainder.

// Example Input: a=15, b=4 → Output: Sum=19, Difference=11, Product=60, Quotient=3, Remainder=3
    

int a =15;
int b=4;
int sum = a + b ;
int Difference = a - b;
int product = a * b;
int quotient = a/b;
int remainder = a % b;


        System.err.println("+ : " + sum);
        System.err.println("- : " + Difference);
        System.err.println("* : " + product);
        System.err.println("/ : " + quotient);
        System.err.println("% : " + remainder);




// Relational Operators
// Q2. Write a program that checks if a given number is greater than 100 or not.
// 👉 Input: num=120 → Output: true


int num =120 ;
if (num > 100)
{
        System.err.println("Number Is Greter Than 100");
}
else 
{
        System.err.println("Number Is less Than 100");
}




// Logical Operators
// Q3. Suppose age=20 and citizen=true. Write a program to check if the person is eligible to vote (age ≥ 18 AND citizen = true).
// 👉 Output: Eligible to vote: true


int age = 20 ;
boolean citizin = true ;

if (age >=18 || citizin)
{
        System.out.println(".(Eligible To Vote : True )");
}
else {
        System.out.println(".(Oops ! you are Child )");
}



// Assignment Operators
// Q4. Write a program where x=10. Use +=, -=, *=, /= operators step by step and 
// print the result after each operation.
// 👉 Output: x=15, x=12, x=24, x=6


int x = 10 ;

 x= x + 5;     //    x+=5
 x= x-3;       //    x-=3
 x=x*2 ;       //    x*=2
 x=x/4;        //    x/=4

        System.out.println("Assignment operator  :" + x);







// Unary Operators
// Q5. Write a program to demonstrate difference between pre‑increment and post‑increment.
// 👉 Example:



int K = 10;
++K;
System.out.println("Unary Operator Pre :" + K);
K++;
System.out.println("Unary Operator Post :" + K);






// Ternary Operator
// Q6. Write a program to check whether a number is even or odd using ternary operator.
// 👉 Input: num=7 → Output: Odd


int Number = 2;

String Result = (Number % 2 == 0 ) ? "Number Is Even" : "Number Is Odd" ;

System.out.println(Result);









    }
}



// ---------------------------------------------- Theroy --------------------------------------

// JAVA OPERATOERS 

// Question :

// 1.Arithmetic operator :
// (Use for the basic operation :)

//     -> + (Addition)
//     -> - (Substarction)
//     -> * (Multiplication)
//     -> % (Module)
//     -> / (Division)
    

// 2. Relation operator :
// (use for the comparing the two value :)

        // -> == (Equel To)
        // -> != (Not Equel To)
        // -> > (Greater Than)
        // -> < (Less Than)
        // -> >= (Greater Than Equel To)
        // -> > (Less Than Equel TO)
    
// 3. Logical Operators :
// it works on boolean expression :

        // -> && (AND)
        // -> || (OR) 
        // -> ! (NOT) 

// 4. Assignment Operators :
// (To assign value or update the existing value :)

        //  ->   = (Assign)
        //  ->   +=  (Add and assign)
        //  ->   -= (Subtract and assign)
        //  ->   *= (Multiply and assign)
        //  ->   /= (Divide and assign)



// 5.Unary Operators :
// (Works on the single operand basic use incremint , decremnet )

        // -> ++(Increment)
        // -> --(Decrement)
        // -> + (Positive)
        // -> - (negative)


// 6.Bitwise Operators (बिट स्तर) :
// Definition: ये binary (bit‑level) operations करते हैं और values को bit‑by‑bit manipulate करते हैं।

        //  -> & (AND)
        //  -> | (OR)
        //  -> ^ (XOR)
        //  -> ~ (NOT)
        //  -> << (Left shift)
        //  ->  >> (Right shift)




// 7.Ternary Operator :
//  Definition: ये एक shorthand conditional operator है जो condition के आधार पर दो values में से एक चुनता है।\

        // Syntax: condition ? value1 : value2  




        