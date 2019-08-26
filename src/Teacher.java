
public class Teacher {

	// instance var
	// var outside method but inside class
	int age;
	String name;
	String subject;

	public String getName() {
		// local variable
		int height = 90;

		return "Dr. " + name;
	}

	public int getAge() {
		return age;
	}

}
