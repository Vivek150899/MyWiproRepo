public class A {
     int age=60;
     static String city= "Mumbai";
     void printAge() {
    	 System.out.println(this.age);
     }
     
     void printAge1(){
    	 System.out.println(city);
     }
     
     static void print() {
    	 System.out.println("Welcome");
     }
     
    static void printCity() {
    	 System.out.println(city);
    //	 System.out.println(this.age);
     }
}
//static functions should not use instance variable 
