import java.util.StringJoiner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner sj=new StringJoiner(" ");
		sj.add("Ram");
		sj.add("Sita");
		sj.add("Ramesh");
		
		System.out.println("String Joiner 1: "+sj.toString());
		
		StringJoiner sj1=new StringJoiner(" ");
		sj1.add("Manoj");
		sj1.add("Suresh");
		sj1.add("Rakesh");
		
		System.out.println("String Joiner 2: "+sj1.toString());
		
		StringJoiner str=sj.merge(sj1);
		System.out.println("Merged StringJoiner : "+str);
		
		
		

	}

}
