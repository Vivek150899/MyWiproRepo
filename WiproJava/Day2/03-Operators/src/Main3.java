
public class Main3 {

	public static void main(String[] args) {
		short v1=100;
		int   v2=500;
		
		boolean result1= v1!=100  && --v2==500;  //if first is wrong than second will not be evaluated 
		System.out.println(result1);
		System.out.println(v2);
		
		boolean result2= v1==101  && v2==500;
		System.out.println(result2);
		
		boolean result3= v1==100  && v2<500;
		System.out.println(result3);
		
		boolean result4= v1>100  && v2<500;
		System.out.println(result4);
		
		boolean result5= v1==100  || v2==500;
		System.out.println(result5);
		
		boolean result6= v1==101  || v2==500;
		System.out.println(result6);
		
		boolean result7= v1==100  || v2<500;
		System.out.println(result7);
		
		boolean result8= v1>100  || v2<500;
		System.out.println(result8);
		
		boolean result9= v1==100  & --v2<500;
		System.out.println(result9);
		System.out.println(v2);
		
		boolean result10= v1>100  | v2<500;
		System.out.println(result10);
		
		boolean result11= (v1==100);
		System.out.println(result11);
		
		boolean result12= (v1!=100);
		System.out.println(result12);

	}

}
