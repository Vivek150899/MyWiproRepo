  class X {
      private  int age=60;

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}
      
}
  class Y extends X{
	  void printAgeAndSalary() {
		  int age=100;
		  System.out.println(super.getAge()+this.getAge());
	  }
  }
  class main {
	  public static void main(String[] args) {
		Y obj=new Y();
		obj.printAgeAndSalary();
	}
  }
