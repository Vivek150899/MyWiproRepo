package pack1;

public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float b=125.0f;
		Float obj1=Float.valueOf(b);
		float c=80.0f;
		Float obj2=Float.valueOf(c);
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.compareTo(obj2));
		
		float d=125.0f;
		Float obj3=Float.valueOf(d);
		
		byte v1=obj3.byteValue();
		short v2=obj3.shortValue();
		int v3=obj3.intValue();
		long v4=obj3.longValue();
		float v5=obj3.floatValue();//unboxing
		double v6=obj3.doubleValue();
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
		
		float e=200.0f;
		Float obj4=e;   //auto boxing
		
		float f=obj4;  //  auto unboxing

		
		obj4++;
        //first unboxing will happen than increment than storing in a new variable 
		
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.parseFloat("121.0f"));

	}

}
