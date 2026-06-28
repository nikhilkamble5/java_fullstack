package core_java;




//public class Day2
//{
//public static void main(String[] args) {
//	String s1="10.25";
//	String s2="20.35";
//
//	System.out.println(s1+s2);
//	float no1= Float.parseFloat(s1);
//	float no2=Float.parseFloat(s2);
//	System.out.println(no1+no2);
//
//}
//}





//public class Day2
//{
//	public static void main(String   [] args)
//	{
//		String s1="10.11";
//				String s2= "20.22";
//		System.out.println(s1+s2);
//		double  no1= Double.parseDouble(s1);
//		double  no2=Double.parseDouble(s2);
//
//		System.out.println(no1+no2); //ans 10.33
//	}
//}


//public class Day2
//{
//	public static void main(String   [] names)
//	{
//		System.out.println("First Name : "+ names[0]);
//		System.out.println("Second Name : "+names[1]);
//		System.out.println("third name : "+names[2]);
//
//	}
//}








//java Day2 Shreyash Shailendra Gaikwad
//ArrayIndexOutOfBoundsException
//First Name : Shreyash
//Middle Name : Shailendra
//Last Name : Gaikwad

//... Variable Arguments ...VarArgs







//command line argument

//public class Day2{
//	static void main(String [] nums) {
//		int no1= Integer.parseInt(nums[0]);
//		int no2=Integer.parseInt(nums[1]);
//		System.out.println(no1+" + "+no2+" = "+(no1+no2));
//	}
//}

//Classes


//class Fan
//{
//	String type;//Celing Wall Table
//	int noOfWings;
//	float price;
//}
//
//public class Day2{
//	public static void main(String[] args) {
//		Fan f1=new Fan() , f2=new Fan();
//		//f1 1002 type noOfWings price
//		//f2 2002 type noOfWings price
//
//		f1.type="Wall";
//		f1.noOfWings=3;
//		f1.price=5600.6f;
//
//		f2.type="Celing";
//		f2.noOfWings=4;
//		f2.price=15600.6F;
//
//		System.out.println("Fan 1 info");
//		System.out.println("Type : "+f1.type);
//		System.out.println("Number Of Wings : "+f1.noOfWings);
//		System.out.println("Price : "+f1.price);
//
//		System.out.println("Fan 2 info");
//		System.out.println("Type : "+f2.type);
//		System.out.println("Number Of Wings : "+f2.noOfWings);
//		System.out.println("Price : "+f2.price);
//	}
//}
//-------------------------
class Fan{
String types;
int noOfWings;
float price;
}
public class Day2{
	static void main() {

		Fan f1= new Fan();
		f1.types="Wall Fan";
		f1.noOfWings=3;
		f1.price=2000;

		Fan f2= new Fan();
		f2.types="Celling Fan";
		f2.noOfWings=4;
		f2.price=3000;

		System.out.println("Fan 1 Info");
		System.out.println("Type :"+f1.types);
		System.out.println("Number of wings : "+f1.noOfWings);
		System.out.println("Price :"+f2.price);
		System.out.println();
		System.out.println();
		System.out.println("Fan 2 Info");
		System.out.println("Types :"+ f2.types);
		System.out.println("Number of wings :"+f2.noOfWings);
		System.out.println("prices"+ f2.price);
	}
}
//-------------------------

/*class Fan
{
	String type;//Celing Wall Table
	int noOfWings;
	float price;
}

public class Day2{
	public static void main(String[] args) {
		Fan f1=new Fan() , f2=new Fan();
		
		f1.type="Wall";// 3 lac
		f1.noOfWings=3;
		f1.price=5600.6f;
		
		f2.type="Celing";// 3 lac
		f2.noOfWings=4;
		f2.price=15600.6F;
		
		System.out.println("Fan 1 info"); // 3 lac
		System.out.print("Type : "+f1.type);
		System.out.print(" , Number Of Wings : "+f1.noOfWings);
		System.out.println(" , Price : "+f1.price);
		
		System.out.println("Fan 2 info");// 3 lac
		System.out.print("Type : "+f2.type);
		System.out.print(" , Number Of Wings : "+f2.noOfWings);
		System.out.println(" , Price : "+f2.price);
	}
}*/

