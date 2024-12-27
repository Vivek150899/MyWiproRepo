
public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student s1=new Student();
       // s1.mark1=24;
       // s1.mark2=45;
       // s1.mark3=35;
       s1.setMark1(24);
       s1.setMark2(45);
       s1.setMark3(44);
       
       System.out.println(s1.getMark1());
       System.out.println(s1.getMark2());
       System.out.println(s1.getMark3());
       
       int r1=s1.getTotal();
       int r2=s1.getAverage();
       System.out.println(r1);
       System.out.println(r2);
	}

}
