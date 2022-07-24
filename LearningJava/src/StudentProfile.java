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
