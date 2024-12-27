
public class Main2 {

	public static void main(String[] args) {
		
		byte v1=Byte.MIN_VALUE;   //-128
		byte v2=Byte.MAX_VALUE;  //127
		System.out.println(v1);
		System.out.println(v2);
		
		short v3=Short.MIN_VALUE; //-32768
		short v4=Short.MAX_VALUE; //32767
		System.out.println(v3);
		System.out.println(v4);
		
		int v5=Integer.MIN_VALUE;  //-2147483648
		int v6=Integer.MAX_VALUE;  //2147483647
		System.out.println(v5);
		System.out.println(v6);
		
		long v7=Long.MIN_VALUE;  //-9223372036854775808
		long v8=Long.MAX_VALUE;  //9223372036854775807
		System.out.println(v7);
		System.out.println(v8);
		
		char v13=Character.MIN_VALUE;   //  /0
		char v14=Character.MAX_VALUE;   //  /fff
		System.out.println(v13);
		System.out.println(v14);
		
		float v9=Float.MIN_VALUE;     //1.4E-45
		float v10=Float.MAX_VALUE;    //3.4028235E38
		System.out.println(v9);
		System.out.println(v10);
		
		double v11=Double.MIN_VALUE;  //4.9E-324
		double v12=Double.MAX_VALUE;  //1.7976931348623157E308
		System.out.println(v11);
		System.out.println(v12);
		
		

		boolean v15=Boolean.TRUE;   //true
		boolean v16=Boolean.FALSE; // false
		System.out.println(v15);
		System.out.println(v16);
	}

}
