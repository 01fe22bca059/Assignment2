import java.util.Scanner;
public class course_details{
    public static void main(String args[]){
        System.out.println("Enter the semester:");
        Scanner s=new Scanner(System.in);
        int sem=s.nextInt();
        if(sem==1){
            System.out.println("Course\tMarks");
            System.out.println("FCO\t82");
            System.out.println("Maths\t65");
        }
        else if(sem==2){
            System.out.println("Course\tMarks");
            System.out.println("OS\t90");
            System.out.println("SE\t78");
        }
        else if(sem==3){
            System.out.println("Course\t\tMarks");
            System.out.println("Java\t\t85");
            System.out.println("DBMS\t\t92");
        }
        else if(sem==4){
            System.out.println("Course\t\tMarks");
            System.out.println("ST\t\t95");
            System.out.println("ML\t\t82");
        }
        
    }
}