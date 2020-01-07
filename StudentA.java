package JavaBasic;

import java.util.Scanner;

public class StudentA extends Marks 
{
	int sum;
	int percentage;
	int totalmarks =300;
	StudentA(int sub1,int sub2,int sub3)
	{
		
	sum=sub1+sub2+sub3;
	//System.out.println("Sum:"+sum);
	
	}
	
	public void getPercentage()
	{
		//double percentage;
		
		
		percentage=((sum/totalmarks)*100);
		System.out.println("Sum:"+sum);
		System.out.println("Total marks:"+totalmarks);
		System.out.println("Percentage:"+percentage);
		
	}
	public static void main(String[] args) 
	{
		
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the marks of sub1:");
		int sub1=s.nextInt();
		System.out.println("Enter the marks of sub2:");
		int sub2=s.nextInt();
		System.out.println("Enter the marks of sub3:");
		int sub3=s.nextInt();
		
		
		StudentA stud=new StudentA(sub1, sub2, sub3);
		stud.getPercentage();
		
		//System.out.println("Percentage:"+percentage);

	}

	
}


