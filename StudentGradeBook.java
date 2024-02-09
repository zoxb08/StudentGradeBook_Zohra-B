// driver class
import java.util.*; 

public class StudentGradeBook {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        System.out.println("Welcome to Student Grade Book!"); 
        
        // asking the user to enter the number of students in the class
        System.out.println("Enter the number of students: "); 
        int numOfStudents = input.nextInt(); 

        // asking the user to enter the number of grades they would like to input per Student 
        // for example if the user enters 3, then 3 grades must be entered for each student
        System.out.println("Enter the grade per student: "); 
        int gradePerStudent = input.nextInt(); 

        // object created for the StudentInformation class
        StudentInformation[] students = new StudentInformation[numOfStudents];
        
        // iterates through the number of students in the class
        for (int i = 0; i < numOfStudents; i++) { 
            System.out.print("Enter the name of student " + (i + 1) + ": "); 
            String name = input.next(); 
            students[i] = new StudentInformation(name, gradePerStudent); 
            students[i].enterGrades(input); 
        }

        // for printing out the grade report 
        System.out.println("\nGrade Book summary\n: "); 

        for (StudentInformation studentInformation : students) { 
            studentInformation.displayInfo(); 
        }

        input.close(); 
       
    }
}
