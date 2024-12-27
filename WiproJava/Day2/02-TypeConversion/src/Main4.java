
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int v1=50;
        int v2=70;
        long v3=90;
        
        int v4= (v1+v2);      //Single Mode Expression
        long v5= (v1+v3);    //Mixed mode Expression  in it highest type of data type is used 
        
        float v6=9.0f;
        
        float v7=(v1+v2+v3+v6);
        
        double v8=(v1+v2+v3+v6); //Implicit type of conversion
        
        byte b1=127;
        short s1=1000;
        int s2=(b1+s1);        //implicit type conversion 
        
        
        char v9='A';
        int v10=100;
        long v11=200;
        long v12=v9+v10+v11;
        System.out.println(v12);
	}

}
