package pack2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str="Welcome to java \n Hello World!!!";
		OutputStream os=new FileOutputStream("hello2.txt");
		
		for (int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			os.write(ch);
		}
      os.flush();
      os.close();
	}

}
