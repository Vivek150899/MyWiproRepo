package pack2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

import pack1.Employee;

public class Main12 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		InputStream is=new FileInputStream("emp.dat");
		ObjectInputStream ois=new ObjectInputStream(is);
		
		Employee e=(Employee)ois.readObject();
		
		System.out.println(e);
		
		ois.close();
		is.close();
		

	}

}
