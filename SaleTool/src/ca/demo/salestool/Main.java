package ca.demo.salestool;

public class Main {
	public static void main(String []arg){
		SalesData data = new SalesData();
		
		displayGreenting();
		data.display();
	}
	
	private static void displayGreenting(){
		System.out.println("HELLO Happy Sale People!");
		System.out.println("This APP show Sales Data");
	}
}
