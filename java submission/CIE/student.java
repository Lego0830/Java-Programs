package CIE;

import java.util.Scanner;

public class student {
    Scanner sc = new Scanner(System.in);
    public String usn,name;
    public int sem;
    public void accept(){
        System.out.println("Enter the usn of student");
        usn = sc.nextLine();
        System.out.println("Enter the name of student");
        name = sc.nextLine();
        System.out.println("Enter the semester");
        sem = sc.nextInt();
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        System.out.println("Semester: " + sem);
    }

}
