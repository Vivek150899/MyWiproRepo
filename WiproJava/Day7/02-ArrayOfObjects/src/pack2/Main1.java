package pack2;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr=new Integer[3];
		arr[0]=Integer.valueOf(500);
		arr[1]=Integer.valueOf(550);
		arr[2]=Integer.valueOf(600);
		
/*		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i].toString());
		}*/
		
		for(int i:arr) {
			System.out.println(i);
		}

	}

}
