# Debugging syntax and logical errors

Sometimes, the code we write has errors

Debugging

- Debugging involves locating and fixing program's errors
- These errors are often called bugs
- In this chapter, we'll look at some debugging strategies

Debugging with Print Statements

- Before we can solve errors, we need to understand what our program is doing
- A print statement is one tool that can often help us locate errors
- We can use print statements to print the value of a given variable and follow the control flow of our code

Syntax Errors

- Syntax errors can cause your program to fail before it is run 
- Your code must be in the right format for a computer to read
- Some common syntax errors area a misspelled variable or missing semicolon

Logical Errors

- Logical errors deal with the logic of a program
- When a program has a logical bug, it doesn't act as the user expects
- To solve these errors, we look for components of the program that aren't as expected, find their respective code, and fix it

# Debugging with an IDE

Print statements can get annoying

IDE: The Ultimate Tool
- An IDE helps us compule and run our Java programs
- An IDE can also help us debug our Java programs
- We've already seen it detect and reveal syntax errors

Breakpoints
- A breakpoint is an international stopping point put into a program for debugging purposes
- With a breakpoint, we can temporarily halt a program in order to inspect its internal state
- Intenal state: Variable values, the result of certain lines of code, whether or not a certain line of code is executed

# Challenge: Find the errors

Finf the Errors

- Your job is to find and fix three errors hidden in a program that calculates the area of a triangle
- The user will input **base** and **height** values
- The program will calculate the area using the formula: area = (base * height) / 2
- Neither the base nor the height should be less than or equal to zero

## Code

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Let's calculate the area of a triangle");

        Scanner input = new Scanner(System.in);

        System.out.println("Please input the base of the triangle (in inches).");
        double base = input.nextDouble();

        while(base <= 0){
            System.out.println("That's invalid. Please input the base of the triangle (in inches).");
            base = input.nextDouble();
        }

        System.out.println("Please input the height of the triangle (in inches).");
        double height = input.nextDouble();
        while(height <= 0){
            System.out.println("That's invalid. Please input the height of the triangle (in inches).");
            height = input.nextDouble();
        }

        double area = (base * height)/2;
        System.out.println("The area is " + area);
    }
}
```
