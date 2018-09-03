package Student_Database_App;

import java.io.IOException;
import java.util.Scanner;

public class StudentDatabaseRunner {

	public static void main(String[] args) throws IOException {
					
	//ask how many new users we want to add
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr number of new Student want to enroll:");
		int numOfStudent=sc.nextInt();
				
		Student student[]=new Student[numOfStudent];
	
		//create n number of new students
for(int i=0;i<numOfStudent;i++) {
	student[i]=new Student();
	student[i].coursList();
	student[i].enrollCourse();
	System.out.println();
	
	student[i].payTutionFee();
	System.out.println();
	student[i].showInfo();
	
}
	}

}
