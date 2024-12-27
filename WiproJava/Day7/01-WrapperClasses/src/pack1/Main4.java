package pack1;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=120;
		Byte obj1=Byte.valueOf(b);
		byte c=80;
		Byte obj2=Byte.valueOf(c);
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.compareTo(obj2));
		
		byte d=125;
		Byte obj3=Byte.valueOf(d);
		
		byte v1=obj3.byteValue(); //unboxing
		short v2=obj3.shortValue();
		int v3=obj3.intValue();
		long v4=obj3.longValue();
		float v5=obj3.floatValue();
		double v6=obj3.doubleValue();
		
		byte e=100;
		Byte obj4=e;   //auto boxing
		
		byte f=obj4;  //  auto unboxing

		
		obj4++;
        //first unboxing will happen than increment than storing in a new variable 
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.parseByte("125"));
		
		

	}

}
