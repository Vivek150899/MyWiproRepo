
public class Main1 {

	public static void main(String[] args) {
		
	
		int[] scores;        //Declaration  its also called reference variable
		scores=new int[3];   //Initialization or creation   
		
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
		
		scores[0]=33;
		scores[1]=40;
		scores[2]=50;
		
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
		int sum=0;
		for(int i=0;i<scores.length;i++) {
			sum+=scores[i];
			System.out.println(sum);
		}
		scores=null;
		

	}

}
