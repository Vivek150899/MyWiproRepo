package pack1;

public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double b=125.0;
		Double obj1=Double.valueOf(b);
		double c=80.0;
		Double obj2=Double.valueOf(c);
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.compareTo(obj2));
		
		Double d=125.0;
		Double obj3=Double.valueOf(d);
		
		byte v1=obj3.byteValue();
		short v2=obj3.shortValue();
		int v3=obj3.intValue();
		long v4=obj3.longValue();
		float v5=obj3.floatValue();
		double v6=obj3.doubleValue();//unboxing
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
		
		double e=200.0;
		Double obj4=e;   //auto boxing
		
		double f=obj4;  //  auto unboxing

		
		obj4++;
        //first unboxing will happen than increment than storing in a new variable 
		
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.parseDouble("125.0"));

	}

}
