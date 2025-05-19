import java.util.Scanner;

public class StudentReportList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        StudentM[] students = new StudentM[100];  // Updated
        int count = 0;

        while (count < students.length) {
            System.out.println("Enter information for Student " + (count + 1));
           
            int studentNumber = (int)(Math.random() * 900000) + 10000;
            System.out.println("Generated Student Number: " + studentNumber);

            

            System.out.print("Enter student name: ");
            String studentName = input.nextLine();

            System.out.print("Enter student score: ");
            double studentScore = input.nextDouble();

            students[count] = new StudentM(studentNumber, studentName, studentScore); // Updated
            count++;

            System.out.println();

            System.out.print("Add another student? (yes/no): ");
            System.out.println();
            input.nextLine();
            String response = input.nextLine().trim().toLowerCase();
            if (!response.equals("yes")) {
                break;
            }
        }

        System.out.println("\nStudent List");
        System.out.println("---------------------");

        for (int i = 0; i < count; i++) {
            System.out.println(students[i].getStudentNumber() + " " + students[i].getStudentName() + " " +
                       students[i].getLetterGrade());
            System.out.println(); 
        }

        input.close();
    }
}
// Replaced Student with StudentM and all its references to avoid mix with Student class in other file
class StudentM {
    private int studentNumber;
    private String studentName;
    private double studentScore;

    public StudentM(int studentNumber, String studentName, double studentScore) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.studentScore = studentScore;
    }

    public String getLetterGrade() {
        if (studentScore >= 90 && studentScore <= 100) {
            return "A";
        } else if (studentScore >= 80 && studentScore < 90) {
            return "B";
        } else if (studentScore >= 70 && studentScore < 80) {
            return "C";
        } else if (studentScore >= 60 && studentScore < 70) {
            return "D";
        } else {
            return "F";
        }
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }
}