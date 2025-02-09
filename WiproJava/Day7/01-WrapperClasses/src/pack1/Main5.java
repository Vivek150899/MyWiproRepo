package pack1;

public class Main5 {

	public static void main(String[] args) {
		
		short b=125;
		Short obj1=Short.valueOf(b);
		short c=80;
		Short obj2=Short.valueOf(c);
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.compareTo(obj2));
		
		short d=125;
		Short obj3=Short.valueOf(d);
		
		byte v1=obj3.byteValue(); 
		short v2=obj3.shortValue();//unboxing
		int v3=obj3.intValue();
		long v4=obj3.longValue();
		float v5=obj3.floatValue();
		double v6=obj3.doubleValue();
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
		
		short e=200;
		Short obj4=e;   //auto boxing
		
		short f=obj4;  //  auto unboxing

		
		obj4++;
        //first unboxing will happen than increment than storing in a new variable 
		
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.parseShort("121"));
	}

}
