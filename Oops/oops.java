// Class Name Start With Capital Letters 
// Function Name Start With Small Letters 
class Pen {
    String color;
    String Type;

    public void Write ()
    {
        System.out.println("Writing Something...");
    }
    public void printColor()
    {
        System.out.println("Color Of Pen is :" + this.color);  // this KeyWord refers to Current Object... 
    }
    
}


public class oops {
    public static void main(String[] args) {
        Pen pen1= new Pen();
        pen1.color = "blue";
        pen1.Type ="Jel";

        Pen pen2 = new Pen();
        pen2.color="Black";
        pen2.Type="BollPoint";
        
        pen1.Write();

        pen1.printColor();
        pen2.printColor();
    }
}

