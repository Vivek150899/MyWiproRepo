
public class Employee {
        private int id;
        private String name;
        private double basic;
        
        
        
		Employee(int id, String name, double basic) {
			super();
			this.id = id;
			this.name = name;
			this.basic = basic;
		}
		int getId() {
			return id;
		}
		void setId(int id) {
			this.id = id;
		}
		String getName() {
			return name;
		}
		void setName(String name) {
			this.name = name;
		}
		double getBasic() {
			return basic;
		}
		void setBasic(double basic) {
			this.basic = basic;
		}
        
        //generate parameterized constructor
        //generate getters and setters
        
        
}
