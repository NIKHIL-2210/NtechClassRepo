#Application.java file
#HDFC Application
public class SimpleMethodExample {

    // Method that takes two integers and returns their sum
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        // Calling the method and storing the result
        int result = addNumbers(5, 7);

        // Printing the result
        System.out.println("The sum is: " + result);
    }

#Feature202 changes by Ethan for Reports Module
 public static double calculateRectangleArea(double length, double width) {
        double area = length * width;
        return area;
    }

    public static void main(String[] args) {
        // Example of using the method
        double length = 5.0;
        double width = 3.0;

        // Calling the method
        double result = calculateRectangleArea(length, width);

        // Displaying the result
        System.out.println("The area of the rectangle with length " + length + " and width " + width + " is: " + result);
    }
}
#Close the methods for Feature202
=======
#Feature201 Changes by Vivek for the Service Module in HDFC Project in Oct 2023
public class MyClass {

    // Public field
    public int publicField = 10;

    // Public method
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating an object of MyClass
        MyClass myObject = new MyClass();

        // Accessing the public field
        System.out.println("Public Field: " + myObject.publicField);

        // Calling the public method
        myObject.publicMethod();
    }
}
#Close the Method for Feature201