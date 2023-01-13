import java.util.Scanner;

public class Grading {
public static void main (String[] args) {

	//NO OF STUDENTS
		Scanner student = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int Students= student.nextInt();
		int marks = 0;
		int index = 0;
		int counter=1;
		
		
		String firstnameStudents =" ";
		String secondnameStudents =" ";
		String courseStudents = " ";
		String grade = " ";
		String firstnamearray[] = new String[Students];
		String secondnamearray[] = new String[Students];
		String coursearray[] = new String[Students];
		int marksarray [] = new int [Students];
		String gradingarray [] = new String[Students];
	
		for(int i =0 ;i< Students ;i++) {
			//ENTER STUDENT NAMES
			//first name
		System.out.println("student "+ counter);
		Scanner nameStudents = new Scanner(System.in);
		System.out.println("Enter first student name :");
		firstnameStudents =nameStudents.next();
		firstnamearray[index] =  firstnameStudents;
		
		//second name
		System.out.println("student"+ counter);
		Scanner namestudents = new Scanner(System.in);
		System.out.println("Enter second student name :");
		secondnameStudents =namestudents.next();
		secondnamearray[index] =  secondnameStudents;
		
		//COURSE OF EACH STUDENT
		System.out.println("student" + counter);
		Scanner coursestudents = new Scanner(System.in);
		System.out.println("Enter student course :");
		courseStudents = coursestudents.next();
		coursearray[index] = courseStudents;
		
		//ENTER MARKS SCORED
		Scanner marksScored = new Scanner (System.in);
		System.out.println("Enter Marks Scored by student " + counter +":");
		marks = marksScored.nextInt();
		marksarray[index] = marks;
		
		//GRADE OF EACH STUDENT
	
		
		if(marks >=70 && marks <=100) {
			grade = "A";
			System.out.println(grade);
			gradingarray[index] =  grade;
			
		}else if(marks >=60 && marks <= 69) {
			grade ="B";
			System.out.println(grade);
			gradingarray[index] =  grade;
			
		}else if(marks >=50 && marks <=59) {
			grade ="C";
			System.out.println(grade);
			gradingarray[index] =  grade;
			
		}else if(marks >=40 && marks <=49) {
			grade ="D";
			System.out.println(grade);
			gradingarray[index] =  grade;
			
		}else if(marks >=0 && marks <=39) {
			grade ="E";
			System.out.println(grade);
			gradingarray[index] =  grade;
		}
		 
		
	index++;
	counter++;
		}
		System.out.println("**********SUMMARY*************");
		int indexes = 0;
		while(indexes < Students) {
			System.out.println(firstnamearray[indexes] +" "+ secondnamearray[indexes] + " " + coursearray[indexes] + " "  + marksarray[indexes] +" " + gradingarray[indexes] + "\n");
			indexes++;
		}
	
	

  }
}
