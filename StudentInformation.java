import java.util.*; 

public class StudentInformation {
    // variables 
    String studentName; 
    int[] grades; 

    // constructor for student name and grades 
    public StudentInformation(String studentName, int gradeNum) { 
        this.studentName = studentName; 
        this.grades = new int[gradeNum]; 
    }

    // for entering the grades for each student 
    public void enterGrades(Scanner input) { 
        System.out.println("Enter the grades for " + studentName + ":"); 
        for (int i = 0; i < grades.length; i++) { 
            System.out.println("Grade " + (i + 1) + ": "); 
            grades[i] = input.nextInt(); 
        }
    }

    // calculating the class average 
    public double calculateClassAverage() { 
        int sum = 0; 
        for (int grade : grades) { 
            sum += grade; 
        }
        return (double) sum / grades.length; // returns the result
    }

    // displays the information for the grade report 
    public void displayInfo() { 
        System.out.println("Student: " + studentName); 
        System.out.println("Student Grades: " + Arrays.toString(grades)); 
        System.out.println("Calculated Average Grade: " + calculateClassAverage()); 
        System.out.println(); 
    }
}
