package main.java.exercises.date_7_22;

public class Pass {

	public static void main(String[] args) {
		
		Boy toby = new Boy();
		
		toby.setName("Toby");
		
		pass_value(toby.getName());
		System.out.println(toby.getName());
		pass_reference(toby);
		System.out.println(toby.getName());

	}
	
	public static void pass_value(String name) {
		name = "Johnny";
	}
	
	public static void pass_reference(Boy boy) {
		
		boy.setName("Johnny");
	}

}
	
class Boy {
	
	private String name;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String new_name) {
		this.name = new_name;
	}
}
	

