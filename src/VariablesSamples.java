

void main() {
// 2 steps to create a variable :
    // 1. declaration
    // 2. assigment

    //int year = 2026;
    int age = 23;

    double gpa = 3.47;
    double agno = 3;
    //double temperature = -5.6;

    char grade = 'A';
    //char symbol = '&';

    boolean passed = true;
    boolean failed = false;

    String name = "Elif";
    //String email = "xxx@xxx";

    System.out.println("Student's name is " + name + " " + "and student's age is " + age);
    System.out.println("Student's grade is " + grade + " " + "and her gpa and agno are " + gpa + "," + agno);

    if(passed) {
        System.out.println("Student passed");
    }
        else{
            System.out.println("Student failed");
        }

    if(failed) {
        System.out.println("Student passed");
    }
    else{
        System.out.println("Student failed");
    }

 // Outputs:
    //Student's name is Elif and student's age is 23
    //Student's grade is A and her gpa and agno are 3.47,3.0
    //Student passed
    //Student failed
}
