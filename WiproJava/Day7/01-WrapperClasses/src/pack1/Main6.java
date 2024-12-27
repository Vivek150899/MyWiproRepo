package pack1;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long b=125;
		Long obj1=Long.valueOf(b);
		long c=80;
		Long obj2=Long.valueOf(c);
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.compareTo(obj2));
		
		long d=125;
		Long obj3=Long.valueOf(d);
		
		byte v1=obj3.byteValue();
		short v2=obj3.shortValue();
		int v3=obj3.intValue();
		long v4=obj3.longValue();//unboxing
		float v5=obj3.floatValue();
		double v6=obj3.doubleValue();
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
		
		long e=200;
		Long obj4=e;   //auto boxing
		
		long f=obj4;  //  auto unboxing

		
		obj4++;
        //first unboxing will happen than increment than storing in a new variable 
		
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.parseLong("121"));

	}

}
