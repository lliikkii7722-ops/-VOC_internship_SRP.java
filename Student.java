package voc_internship_srp;
public class Student {
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



