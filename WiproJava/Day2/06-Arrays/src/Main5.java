
public class Main5 {

	public static void main(String[] args) {
		
		char ch1='A';
		char ch2='B';
		char[] values=new char[] {ch1 , ch2 , 'C' , 'D' , 'E' };
		System.out.println(values[0]);
		System.out.println(values[4]);
		System.out.println(values[values.length-1]);
        //System.out.println(values[8]);    error out of bound
		//System.out.println(values[-10]);  error out of bound run time 
	}

}
