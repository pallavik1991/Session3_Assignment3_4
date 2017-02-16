import java.util.Scanner;
class Details
{
	public static void main(String s[])
	{
		Student s1,s2,s3;
		s1=new Student();
		s2=new Student();
		s3=new Student();
		
		System.out.println("Enter 1st Student Records:");
		s1.read();
		System.out.println("Enter 2nd Student Records:");
		s2.read();
		System.out.println("Enter 3rd Student Records:");
		s3.read();
		
		s1.calculate();
		s2.calculate();
		s3.calculate();

		System.out.println("\n1st Student Records:");
		s1.display();
		System.out.println("\n2nd Student Records:");
		s2.display();
		System.out.println("\n3rd Student Records:");
		s3.display();
	}
}
class Student
{
	int rno;
	String name,grade;
	int m1,m2,m3;
	float percentage;
	
	void read()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Rno and Name");
	rno=sc.nextInt();
	name=sc.next();
	System.out.println("Enter marks of 3 subjects");
	m1=sc.nextInt();
	m2=sc.nextInt();
	m3=sc.nextInt();
	}
	
	void calculate()
	{
	percentage=(m1+m2+m3)/3.0f;
	if(m1<35||m2<35||m3<35)
	{
	grade="Fail";
	}
	else if(percentage>=80)
	{
	grade="First Class with Distinction";
	}
	else if(percentage>=60)
	{
	grade="First Class";
	}
	else if(percentage>=50)
	{
	grade="Second Class";
	}
	else if(percentage>=40)
	{
	grade="Third Class";
	}
	else if(percentage>=35)
	{
	grade="Pass Class";
	}
	else
	{
	grade="Fail";
	}
	}
	
	void display()
	{
		System.out.println("\nRoll Number:"+rno+"\nName:"+name);
		System.out.println("Marks of 3 Subjects:");
		System.out.println("M1:"+m1+"\tM2:"+m2+"\tM3:"+m3);
		System.out.println("Percentage:"+percentage);
		System.out.println("Grade:"+grade);
	}
	
}