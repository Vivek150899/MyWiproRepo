
public class E extends D{
	
	int z;

	E(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	E() {
		super();
		System.out.println("without para E");
	}
}
