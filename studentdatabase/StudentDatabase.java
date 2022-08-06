package studentdatabase;

import java.util.Scanner;

public class StudentDatabase {

    public static void main(String[] args) {

        System.out.println("Enter number of students >> ");
        Scanner sc = new Scanner(System.in);
        int numStudents = sc.nextInt();
        Student[] students = new Student[numStudents];

        for(int i = 0; i < numStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payBalance();
            System.out.println(students[i].toString() + "\n");
            
        }
    }
}