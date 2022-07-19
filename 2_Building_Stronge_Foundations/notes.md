# Primitive data types

Data: In computer science, data is information that is stored and processed by a computer

Data types in Java:
- Java classifies different pieces of data with data tupes based on their value
- A data type provides a set of possible values
- If a piece of data is one of a data type's values, it is classified as that data type

Primitive Types in Java:
- Boolean
- Int
- Double
- Char

# Data types and variables in Java

Representing a student in code:
- Student's age
- Student's GPA
- Student's first initial
- Student's last initial
- Whether the student has perfect attendance so far

# Strings in Java

**Reference Types**

String: a sequence of ordered characters (for example, a word or person's name) 

- String value: "speaker"
- String variable: `string myFavoriteWord = "speaker"`
- Order of letters matters: "desserts" does not have the same value as "stressed" because the characters are in a different order

> [!NOTE]
> A string is built out of characters.

## Code

```java
public class Main {

    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.45;
        boolean hasPerfectAttendance = true;
        
        char studentFirstInitial = 'G';
        char studentLastInitial = 'S';
        String studentFirstName = "Gerardo";
        String studentLastName = "Salinas";

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(hasPerfectAttendance);
        System.out.println(studentFirstName);
        System.out.println(studentLastName);
    }
}
```

# Using indexes with strings

- Consider the string "Kayla", 'K' is at index 0, 'a' is at index 1, 'y' is at index 2, 'l' is at index 3, and 'a' is at index 4
- Index: 0 1 2 3 4 
- String: K a y l a

charAt Operation:

- **charAt** is a special string operation that allows us to access a character at a specific locationi within the string
- Input: Index of the wanted character
- Output: The value of the character at the inputted index

## Code

```java
public class Main {

    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.45;
        boolean hasPerfectAttendance = true;

        String studentFirstName = "Gerardo";
        String studentLastName = "Salinas";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(hasPerfectAttendance);
        System.out.println(studentFirstName);
        System.out.println(studentLastName);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
    }
}
```
# Concatenating strings in Java
## Code

```java
public class Main {

    public static void main(String[] args) {

        double studentGPA = 3.45;
        String studentFirstName = "Gerardo";
        String studentLastName = "Salinas";

        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
    }
}
```

# Input and output in Java
- To output to the user, we've used System.out.println()
- We'll create a program that allows the user to input information, affecting output
- For the student program, what if we want to update the student's GPA dynamically?

## Code

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double studentGPA = 3.45;
        String studentFirstName = "Gerardo";
        String studentLastName = "Salinas";

        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
        System.out.println("What do you want to update it to?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGPA);

    }
}
```

- What if the program could automaticallly calculate a student's GPA, given a series of grades?
- Does this scale?
- Does this actually save grades?