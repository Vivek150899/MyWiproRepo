package pack2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main3 {

	public static void main(String[] args) throws IOException {
		
		InputStream is=new FileInputStream("hello1.txt"); 
		Reader r=new InputStreamReader(is);
		
		char[] arr=new char[is.available()];
		r.read(arr);
		
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}

	}

}
