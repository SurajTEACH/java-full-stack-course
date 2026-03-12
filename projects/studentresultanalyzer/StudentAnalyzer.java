package projects.studentresultanalyzer;

import java.util.Scanner;

public class StudentAnalyzer {

  // Student result print karne ke liye
  public static void studentMain(String[] roll, String[] name, int[][] marks, int index) {

    System.out.println("Enrollment Number : " + roll[index]);
    System.out.println("Student Name : " + name[index]);

    int total = totalMarks(marks, index);

    System.out.println("Marks in Subjects :");

    for (int j = 0; j < marks[index].length; j++) {
      System.out.println("Subject " + (j + 1) + " : " + marks[index][j]);
    }

    System.out.println("Total Marks : " + total);

    double per = percentage(total);

    System.out.println("Percentage : " + per + "%");

    char ch = grade(per);

    System.out.println("Grade : " + ch);

    String msg = message(ch);

    System.out.println("Message : " + msg);

  }

  // total marks calculate
  public static int totalMarks(int[][] marks, int index) {

    int total = 0;

    for (int j = 0; j < marks[index].length; j++) {
      total = total + marks[index][j];
    }

    return total;
  }

  // percentage calculate
  public static double percentage(int totalMarks) {

    double per = (totalMarks / 500.0) * 100;

    return per;
  }

  public static String message(char ch) {

    if (ch == 'A') {
      return "Excellent Student ";
    } else if (ch == 'B') {
      return "Good Student";
    } else if (ch == 'C') {
      return "Average Student";
    } else {
      return "Fail Student";
    }
  }

  // grade decide
  public static char grade(double percentage) {

    int per = (int) percentage;

    if (per >= 80 && per <= 100) {
      return 'A';
    } else if (per >= 60 && per < 80) {
      return 'B';
    } else if (per >= 40 && per < 60) {
      return 'C';
    } else {
      return 'D';
    }

  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of the student :");
    int n = sc.nextInt();

    sc.nextLine();

    String[] name = new String[n];

    System.out.println("Enter the name of the student :");

    for (int i = 0; i < n; i++) {
      name[i] = sc.nextLine();
    }

    System.out.println("Enter the Enrollment number of the student :");

    String[] roll = new String[n];

    for (int i = 0; i < n; i++) {
      roll[i] = sc.nextLine();
    }

    System.out.println("Enter the each student marks :");

    int subjects = 5;

    int[][] marks = new int[n][subjects];

    for (int i = 0; i < n; i++) {

      System.out.println("Enter the marks of " + name[i] + " :");

      for (int j = 0; j < subjects; j++) {

        System.out.print("Subject " + (j + 1) + " : ");
        marks[i][j] = sc.nextInt();

      }
    }

    System.out.println("Enter the enrollment number :");
    sc.nextLine(); // buffer clear
    String enrollment = sc.nextLine();

    boolean found = false;

    for (int i = 0; i < n; i++) {

      if (enrollment.equals(roll[i])) {

        System.out.println("******************************Student Result******************************");

        studentMain(roll, name, marks, i);

        found = true;

        break;
      }
    }

    if (found == false) {

      System.out.println("Enrollment number not found...");
      System.out.println("Please enter correct enrollment number");

    }
  }
}