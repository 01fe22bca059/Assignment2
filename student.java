import java.time.*;
import java.util.Scanner;
class student
{
    public void student_name()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the student name:");
        String name = s.nextLine();
        System.out.println("Student name = "+name);
    }
    public void student_age(LocalDate dob)
    {
        LocalDate today=LocalDate.now();
        int year=Period.between(dob,today).getYears();
        System.out.println("Current date is:"+today);
        System.out.println("Student birthdate: "+dob);
        System.out.println("Student age is = "+year);
    }
}
class student_details
{
    public static void main(String args[])
    {
        student s = new student();
        s.student_name();
        LocalDate dob = LocalDate.of(2005, 02, 26);
        s.student_age(dob);
    }
}