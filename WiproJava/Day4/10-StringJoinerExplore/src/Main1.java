import java.util.StringJoiner;
public class Main1 {

	public static void main(String[] args) {
		
		StringJoiner sj=new StringJoiner("","[","]");
		sj.add("George").add("sally").add("fred");
		System.out.println(sj);
		System.out.println(sj.toString().length());

	}

}
