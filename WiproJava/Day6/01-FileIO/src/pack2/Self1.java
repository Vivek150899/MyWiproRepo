package pack2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Self1 {

	public static void main(String[] args) throws IOException {
		InputStream is;
		is=new FileInputStream("hello1.txt");
		while (true) {
		int v1=is.read();
		if (v1==-1)
			break;
		char ch=(char) v1;
		System.out.print(ch);
		}
		is.close();
	          

	}

}
