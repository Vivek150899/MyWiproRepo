package pack2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream is= new FileInputStream("hello1.txt");
		Reader r=new InputStreamReader(is);
		
		BufferedReader br=new BufferedReader(r);
		
		while (true) {
			String str=br.readLine();
			if (str==null)
				break;
			System.out.println(str);
		}
		
      br.close();
      r.close();
	}

}
