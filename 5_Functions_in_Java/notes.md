# What are functions? (conceptually)

Program Execution vs. Design

- We've written code that runs sequentially
- We've written code that manipulates control flow
- It's been about how our program is executes code
- Now, we'll focus on program design and readable code

### Defining Functions

What is a function?
- A function is a series of finite stepes that accomplish some task

Using a functions
- Task: Make a PB&J labled **makePBAndJSandwich**
- To use a function, we can just use its name or label such as makePBAnJSandwich
- makePBAnJSandwich();
- makePBAnJSandwich();
- makePBAnJSandwich();

Defining and Using Functions
- In order to use a function, we must define it first
- We have to write code that defines the name of the function (for example, task) as well as all of the stepes needed to complete the task
- Once the task and its steps are defined, we can use the function throughout our program

Another Example
- Task: Announce Developer Tea Time labeled **announceDeveloperTeaTime**
- Step 1: Wait for tea time
- Step 2: Print out "It's Developer Time!"
- Using function: announceDeveloperTeaTime();

Why Use Functions?
- Functions help developers organize their code in a more meaningful way
- Functions allow us to define a given task once and use it all throughtout our code

Changing a Function's Definition
- Task: Announce Developer Tea Time labeled **announceDeveloperTeaTime**
- Step 1: Wait for tea time
- Step 2: Print out "It's Developer Tea Time! It's time for some snacks."
- Using function: announceDeveloperTeaTime();

# Defining functions in Java

Defining and Using Functions
- In order to use a function, we must define it first
- Howeverm just because we are defining a function does not mean we are using it
- Learning how to make a PB&J sandwich is different than actually making a PB&J sandwich
- We can do this with return types

## Code

```java
import java.util.Scanner;

public class Main {

    public static void announceDeveloperTeaTime(){
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type in a random word and press Enter to start developer tea time");

        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time!");
    }

    public static void main(String[] args) {

    }
}
```

# Calling functions in Java

Using a Function

- **Task: Announce Developer Tea Time labeled**
- Step 1: Wait for tea time
- Step 2: Print out "It's Developer Tea Time!"
- To use a function, we can just use its name or label; for example, announceDeveloperTeaTime();

When we use a function, we call the function

## Code

```java
import java.util.Scanner;

public class Main {

    public static void announceDeveloperTeaTime(){
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type in a random word and press Enter to start developer tea time");

        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time!");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to your new job");

        announceDeveloperTeaTime();

        System.out.println("Write code");
        System.out.println("Review code");

        announceDeveloperTeaTime();

        System.out.println("Get promoted!");
    }
}
```

# Parameters in Java

Dynamic Functions
- announceDeveloperTeaTime had no inputs
- It contained a series of stepes that were executed and resulted in the same output every time
- How can we use inputs to make our functions more dynamic?

Calculate Total Cost of Meal
- Step 1 - Calculate Tip: `tip = tipRate * listedMealPrice;`
- Step 2 - Calculate Tax: `tax = taxRate * listedMealPrice;`
- Step 3 - Calculate Result: `result = tip + tax + listedMealPrice;`
- Step 4 - Output Result: `System.out.println(result);`

Create a Function with Inputs
- The listedMealPrice, tipRate and taxRate inputs will be defined in the function's definition 
- The values of these inputs will be assigned when we call the function
- This will allow us to hacve a custom listed meal price, tip rate, and tax rate every time we call the function
  
## Code 

```java
public class Main {

    public static void calculateTotalMealPrice(double listedMealPrice,
                                               double tipRate,
                                               double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println("Your total meal price is " + result);
    }

    public static void main(String[] args) {
        calculateTotalMealPrice(15, .2, .08);
        calculateTotalMealPrice(25, .18, .08);
    }
}
```

# Return types in Java

Input and Output for Functions
- Gather input from the user: Scanner
- Output to the user: System.out.println()
- Input data into a function: Parameters
- Output data from a function: ????? → Return Types

Splitting the Bill
- Five people eat at a restaurant, where the listedMealPrice = 100, tipRate = .20, taxRate = .08
- We can call our function: calculateTotalMealPrice(100, .20, -08)
- The total meal price is 128, but how much does each person owe?

Potential Solutions
- We could add another parameter, representing the number of people at the meal and divide the result by that
- However, the output of the function should be the total meal cost, not a portion, because the name of the function is calculateTotalMealPrice
- We need to get access to the result of calculateTotalMealPrice in order to manipulate more

## Code

```java
public class Main {

    public static double calculateTotalMealPrice(double listedMealPrice,
                                               double tipRate,
                                               double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        return result;
    }

    public static void main(String[] args) {
        double groupTotalMealPrice = calculateTotalMealPrice(100, .2, .08);
        System.out.println(groupTotalMealPrice);

        double individualMealPrice = groupTotalMealPrice / 5;
        System.out.println(individualMealPrice);
    }
}
```

# Using built-in functions in Java

So far...
- We've been creating our functions from scratch
- All of the functions we defined are user-defined functions

Built-In Functions
- There are many common functions that developers want to use, but don't want to define every time
- Java has defined some functions for us
- Ww can just call a built-in function because it's already defined
- System.out.println() is an example of a built-in function

Operations
- Many of these operations on specific data types are built-in
- .equals for Strings is built-in
- "red".equals("blue");

Dot Operator
- We use the dot operator to get access to many of these built-in functions
- System.out.println()
- "red".equals("blue");
- Sometimes we'll define our own functions and sometimes we'll use built-in functions

Finding Built-In Functions
- Should I create a custom function for exponentiation?
- Is there a built-in function for exponentiation?
- Exponentiation: 2 to the power of 5 is the same as 2 * 2 * 2 * 2 * 2

Benefit of Using Built-In Functions
- You don't have to define the function yourself; you can just call it
- All you have to know is the function's inputs and output as well as the gist of what the function does
- Built-In functions have been well tested so they are guaranteed to do what they are described to do

# Challenge: Salary calculator

Calculate an Employee's Salary
- **Input 1**: number of hours the employee works per week
- **Input 2**: amount of money the employee makes per hour
- **Output**: employee's gross yearly salary
- Do not worry about taxes, 401(k) savings, or anything that might come out of the an employee's paycheck for this example
- **Bonus**: Can you add an input that accounts for vacation days?
- The employee does not get paid for vacation days
- One vacation day = eight hours of work

## Code

```java
import java.util.Scanner;

public class Main {

    public static double salaryCalculator(double hoursPerWeek, double moneyPerHour, int vacationDays){
        if (hoursPerWeek < 0){
            return -1;
        }
        if (moneyPerHour < 0){
            return -1;
        }

        double earnings = hoursPerWeek * moneyPerHour;
        double unpaidTime = vacationDays * moneyPerHour * 8; // One day has eight hour
        return ((earnings/7)*365) - unpaidTime;
    }

    public static void main(String[] args) {

        System.out.println("Hours per week:");
        Scanner input = new Scanner(System.in);
        double hours = input.nextDouble();

        System.out.println("Money per hour:");
        double money = input.nextDouble();

        System.out.println("Vacation days:");
        int days = input.nextInt();

        double salary = salaryCalculator(hours, money, days);

        System.out.println(salary);
    }
}
```
