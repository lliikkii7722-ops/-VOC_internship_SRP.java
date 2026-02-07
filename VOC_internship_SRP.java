package VOC_internship;
import java.util.ArrayList;
import java.util.Scanner;
class Student{
	int roll; String name; 
	int[] marks =new int [5];
	
	Student(int r, String n ,int[] m) {
		roll=r; name=n; marks=m;
	}
	 void DisplayTheResult() {
		 int total=0;
		 for(int x:marks) total+=x;
		 double percentage=total/5.0;
		 String gradeing;
		 if(percentage>=90) gradeing="A";
		 else if(percentage>=75) gradeing="B";
		 else if(percentage>=60) gradeing ="C";
		 else if(percentage>=40) gradeing="D";
		 else gradeing="F";
		 System.out.println(roll + " " + name + " " + 
		 "tatal marks is" + total + " percentagae is: " + percentage + " grade = " + gradeing);
		 
		 
	 }
			}


public class VOC_internship_SRP {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Student> list =new ArrayList<>();
		System.out.println("how many students :");
		int n=sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.print("roll number:");
			int r=sc.nextInt();
			sc.nextLine();
			System.out.println("name:");
			String name=sc.nextLine();
			int [] m=new int[5];
			System.out.println("enter your 5 subject marks:");
			for(int j=0; j<5; j++) 
				m[j]=sc.nextInt();
				list.add(new Student(r,name,m));
			
		}
		System.out.println("\nResults:");
        for (Student s : list) s.DisplayTheResult();
sc.close();
	}

}
