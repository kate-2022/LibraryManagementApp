
public interface MyInterface {
	
	String returnAnyBookEntry();
	
	default String returnAConfirmationThisIsPossible() {
		return "..this obviously works!!! ";
		
	}
	static String letsTryThisAsWell() {
		return "it was the brackets.. again! :P ";
	}
	

}
