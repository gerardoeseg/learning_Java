# Mapping out program control flow

|We Know How To...  |We'll Learn How To         |
|-------------------|---------------------------|
|Represent data     |Add decision-making logic  |
|Create variables   |User conditions            |
|Output to the user |                           |
|Access user input  |                           |
|Run Java programs  |                           |
|Create variables   |                           |

Control Flow
- A program's control flow is the order in which the program's instructions or code statements are executed
- All of the programs we've looked so far execute one statement after another, sequentially
- Here is where explanations or definitions can go; try and keep each built two or three lines max

Manipulating Control Flow
- We can manipulate which line of code is executed with special control flow statements and conditions
- A line of code might never be executed, be executed once, or multiple times
- The conditions determine how many times a given line of code is executed

The Fortune Teller Program
- Let's map out the control flow of virtual fortune teller program
- With the fortune teller, the user will pick a number
- Depending on the number picked, the user receives fortune

[*Diagram*](images/diagram01.PNG)

What Do We Know?
- We know how to output data
- We know how to access user input and save it in a variable
- We do not know how to implement the decisions blocks

Control Flow Statements
- Decision blocks or control flow statements make a decision about code sttements to run on each execution of our program
- Format: < if condition >
- Example: if *inputted number is less than five*

# Operators in Java

Relational Operators
- Consider inputtedNum **<** 5
- The less than sign **<** is and example of a relational operator
- The inputs to < are inputtedNum and 5
- The result of **inputtedNum < 5** is a Boolean so we call **inputtedNum < 5** a Boolean expression
- Other relational operators: >, <, ==, >=, <=, and !=
- inputtedNum <= 5 → **less than or equal** to 5
- inputtedNum >= 8 → **greater than or equal** to 8
- inputtedNum == 8 → **equal** to 8
- inputtedNum != 3 → **not equal** to 3

Conditions in Decision Blocks
- A condition in a decision block evaluates to ture or false depending on some variable
- That's what makes it a condition that can be evaluated during the program's execution and anipulate a program's control flow
  
# Decision-making with if in Java

[*Diagram*](images/diagram01.PNG)

If Statement
- An if statement is a control flow statement, where if the condition is true, it performs some kind of action
  - Condition: inputtedNum < 5
  - Action: print out "Enjoy the good luck a friend brings you"
  - If block action: print out "Enjoy the good lucj a friend brings you"
  - Else block action: print "Your shoe selection... today"

## Code
```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);

        int inputtedNum = scanner.nextInt();

        if (inputtedNum < 5) {
            System.out.println("Enjoy the good luck a friend brings you");
        } else {
            System.out.println("Your shoe selection will make you very happy today");
        }
    }
}
```

# Understanding scope in Java

Code Visibility
- Only the if block or the else block are executed
- The if block didn't know about the code in the else block
- The else block didn't know about the code in the if block
- All of this has to do with a topic called scope

Scope
- The scope of a variable is the part of the program where a piece of code is accessible or in whcch it can be used
- Curly braces create different blocks or regions in Java
- The if block and the else block are separate because they are in different sets of curly brackets

Scope with an If-Else Statement


```java
if (inputtedNum < 100) {
    int favoriteNumber = 5; 
    System.out.println(favoriteNumber);
    favoriteNumber = 10;
    System.out.println(favoriteNumber);
    // In scope (accessible) for favoriteNumber
} else {
    // Out of scope (not accessible) for favoriteNumber
}
// Out of scope (not accessible) for favoriteNumber
```

# While loops (conceptually)

Loops
- A loop allows code to be executed repeatedly based on a Boolean condition
- We'll be focusing on the **while loop**

[*Diagram*](images/diagram02.PNG)

"Song on Repeat" with a While Loop
- On your smartphone, you've probably listened to music and if you find a song you like, you put the song on repeat
- When a song is on repeat, it plays over and over again, until you take it off repeat

# While loops in Java

[*Diagram song on repeat*](images/diagram03.PNG)

## Code

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       boolean isOnRepeat = true;
       while(isOnRepeat){
           System.out.println("Playing current song");
           System.out.println("Would you like to take this song off of repeat? If so, answer yes");
           String userInput = input.next();

           if(userInput.equals("yes")){ // .equals is a string operation to check exact values
               isOnRepeat = false;
           }
       }
        System.out.println("Playing next song");
    }
}
```

# Challenge: Multiple choice

Implement a Multiple-Choice Question
- Creative: one question, three answer choices (one is correct)
- Ask the user a question
- Output answer choices to user
- Collect user's input (that is, the answer they provide)
- Print out an appropiate message to the user (depending on if they were correct or incorrect)

## Code

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String question = "Which animal has four legs and barks?";
        String choiceOne = "dog";
        String choiceTwo = "cat";
        String choiceThree = "turtle";

        String correctAnswer = choiceOne;

        // Write a print statement asking the question
        // Write a print statement giving the answer choices
        System.out.println(question);
        System.out.println(choiceOne + ", " + choiceTwo + " or " + choiceThree + "?");

        // Have the user input an answer
        Scanner input = new Scanner(System.in);
        // Retrieve the user's input
        String userInput = input.next();

        // If the user's input matches the correctAnswer ...
        // then the user is correct and we want to print out a congrats message to the user

        // If the user's input does not match the correctAnswer ...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect
        if(correctAnswer.equals(userInput.toLowerCase())){
            System.out.println("Exactly! That's the animal we were looking for");
        } else {
            System.out.println("Incorrect! That's not the animal we were looking for");
        }
    }
}
```
