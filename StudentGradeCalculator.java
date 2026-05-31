import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== STUDENT GRADE CALCULATOR =====");

        // Student Name
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        // Number of Subjects
        System.out.print("Enter Number of Subjects: ");
        int subjects = sc.nextInt();

        int total = 0;

        // Loop for Marks Input
        for (int i = 1; i <= subjects; i++) {

    sc.nextLine();

    System.out.print("Enter Subject Name: ");
    String subjectName = sc.nextLine();

    int marks;

    while (true) {

        System.out.print("Enter marks for " + subjectName + ": ");
        marks = sc.nextInt();

        if (marks >= 0 && marks <= 100) {
            break;
        }
        else {
            System.out.println("Invalid marks! Enter between 0 and 100.");
        }
    }

    total = total + marks;
}

        // Average Calculation
        double average = (double) total / subjects;

        // Grade Logic
        String grade;

        if (average >= 90) {
            grade = "A";
        }
        else if (average >= 75) {
            grade = "B";
        }
        else if (average >= 50) {
            grade = "C";
        }
        else {
            grade = "Fail";
        }

        // Pass or Fail
        String result;

        if (average >= 35) {
            result = "PASS";
        }
        else {
            result = "FAIL";
        }

        // Final Output
        System.out.println("\n===== RESULT =====");

        System.out.println("Student Name : " + name);
        System.out.println("Total Marks  : " + total);
        System.out.printf("Percentage   : %.2f%%\n", average);
        System.out.println("Grade        : " + grade);
        System.out.println("Result       : " + result);

        sc.close();
    }
}