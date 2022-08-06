package studentdatabase;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String courses = "";
    private int balance;
    private static int cost = 950;
    private static int id = 1000;

    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name >> ");
        this.firstName = sc.nextLine();

        System.out.println("Enter last name >> ");
        this.lastName = sc.nextLine();

        System.out.println("Enter graduation year >> ");
        this.gradeYear = sc.nextLine();

        setID();
        
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + setID());

    }

    private int setID() {
        id++;
        return id;
    }

    public void enroll() {

        do {
            System.out.println("Enter course (Q to quit) >> ");

            Scanner sc = new Scanner(System.in);
            String course = sc.nextLine();
    
            if(!course.equalsIgnoreCase("Q")) {
                courses = courses + "\n" + course;
                balance = balance + cost;
            }
        
         else {break;} 
        } while (1 != 0);

        System.out.println("Courses enrolled: " + courses);
    
    }

    public void checkBalance() {
        System.out.println("Your balance is: $" + balance);
    }

    public void payBalance() {
        checkBalance();

        System.out.println("Enter your payment >> ");
        Scanner sc = new Scanner(System.in);
        int payment = sc.nextInt();
        
        balance = balance - payment;
        System.out.println("Your payment of $" + payment + " has been received!");
        checkBalance();
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName +
            "\nGraduation Year: " + gradeYear +
            "\nStudent ID: " + id +
            "\nCourses enrolled: " + courses + 
            "\nBalance: $" + balance + "\n";
    }
    public static void main(String[] args) {
        
    }
}