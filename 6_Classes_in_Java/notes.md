# Classes in Java

Program Design
- How can we make our programs more readable to others?
- In the workforce, several software developers work on the same program, so it's essential to write code that is easy to understand

Classes
- One way to make our programs easier to read is with classes
- All of the code we've written so far was contained in the Main class
- Everything we see and hear in everyday life can be represented in code
- Example: "on-repeat" on a music player, restaurant receipt totals
- How well something is represented is up to us
- Classes often act as blueprints for these things
- A class is a user defined blueprint that has a set of attributes and behaviors that define the item that it is supposed to represent
- Let's create a blueprint for a triangle
- A triangle has a base, height, three sides, etc.

Attributes of a Class
- What are the properties of a triangle?
- double base; double height;
- double sideLenOne; double sideLenTwo; double sideLenThree;
- Every triangle has these attributes even though the value of each attribute may be different

Behaviors of a Class
- **Attributes/propeerties**: base, height, sideLenOne, sideLenTwo, sideLenThree
- **Behaviors**: functions that are related to (and located inside) the class
- The findArea() function can use the base and height attributes to calculate the area of the triangle
- We can organize our coude by addding this functions as a behavior to our Triangle class 
- **Behaviors/methods**: findArea(), calculateTriangleType()
- The calculateTriangleType() function can use the side lengths to decide the triangle is equilateral, isosceles or scalene
- There are a bunch of different ways you can represent a triangle in prigram; this is just one way
- The behaviors we've talked about so far use or manipulate attributes of the class
- Although this is often the case, it doesn't have to be
- We add the keyword static if the function does not use the attributes of a class, but still relates to the overall theme or idea of the class

# Constructors in Java

How Do We Make Individual Triangles
- We had to define functions before we could call them; we have to define classes before we can use them
- Defining a Triangle class does not create any triangles
- In this video, we are going to learn how to make individual triangles instances in our program

What Is an Instance?
- An instance is an object create from a class blueprint
- The Triangle class defines base, height, sideLenOne, sideLenTwo, and sideLenThree as attributes
- Example **Instance One**: `triangleA: base = 15, height = 8, sideLenOne = 15, sideLenTwo = 8, sideLenThree = 17`
- Example **Instance Two**: `triangleB: base = 3, height = 2.598, sideLenOne = 3, sideLenTwo = 3, sideLenThree = 3`

How Do We Create Triangles?
- A **constructor** is a special method or behavior inside every class that creates and initializes instances
- We will use a constructor in the Triangle class to construct and initialize Triangle instances
- In order to create a Triangle instance in our code, we just have to call the constructor method of the Triangle class

What Does a Constructor Look Like?
- The constructor may or may not take inputs
- A constructor always return an instance of the class it's in (that is, a constructor in the Triangle class returns a triangle)


```java
public Triangle(){
    
}
```

Creating a Constructor
- A **constructor** is a special method or behavior inside every class that creates and initializes instances
- In constructing a Triangle instance or Triangle object, we'll want to initialize its attributes with values
- We could set these to any default value to each of these attributes, but ideally, this constructor would be dynamic and on the fly decide what values to give these attributes

What Does a Constructor Look Like?
- We can add parameters to give a dynamic value for each attribute
- The parameter name can be different than the attribute name


```java
public Triangle(double base, double height, double sideLenOne, double sideLenTwo, double sideLenThree){

}
```

- To access the attribute for the Triangle instance we are trying to construct, we use the this keyword and the dot operator

```java
public Triangle(double base, double height, double sideLenOne, double sideLenTwo, double sideLenThree){
    this.base = base;
    this.height = height;
    this.sideLenOne = sideLenOne;
    this.sideLenTwo = sideLenTwo;
    this.sideLenThree = sideLenThree;
}
```

- The this keyword helps our program make a distinction between the attribute variable and the parameter variable
- When we used with the this keyboard, the dot operator allows us to access the new Triangle's attributes variables

How Do We Use a Constructor
- We call it like any other function
- The only difference is that because we are creating a new Triangle instance, we have to use the new keyword


```java
Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);
```

Creating New Types of Data
- Triangle is now a data type? Yes
- It's a particular way we've decoded to store and organize data about a triangle

# Creating a class in Java

## Code - Triangle class

```java
public class Triangle {

    // Instance variables
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    // Constructor
    public Triangle(double base, double height,
                    double sideLenOne, double sideLenTwo,
                    double sideLenThree){

        // Assign values to the attributes
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    public double findArea(){
        return (this.base * this.height) / 2;
    }
}
```

# Creating instances in Java

## Code - Triangle class

```java
public class Triangle {

    // Instance variables
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    // Constructor
    public Triangle(double base, double height,
                    double sideLenOne, double sideLenTwo,
                    double sideLenThree){

        // Assign values to the attributes
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    public double findArea(){
        return (this.base * this.height) / 2;
    }
}
```


## Code - Main class

```java
public class Main {

    public static void main(String[] args) {

        // Triangle instances
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3,3);

    }
}
```

# Instance methods vs. class methods

Instance Methods
- The implementation of the findArea function in the Triangle class relies on the attributes values of a given triangle
- findArea() is an instance method, so we call it with a Triangle instance, for example, triangleA.findArea();


```java
public double findArea(){
    return (this.base * this.height) / 2;
}
```

