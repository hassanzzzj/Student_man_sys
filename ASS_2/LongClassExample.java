package ASS_2;

import java.util.Scanner;

public class LongClassExample {
        public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Course");
            System.out.println("2. Add Student");
            System.out.println("3. Enroll Student in Course");
            System.out.println("4. Show All Students");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            
            String choice = sc.nextLine();

            if (choice.equals("1")) {
                System.out.print("Course ID: ");
                String id = sc.nextLine();
                System.out.print("Course Name: ");
                String name = sc.nextLine();
                System.out.print("Credit Hours: ");
                String ch = sc.nextLine();
                sms.addCourse(id, name, ch);

            } else if (choice.equals("2")) {
                System.out.print("Student ID: ");
                String id = sc.nextLine();
                System.out.print("Student Name: ");
                String name = sc.nextLine();
                sms.addStudent(id, name);

            } else if (choice.equals("3")) {
                System.out.print("Student ID: ");
                String sid = sc.nextLine();
                System.out.print("Course ID: ");
                String cid = sc.nextLine();
                sms.enrollStudent(sid, cid);

            } else if (choice.equals("4")) {
                sms.showAllStudents();

            } else if (choice.equals("5")) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid Input!");
            }
        }

        sc.close();

}
}