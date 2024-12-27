package pack1;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1=new String("abc");
        String s2=new String("abc");
        
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        
        String s3="abc";
        String s4="abc";
        String s5=new String("abc");
        String s6="xyz";
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        System.out.println(s5==s4);
        System.out.println(s5.equals(s4));
        System.out.println(s5==s6);
        
        
        
        
        
	}

}
