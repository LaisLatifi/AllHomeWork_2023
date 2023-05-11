package Class17Hw;

public class HW1 {
     /*
    Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
     Your program should print an average mark of each student's name.
     */

    String studentName;
    double mathGrade;
    double scienceGrade;
    double englishGrade;

    void Students(String studentName, double mathGrade, double scienceGrade, double englishGrade){

        this.studentName=studentName;
        this.mathGrade=mathGrade;
        this.scienceGrade=scienceGrade;
        this.englishGrade=englishGrade;
    }

    void avrGrade(){
        System.out.print(studentName+": ");
        System.out.println((mathGrade+scienceGrade+englishGrade)/3);

    }

}