/*
class Fan
{
	String type;//Celing Wall Table
	int noOfWings;
	float price;
	
	//t now p => Local Variables
	void setValues(String t,int now,float p)
	{
		type=t;
		noOfWings=now;
		price=p;
	}
	
	void display()
	{
		System.out.print("Type : "+type);
		System.out.print(" , Number Of Wings : "+noOfWings);
		System.out.println(" , Price : "+price);
	}
}

public class Day2{
	public static void main(String[] args) {
		Fan f1=new Fan() , f2=new Fan();
		//f1 1002 type=Wall noOfWings=3 price=5600.6
		//f2 2002 type=Celing noOfWings=4 price=15600.6
	
		f1.setValues("Wall", 3,5600.6f);//f1 current object
		
		f2.setValues("Celing", 4,15600.6f);//f2 current object
		
		System.out.println("Fan 1 info"); // 3 lac
		display();
		
		System.out.println("Fan 2 info");// 3 lac
		f2.display();
	}
}
*/


/*class Circle
{
	int radius;
	double area;
	
	void setRadius(int r)
	{
		radius=r;
	}
	void calculateArea()
	{
		area = Math.PI * radius * radius;
	}
	void display()
	{
		System.out.print("Radius : " + radius);
		System.out.println(" , Area : " + area);
	}
}

class Rectangle
{
	int length,breadth;
	int area;
	void setSides(int l,int b)
	{
		length=l;
		breadth=b;
	}
	void calculateArea()
	{
		area = length * breadth;
	}
	void display()
	{
		System.out.println("Length : " + length + " , Breadth : "+ breadth);
		System.out.println("Area : " + area);
	}
}

public class Day2{
	public static void main(String[] args) {
		Circle c1=new Circle();
		//c1 radius=3 area
		c1.setRadius(3);
		c1.calculateArea();
		c1.display();
		
		Rectangle r1=new Rectangle();//r1 length=10 breadth=20 area=200
		r1.setSides(10, 20);
		r1.calculateArea();
		r1.display();
	}
}*/

//Using classes Best Example class Student
//After class Simple{} ; 
// ; It is Optional

/*class Student {
    
	int rollno;
    String name;
    float per;
    
    void setValues(int r,String n,float p){
    	rollno =r;
    	name=n;
    	per=p;
    }
    void display() {
        System.out.print("Student Roll Number: " +rollno);
        System.out.print(" , Name : " + name);
        System.out.println(" Per : " + per);
    }
  
};

 class Day2{
	 public static void main(String[] args) {

	        Student s1 = new Student() , s2 = new Student();

	        s1.setValues(101, "Nikhil", 77.88F);
	        s2.setValues(102, "Shreyash", 67.88f);
	        
	        s1.display();
	        s2.display();
	    }
}*/

//javac Simple.java
//		Simple.class Java Executable File 
//		Byte Code  /  Class File / Java Executable File 

//Q) Can you save a java source file by other name than the class name?
// Yes

//class Day2{}

//Save Hard.java
//javac Day10.java
//		Day2.class
//java Day2

//1 Problem
//public class Day2{}

//Not Save Day10.java
//Error 
//Save Day2.java

//1 File Can have 1 public class That class Should be main

//Variable - Value Change

//3 Types Of Variables
//1] Instance Variable - Inside class & outside Method
//2] Static Variable -  Inside class & outside Method but declared static 
//						Not local
//3] Local Variable  - inside method

/*class Day2
{
	int iv=100;
	static int sv=200;
	
	void show()
	{
		//static int sv1=200;//Error Static Chapter!!!
		int lv=300;
		System.out.println(lv);
	}
	
	public static void main(String[] args) {
		
		Day2 d1=new Day2();
		System.out.println(d1.iv);
		
		System.out.println(sv);
		System.out.println(Day2.sv);
		
		d1.show();
	}
}*/

//Any where condition if() else if() while() for( ; ; )
//always java boolean otherwise throw error

/*class Day2{

	public static void main(String[] args) {
		
		boolean b=true;
		System.out.println(b);
		b=false;
		System.out.println(b);
		b=10>1;
		System.out.println(b);
		b=10<1;
		System.out.println(b);
		
		if(10>1)//boolean true false 
			System.out.println("Yes");
		else
			System.out.println("No");
		System.out.println("R1");
		
		
	}
}*/