Static Methods
- We did not need to create an instance of Math to use the pow methods
- pow() is a static method (also called class methods) so we call them using the class name


```java
int expNum = Math.pow(2, 3);
```

Instance Methods vs. Class Methods
- Instance methods are also referred to as non-static methods since you need an instance to use them
- Class methods are referred to as static methods because you do not need an instance to use them

Intance Method or Class Method?
- We used .charAt() method in a previous chapter with a string
- To access the .chatAt, we used dot operator on a String instance ("Gerardo") saved in a variable (studentFirstName)
- Since we access the methods through an instance, .chatAt is an instance (non-static) method instead of a class (static) method


```java
String studentFirstName = "Gerardo";
char firstInitial = studentFirstName.charAt(0);
```

# Using instance methods in Java

## Code - Triangle class

```java
public class Triangle {

    // Instance variables
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    // Constructor
    public Triangle(double base, double height,
                    double sideLenOne, double sideLenTwo,
                    double sideLenThree){

        // Assign values to the attributes
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    public double findArea(){
        return (this.base * this.height) / 2;
    }
}
```


## Code - Main class

```java
public class Main {

    public static void main(String[] args) {

        // Triangle instances
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3,3);

        double triangleAArea = triangleA.findArea();
        System.out.println(triangleAArea);

        double triangleBArea = triangleB.findArea();
        System.out.println(triangleBArea);

    }
}
```

# Instance and class variables in Java

Non-Static vs. Static Variables

- Base and Height are non-static instance variables: their values are not the same for every triangle; their values change depending on the triangle instance
- Static class variables do not change per instance; they hold a value for the whole class to use

Accessing Static Class Variables
- We access a static class variable using the class name (in this case, Triangle)
- A static variable's value belongs to the class rather than a particular instance


```java
Triangle.numOfSides
```

## Code - Triangle class

```java
public class Triangle {

    // Static variables
    static int numOfSides =3;

    // Instance variables
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    // Constructor
    public Triangle(double base, double height,
                    double sideLenOne, double sideLenTwo,
                    double sideLenThree){

        // Assign values to the attributes
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    public double findArea(){
        return (this.base * this.height) / 2;
    }
}
```


## Code - Main class

```java
public class Main {

    public static void main(String[] args) {

        // Triangle instances
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3,3);

        double triangleAArea = triangleA.findArea();
        System.out.println(triangleAArea);

        double triangleBArea = triangleB.findArea();
        System.out.println(triangleBArea);

        System.out.println(triangleA.sideLenThree);
        System.out.println(triangleB.base);

        System.out.println(Triangle.numOfSides);

    }
}
```

# Review: Classes vs. instances
- **Classes** help organize our code; they contain **attributes** (also referred to as properties) and **behavior** (also referred to as methods)
- Every class contains a **constructor** that can create instances

Instance Variables and Methods
- Soome attributes are associated with each individual instance and we call these instance variables
- Non-static instance methods access the instance variables in their implementation


```java
Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
System.out.println(triangleA.height);
Triangle triangleB = new Triangle(3, 2.598, 3, 3,3);
System.out.println(triangleB.getArea);
```

Class Variables and Methods
- Some attributes are asssociated with the whole class and we call these class variables
- Static class methods do not need an instance in order to be used; we just use the class name


```java
System.out.println(Triangle.numOfSides);

System.out.println(Math.pow(5, 8));
System.out.println(Math.abs(-100));
```

# Challenge: Student profile

Student Profile Attributes

- First Name
- Last Name
- Expected Year to Graduate
- GPA
- Declared Major

- The Student Profile class should have **at least one behavior**
- Sometimes a student cannot get into the right classes in order to  graduate on time and must graduate the following year
- We should have a function that increments a student's expected graduation year by one

Creating and Using a Student Profile
- The Student Profile class should have a **constructor** that initializes all of the attributes with dynamic values, meaning the values that the constructor is called with will determine the values of the attributes
- Your program should **create two student profile instances** that represent two different student profiles
- Your program should call **incrementExpectedGraduationYear** on one of the student profiles and print out their expected graduation year instance value of the console

## Code - StudentProfile class

```java
public class StudentProfile {

    // Instance variables, atributes
    int expectedYearToGraduate;
    double studentGPA;
    String studentFirstName;
    String studentLastName;
    String declaredMajor;

    // Constructor
    public StudentProfile(String studentFirstName, String studentLastName,
                          String declaredMajor, double studentGPA,
                          int expectedYearToGraduate){

        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.declaredMajor = declaredMajor;
        this.studentGPA = studentGPA;
        this.expectedYearToGraduate = expectedYearToGraduate;
    }

    // Instance methods, behavior
    public void incrementExpectedGraduationYear() {
        this.expectedYearToGraduate = this.expectedYearToGraduate + 1;
    }
}
```


## Code - Main class

```java
public class Main {

    public static void main(String[] args) {

        StudentProfile profileOne = new StudentProfile("Sally", "Salmon", "Film", 3.75, 2022);
        StudentProfile profileTwo = new StudentProfile("Max", "Tiffen", "Computer Science", 3.45, 2021);

        profileTwo.incrementExpectedGraduationYear();
        System.out.println(profileTwo.expectedYearToGraduate);
    }
}
```
