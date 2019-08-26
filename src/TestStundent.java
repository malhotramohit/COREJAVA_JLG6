
public class TestStundent {

	public static void main(String[] args) {

		// classname refvar = new classname();
		Student std1 = new Student();
		std1.age = 23;
		std1.name = "Ankit";

		// System.out.println(std1.age);
		// System.out.println(std1.name);
		
		std1.displayDetails();
		
		Student std2 = new Student();
		std2.name="Mohit";
		std2.age=25;
		
		std2.displayDetails();
		

	}

}
