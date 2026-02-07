package voc_internship_srp;
import java.util.ArrayList;
import java.util.Scanner;

public class Student_REsult_portal {

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

