public class Hello {
    public static void main(String[] args){
        System.out.println("Hellow World From Java ");
    }
}

/*

------------------------ now lets talk about the theroy concept -----------------------

Question :


* What is java :

JAVA IS THE HIGH LEVEL LANGUAGE AND ALSO STATIC TYPED LANGUAGE.
Java's most famous design principle is:

"Write Once, Run Anywhere" (WORA)







Question :


* why we need The java :

1. FOR THE SECURITY
2. FOR THE PORTABLE
3. FOR THE SIMPLICITY THERE IS NOT MULTIPLE INHERITANC ETC....



As We Know That Jvm is platform dependent but our byte code is the Independent 

So.......

OUR JAVA PROGRAM IS FIRST CONVERT BY THE COMPILER OR INTERPRETER INTO THE BYTE CODE 
THEN OUR INDEPENDENT BYTECODE IS CONVERT INTO THE MAACHINE CODE USING THE JIT COMPLIER IN THE JVM JAVA VIRTUAL MACHINE 
AND THIS IS CONSIST IN THE OWN DEVICE OR YOU CAN SAY THAT PLATFORM 



* Now Question What is tha platfrom :

........

IN THE BEHALF OF JAVA PLATFORM IS THE COMBINATION OF 
OS WHICH IS OPERATING SYSTEM(MAC , LINUX , WINDOWS)+ PROCESSER (INTEL ,ARM ,AMD RYZEN)




------------------------------------------The Core Hierarchy--------------------------------------


+-------------------------------------------------------------+
| JDK (Java Development Kit)                                  |
|  [Development Tools: javac, jdb, jar, javadoc, etc.]        |
|                                                             |
|  +-------------------------------------------------------+  |
|  | JRE (Java Runtime Environment)                        |  |
|  |  [Class Libraries / rt.jar + Supporting Files]        |  |
|  |                                                       |  |
|  |  +-------------------------------------------------+  |  |
|  |  | JVM (Java Virtual Machine)                      |  |  |
|  |  |  * ClassLoader                                  |  |  |
|  |  |  * Memory Areas (Heap, Stack, Method, etc.)     |  |  |
|  |  |  * Execution Engine (Interpreter + JIT Compiler)|  |  |
|  |  |  * Garbage Collector                            |  |  |
|  |  +-------------------------------------------------+  |  |
|  +-------------------------------------------------------+  |
+-------------------------------------------------------------+






---------------------------------JDK vs JRE vs JVM Comparison------------------------

1. JVM (Java Virtual Machine)
- Full Form: Java Virtual Machine
- Kya karta hai: Bytecode ko machine code me convert karke run karta hai. 
  Memory management aur Garbage Collection handle karta hai.
- Kiske liye: Execution ke liye (Engine)



2. JRE (Java Runtime Environment)
- Full Form: Java Runtime Environment
- Kya karta hai: Isme JVM + Core Class Libraries hoti hain. 
  Ye Java program run karne ke liye environment deta hai.
- Kiske liye: Sirf program Run/Use karne wale users ke liye



3. JDK (Java Development Kit)
- Full Form: Java Development Kit
- Kya karta hai: Isme JRE + Development Tools (javac, debugger) hote hain.
- Kiske liye: Program Likhe aur Compile karne wale developers ke liye


*/
