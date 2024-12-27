package pack2;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream is=new FileInputStream("something.dat");
		DataInputStream dis= new DataInputStream(is);
		
		byte v1=dis.readByte();
		short v2=dis.readShort();
		int v3=dis.readInt();
		long v4=dis.readLong();
		char v5=dis.readChar();
		float v6=dis.readFloat();
		double v7=dis.readDouble();
		boolean v8=dis.readBoolean();
		String v9=dis.readUTF();
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
		System.out.println(v7);
		System.out.println(v8);
		System.out.println(v9);
		
		dis.close();
		is.close();

	}

}
