package pack2;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Main6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String str="Java is a simple Language \n Easy to Learn\nJava is Object Oriented";
		
		OutputStream os=new FileOutputStream("hello4.txt");
		Writer w=new OutputStreamWriter(os);
		
		BufferedWriter bw=new BufferedWriter(w);
		
		bw.write(str);
		
			bw.flush();
			bw.close();
			w.close();
			os.close();
	}

}
