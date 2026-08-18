

// ---------------------------------------Data Types in Java-------------------------------------


// Java is a statically-typed language, meaning all variable types must be declared before use.

// Data Types :

    
        // Primitive (8 Types)    Non-Primitive (Reference)
        // ├── byte               ├── String
        // ├── short              ├── Arrays
        // ├── int                ├── Classes
        // ├── long               └── Interfaces
        // ├── float
        // ├── double
        // ├── char
        // └── boolean


// --------------------- primitive ------------------------

// | Data Type |           Size | Default Value | Example                          | Description                          |
// | --------- | -------------: | ------------- | -------------------------------- | ------------------------------------ |
// | `byte`    |         1 byte | 0             | `byte age = 22;`                 | Stores small whole numbers           |
// | `short`   |        2 bytes | 0             | `short num = 1000;`              | Stores small-to-medium whole numbers |
// | `int`     |        4 bytes | 0             | `int salary = 50000;`            | Stores whole numbers                 |
// | `long`    |        8 bytes | 0L            | `long population = 1000000000L;` | Stores large whole numbers           |
// | `float`   |        4 bytes | 0.0f          | `float price = 99.5f;`           | Stores decimal numbers               |
// | `double`  |        8 bytes | 0.0d          | `double pi = 3.14159;`           | Stores more precise decimal numbers  |
// | `char`    |        2 bytes | `'\u0000'`    | `char grade = 'A';`              | Stores a single character            |
// | `boolean` | JVM-dependent* | `false`       | `boolean isJava = true;`         | Stores `true` or `false`             |


// ------------------- Non-Primitive -------------------

// | Data Type   | Example                        | Description                                   |
// | ----------- | ------------------------------ | --------------------------------------------- |
// | `String`    | `String name = "Khushi";`      | Stores a sequence of characters/text          |
// | `Array`     | `int[] numbers = {1, 2, 3};`   | Stores multiple values of the same type       |
// | `Class`     | `Student s = new Student();`   | Blueprint for creating objects                |
// | `Object`    | `Object obj = new Student();`  | Represents an instance of a class             |
// | `Interface` | `interface Animal { }`         | Defines a contract that classes can implement |
// | `Enum`      | `enum Day { MONDAY, TUESDAY }` | Represents a fixed set of constants           |







// ------------------------------  Type Casting in Java  -------------------------------------------


// | Term                | Simple Meaning                                                                      |
// | ------------------- | ----------------------------------------------------------------------------------- |

 
// **Type Conversion**   | Changing one data type into another.                                                

// | **Widening**        | Moving from a smaller-capacity type to a larger-capacity type.                      |
// | **Narrowing**       | Moving from a larger-capacity type to a smaller-capacity type.                      |
// | **Truncation**      | Removing a portion of a value during conversion.                                    |


public class dataType{
    public static void main(String[] args) {

        // Create an int variable and convert it into double. Print the result. 

        int num= 3;
        double converted = num;
        System.out.println(converted);


        // Create a double variable and convert it into int. 
        // Observe what happens to the decimal part


        double price = 5.2 ;
        int newprice = (int)price ;
        System.out.println(newprice);
        System.out.println(price);


    }
}