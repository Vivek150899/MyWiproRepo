package pack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main7 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		InputStream is=System.in;
		Reader r=new InputStreamReader(is);
		
		BufferedReader br=new BufferedReader(r);
		String str=br.readLine();
		System.out.println(str);
		
		br.close();
		r.close();
		is.close();
		
		

	}

}
