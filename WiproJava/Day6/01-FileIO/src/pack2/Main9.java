package pack2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main9 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream os=new FileOutputStream("something.dat");
        DataOutputStream dos=new DataOutputStream(os);
        
        byte v1=100;
        short v2=1000;
        int v3=10000;
        long v4=100000;
        char v5='A';
        float v6=0.6f;
        double v7=0.66;
        boolean v8=true;
        String  v9="Welcome";
        
        dos.writeByte(v1);
        dos.writeShort(v2);
        dos.writeInt(v3);
        dos.writeLong(v4);
        dos.writeChar(v5);
        dos.writeFloat(v6);
        dos.writeDouble(v7);
        dos.writeBoolean(v8);
        dos.writeUTF(v9);
        
        dos.flush();
        dos.close();
        os.close();
	}

}
