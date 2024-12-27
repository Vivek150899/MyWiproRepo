package pack1;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.sql.SQLException;

public class B {
	public void m1() throws SQLException{
		
	}

}
//overriding methods can throw less number of exceptions
//overriding method can not throw  any checked exception which is not listed 
//Overriding method  can throw any number of unchecked exception which is not listed in the superclass
// overriding method should not narrow down the exception listed in the superclass method 