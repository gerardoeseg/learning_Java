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