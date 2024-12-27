package Pack1;

public interface X {
	void f1();
	void f2();
	default void f3() {
		System.out.println("f3");
	}

}
