package pack2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Main4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str="Java is a simple Language \n Easy to Learn";
		
		OutputStream os=new FileOutputStream("hello3.txt");
		Writer w=new OutputStreamWriter(os);
		w.write(str);
		
		
		w.flush();
		w.close();
		os.close();

	}

}
