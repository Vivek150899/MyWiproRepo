package pack2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import pack1.Employee;

public class Main11 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OutputStream os=new FileOutputStream("emp.dat");
		ObjectOutputStream oos=new ObjectOutputStream(os);
		
		Employee e=new Employee(1055,"Achal",15000.00);
		
		oos.writeObject(e);
		
		oos.flush();
		oos.close();
		os.close();
		

	}

}
