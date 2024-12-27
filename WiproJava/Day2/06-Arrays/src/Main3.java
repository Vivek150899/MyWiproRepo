
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        float prices[]= {5.9f,3.2f,5.4f,7.8f};
System.out.println(prices.length);
	
		
		for(int i=0;i<prices.length;i++) {
			System.out.println(prices[i]);
		}
		for (float v:prices) {     //modern for loop or for each loop
			System.out.println(v);
		}
		prices=null;
	}

}
