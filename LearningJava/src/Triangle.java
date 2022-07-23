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
