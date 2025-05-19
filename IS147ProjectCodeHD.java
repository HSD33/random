// Harveer Dhindsa
// Course Project
// IS147

import java.util.Scanner;

public class IS147ProjectCodeHD {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
 
   System.out.println("\nStudent Grade Calculator");
 
 // Prompt the user to enter student name and ask to enter numerical grades
   System.out.print("Enter student first name and last name: ");
   String name = input.nextLine();
   Student student = new Student(name);
   System.out.println("Enter each grade in numeric order individually.\nEnter \"-1\" to finish");
 
   // Prompts user to input invidual grades
   double grade = 0;
 
   while(true) {
   System.out.print("Enter grade: ");
   grade = input.nextDouble();
 
   if (grade == -1) {
    break;
 }
  student.addGrade(grade);
}
 
// If statement to determine the student and their grades
   if (student.gradeCount > 0) {
      System.out.println("\nStudent: " + student.name.toUpperCase());
      System.out.println("Number of grades: " + student.gradeCount);
      student.printStudentGrades();
      System.out.println("Average grade: " + Math.round(student.getAverage() * 100) / 100.0);
 
// Uses average from method to determine if student has passed or failed
   if (student.getAverage() >= 70) {
     System.out.println("Student has PASSED");

}
   else {
     System.out.println("Student has FAILED");
   } 
}

   else {
      System.out.println("ERROR: No grades entered. Please enter a numerical grade.");
   } 
   input.close();
}
 
// Calculate grade average method 
 public static double calculateAverage(double total, int count) {
      return total / count;
   }
}

// Student Class to define student object and grades 
 class Student {
 
   String name;
   double totalGrades;
   int gradeCount;
   double[] studentGrades;
   Student(String name) {
 
   this.name = name;
   this.totalGrades = 0;
   this.gradeCount = 0;
   this.studentGrades = new double[100];
 }
 
// Allows for multiple grades to be entered 
 
 void addGrade(double grade) {
   if (gradeCount < studentGrades.length) {
   studentGrades[gradeCount] = grade;
   totalGrades += grade;
   gradeCount++;
 }
   else {
     System.out.println("Grade limit reached");
 }
}
 
 double getAverage() {
   return totalGrades / gradeCount;
 }
 
 boolean didPass() {
   return getAverage() >= 70;
 }
 
 void printStudentGrades() {
   System.out.print("Grades: ");
     for (int i = 0; i <gradeCount; i++) {
       System.out.print(studentGrades[i] + " ");
 }
 
   System.out.println();
 
  }
}