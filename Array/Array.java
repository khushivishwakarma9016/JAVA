// list of items of the same Data type (Homogeneus)
// syntax
// Type [] Array_name = new Type [Size]
// Type Araay_name [] = {value}
// int [] marks = new int[3]

public class Array {

    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 80;
        marks[1] = 80;
        marks[2] = 70;

        //    System.out.println("marks :"+ marks[0]);
        //    System.out.println("marks :"+ marks[1]);
        //    System.out.println("marks :"+ marks[2]);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        int age[] = {10, 20, 30};
        for (int i = 1; i < 3; i++) {
            System.out.println("Age" + age[i]);
        }

        int num[]=new int[3];
        System.out.println(num[0]);




// ++++++++++++++++++++++++++++ 2D Array +++++++++++++++++++++++++++++

// Declaration :
// Type ArrayName [] = new Type [rows][columns]

    }

}



// notes :


// 🔹 Definition :

// Array = Homogeneous data structure (same type के multiple values store करता है)।

// Continuous memory block में store होता है।

// Index हमेशा 0 से शुरू होता है।



// Acess Formula :

// Array Name = base Address + i. Size of the Data type 



// 🔹 Unique Facts :

// Array name behaves like a constant pointer.

// Arrays are cache‑friendly (fast sequential access)।

// 2D array internally भी 1D की तरह store होता है।

// Function में pass करने पर array pointer में decay हो जाता है।