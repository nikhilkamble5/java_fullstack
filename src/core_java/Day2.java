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



//-------------------------
/*class Fan{
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
*/
//---------------------------
//with Float price
/*
class Fan{
	String types;
	int noOfWings;
	float price;
}
public class Day2{
	public static void main(String[] args)  {

		Fan f1= new Fan();
		f1.types="Wall Fan";
		f1.noOfWings=3;
		f1.price=2000.6f;

		Fan f2= new Fan();
		f2.types="Celling Fan";
		f2.noOfWings=4;
		f2.price=3000.2f;

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
*/
//-------------------------

//using methid set and siplay method

//class Fan{
//    String type;
//    int noOfWIngs;
//    float price;
//
//    void setValue(String t,int now, float p){
//        type=t;
//        noOfWIngs= now;
//        price=p;
//    }
//    void display(){
//        System.out.println("Type : "+type);
//        System.out.println("Number of WIngs :"+noOfWIngs);
//        System.out.println("Price: "+price);
//    }
//}
//public class Day2{
//    public static void main(String[] args) {
//        Fan f1= new Fan(),f2 = new Fan();
//
//        //f1 1002 type=wall noofwings=3 price=6000.02
//        //f2 10003 type =ceing noofwings=4 price 4000.08
//
//      f1.setValue("wall",3,5200.04F);
//      f2.setValue("celling",4,2300.02F);
//
//        System.out.println("Fan 1 info");
//        f1.display();
//        System.out.println();
//        System.out.println("Fan2 infor");
//        f2.display();
//
//
//    }
//}


//class Circle{
//    int radius;
//    double area;
//
//    void setRadius(int r){
//        radius=r;
//    }
//    void calCulateArea(){
//        area=Math.PI * radius * radius;
//
//    }
//    void display(){
//        System.out.print("Radius:"+radius);
//        System.out.println(" , Area "+area);
//    }
//}
//public class Day2{
//    public static void main(String[] args){
//        Circle c1= new Circle(),c2=new Circle();
//        c1.setRadius(3);
//        c1.calCulateArea();
//        c1.display();
//
//        System.out.println();
//        c2.setRadius(4);
//        c2.calCulateArea();
//        c2.display();
//    }
//}

class Reactangle{
    int lenth,breadth;
    int area;

    void setSide(int l,int b){
        lenth =l;
        breadth=b;

    }
    void calculateArea(){
        area= lenth*breadth;

    }
    void displayArea(){
        System.out.println("lenth :"+lenth+" bredth : "+breadth);
        System.out.println("Area "+area);
    }
}
public class Day2 {
    public static void main(String[] args) {

        Reactangle r1= new Reactangle();
        r1.setSide(2, 4);
        r1.calculateArea();
        r1.displayArea();
    }
}