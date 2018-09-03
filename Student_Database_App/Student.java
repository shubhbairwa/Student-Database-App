package Student_Database_App;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String StudentId;
	private int courseFee = 600;
	private String courses;
	private int tutionbalance=0;
	private static int id = 0;

//construct that enter students's first name and their grade year
	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name of Student: ");
		this.firstName = sc.nextLine();
		System.out.println("Enter Last Name of Student: ");
		this.lastName = sc.nextLine();
		System.out.println(
				"Enter  Grade year of STudent:\n NOTE:-please enter only year\nexample if your year is 2015 enter only 2015 not more than this");
		this.gradeYear = sc.nextInt();
		
		setStudentId();
		
			}

	// generate id for student it must be unique
	private String setStudentId() {
		id++;
		// studentId=gradelevel+id
		return this.StudentId = gradeYear + "" + id;
	}
//courses list
	public void coursList() {
		System.out.println("courses list is: \n1-Math101\n2-Computer Science101\n3-History101\n4-Englis101");
	}

	// enroll in courses
	public void enrollCourse() {
	
		do {
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter the name of courses you want to enroll\n(Qfor quit).");
				String course  =sc.nextLine();
				if(!course.equals("Q")) {
					courses=courses+"\n"+course;
					tutionbalance=tutionbalance+courseFee;
				}else {
					break;
				}
		}while(1!=0);
			
		
	}
	
	
	
	
	// view balance and pay tution fee
public void viewBalance() {
	System.out.println("your balance is: $"+tutionbalance);
}
public void payTutionFee() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the payment you want to pay. ");
int payment=sc.nextInt();
tutionbalance=tutionbalance-payment;
System.out.println("thankyou for you paument you pay $"+payment);
sc.nextLine();
System.out.println("you outstanding is $"+tutionbalance +"\nKindly pay that reamining amount in Given interval of time.") ;
}
	// show method that show student their name, ID, courses enrolled, and balance
public void showInfo() {
	System.out.println("Name: "+firstName+" "+lastName+"\nGRade Year: "+gradeYear+"\nSTUDENTID: "+StudentId+"\nENrolled Cousrses List: "+courses+"\nYour Outstanding is: $"+tutionbalance);
}
}