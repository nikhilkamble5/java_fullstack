package core_java;

import java.util.Scanner;

/*public class Day1 {
	int data = 100;

void show()

	{
	System.out.println("show all");
	
	
	}

	public static void main(String[] args) {
		
		Day1 d1= new Day1();
		System.out.println(d1.data);
		d1.show();
	}

}*/

//-----------------------------------
//static varibale adn static funtion

//public class Day1 {
//	static int data = 100;
//
//static void show()
//
//	{
//	System.out.println("show all");
//	
//	
//	}
//
//	public static void main(String[] args) {
//		//recomadned 
//		Day1 d1= new Day1();
//		System.out.println(d1.data);
//		d1.show();
//		
//		
//		// acess static variable and data
//		
//		System.out.println(data);
//		show();
//	}
//
//}

//-----------------------------------

//3=> 1 file multiple calsess
//   	1 fiel 1 public class

//public class Day1 {
//	static int data = 100;
//
//	static void show()
//
//	{
//		System.out.println("show all");
//
//	}
//
//	public static void main(String[] args) {
//		// recomadned
//		Day1 d1 = new Day1();
//		System.out.println(d1.data);
//		d1.show();
//
//		// acess static variable and data
//
//		System.out.println(data);
//		show();
//		PQR p1=d1.new PQR();
//		p1.call();
//	}
//
//	class PQR {
//		void call() {
//			System.out.println("------------------");
//			System.out.println("pqr called ....");
//			System.out.println(Day1.data);
//			Day1.show();
//		}
//	}
//}

//--------------------------------------

//4 flaot 

public class Day1 {
	public static void main(String[] args) {
		
		float i1= 10.23f;
		System.out.println(i1);
		i1=10.23F;
		System.out.println(i1);
		
		i1=(float)10.23f;//down casing;
		int []arr= {10,20,30,40,50};
		System.out.println("size :" + arr.length);
		String s="nkhil";
		System.out.println("Size : "+s.length());
		
		
		System.out.println("1 old way interate array");
		
		for(int i=0;i<arr.length;i++) 
			System.out.println(arr[i]);
		
		System.out.println("best wasy to itenart for each loop");
		
		int arr1[]= new int[10];
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter Data :");
			arr[i]=sc.nextInt();
					
		}
		
		
		
		System.out.println("3 best way iterate  for each loop is");
		int cnt=0;
		for(int value1:arr)
		{
			cnt++;
			System.out.println(value1);
			if(cnt==n)
				break;
			
		}
	
	}
}





















