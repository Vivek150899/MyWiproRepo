package pack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStream is=System.in;
		Reader r=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(r);
		String inputStr;
		int n1,n2;
		System.out.println("Enter number 1 : ");
		inputStr=br.readLine();
		n1=Integer.parseInt(inputStr);
		
		System.out.println("Enter number 2 : ");
		inputStr=br.readLine();
		n2=Integer.parseInt(inputStr);
		
		System.out.println(n1+n2);
		System.out.println(n1-n2);
		System.out.println(n1*n2);
		System.out.println(n1/n2);
		
		br.close();
		r.close();
		is.close();
		
		

	}

}
