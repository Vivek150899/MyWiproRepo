
public class AClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A obj = new A();
        obj.f1(6);
        obj.f1(10, 20);
        
        short v1=100;
        obj.f2(v1, 200);
        
        obj.f2(100, 200);
        
        byte b=20;
        int x=40;
        obj.f2(b);
        obj.f2(x);
        
        obj.greet();
        obj.greet(4);
	}

}
