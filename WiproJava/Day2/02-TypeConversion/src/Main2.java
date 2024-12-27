
public class Main2 {
   public static void main(String[] args) {
	   byte v1=25;
	   short v2=v1; //widening conversion small to big compiler does not show error
	   int v3=v2;   //widening is also called implicit 
	   long v4=v3;  //widening conversion.......implicit conversion
	   float v5=v4;  //widening conversion.......implicit conversion
	   double v6=v5;  //widening conversion.......implicit conversion
	   
	   //char v7=v2; will show an error because of insufficient memory
	   System.out.println(v2);
	   char v7='A';
	 //  char v8=v7;
	   //boolean v10=true; baki assign nahi ho sakte
	   int v8=v7;      //widening conversion.......implicit conversion
}
}
