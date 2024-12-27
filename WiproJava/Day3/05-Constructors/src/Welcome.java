
public class Welcome {

	private Object message;
	Welcome(){
		System.out.println("India");
	}
	Welcome(int n){
		for (int i=1;i<=n;i++) {
			System.out.println("Russia");
		}
	}
Welcome(String message){
	this.message=message;
}
//String getMessage() {
//	 this.getMessage();
//}
	//This is called constructor

}
