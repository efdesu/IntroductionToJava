import java.util.Scanner; //util=package Scanner=class

public class UserInputSamples {
    static void main() {
//Create a Scanner object to read user input
Scanner scanner = new Scanner(System.in);

// Read a text (String) input from the user
System.out.print("Enter Your name: ");
String name = scanner.nextLine();

// Read an integer (whole number) input
System.out.print("Enter Your Age: ");
int age = scanner.nextInt();

// Read a decimal number (double) input
System.out.print("Enter your GPA: ");
double gpa = scanner.nextDouble();

// Read a true/false (boolean) input
System.out.print("Are you a student? (true/false): ");
boolean isStudent = scanner.nextBoolean();

// Print the collected data to the console
System.out.println("Hello, " + name);
System.out.println("Your are " + age + " years old.");
System.out.println("Your GPA is " + gpa);

// Check the condition and print a message based on the result
if(isStudent){
    System.out.println("You are enrolled as a student.");
}
else{
    System.out.println("You are NOT enrolled.");
}

// Output:
// Enter Your name: Elif
// Enter Your Age: 23
// Enter your GPA: 3,2
// Are you a student? (true/false)true

// Hello, Elif
// Your are 23 years old.
// Your GPA is 3.2
// You are enrolled as a student.

// COMMON ISSUES
        /*System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // without this line,
        // output: Enter your age: 23
        // Enter your favorite color: Your age is 23
        // Your favorite color is


        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        System.out.println("Your age is " + age);
        System.out.println("Your favorite color is "+ color);*/

scanner.close(); // Close the scanner to prevent memory/resource leaks

// Output:
// Enter your age: 23
// Enter your favorite color: red
// Your age is 23
// Your favorite color is red


    }

    }


