import java.util.StringJoiner;

public class Main3 {

	public static void main(String[] args) {
		
		StringJoiner sj=new StringJoiner(" : ");
		sj.add("abc").add("ijk").add("xyz");
		System.out.println(sj);
		
		StringJoiner sj1=new StringJoiner(" : ");
		sj1.add("abc").add("ijk").add("xyz");
		System.out.println(sj1);
		System.out.println(sj.equals(sj1));
		
	}

}
