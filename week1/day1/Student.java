//Assignment 5

package week1.day1;

public class Student {
	String studentName;
	int rollNo;
	String collegeName;
	int markScored;
	float cgpa;
	
	public void classReport() {
		studentName = "Priya";
		rollNo = 123;
		this.collegeName = "Vivekananda College";
		this.markScored = 490;
		this.cgpa = 9.5f; 
		System.out.println("Student Name: "+studentName); 
		System.out.println("Roll No.: "+rollNo); 
		System.out.println("College Name: " +collegeName);  
		System.out.println("Mark Scored: "+markScored);  
		System.out.println("CGPA: "+cgpa);  
	}
	
	public static void main(String args[]) {
		
		//Printing the Class Report
		Student s = new Student();
		System.out.println("CLASS REPORT\n**********\n");
		s.classReport();
	}

}
