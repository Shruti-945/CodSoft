import java.util.Scanner;
public class GradeCalc {
  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    System.out.println("Student Grade Calculator");
    System.out.println("Enter no of subjects");
    int Nsub=obj.nextInt();
    int total=0;
    for(int i=0;i<Nsub;i++) {
      System.out.println("Enter marks obtained in " +i);
      int marks=obj.nextInt();
      total+=marks;

    }
    double avgPerc=(double)total/Nsub;
    char grade;
    if(avgPerc>=90)
    grade='O';
    else if(avgPerc>=80)
    grade='A';
    else if(avgPerc>=70)
    grade='B';
    else if(avgPerc>=60)
    grade='C';
    else if(avgPerc>=50)
    grade='D';
    else if(avgPerc>=40)
    grade='E';
    else
    grade='F';
    
      System.out.println("Total Marks scored is " +total);
      System.out.println("Average Percentage gained is " +avgPerc +"%");
      System.out.println("Grade: " +grade);
  
}
}