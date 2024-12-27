package pack2;

import pack1.IdGenerator;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IdGenerator gen1=IdGenerator.getInstance();
		
		System.out.println(gen1.getNextId());
		System.out.println(gen1.getNextId());
		System.out.println(gen1.getNextId());
		
		IdGenerator gen2=IdGenerator.getInstance();
		
		System.out.println(gen2.getNextId());
		System.out.println(gen2.getNextId());
		System.out.println(gen2.getNextId());
		
        IdGenerator gen3=IdGenerator.getInstance();
		
		System.out.println(gen3.getNextId());
		System.out.println(gen3.getNextId());
		System.out.println(gen3.getNextId());
		
		
		

	}

}
