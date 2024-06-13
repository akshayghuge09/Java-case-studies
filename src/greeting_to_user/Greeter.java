package greeting_to_user;

public class Greeter {
	String name;

	public Greeter(String aName) {
		this.name = aName;
	}

	public String sayHello() {
		return "Hello, " + name + "!";
	}

	public String sayGoodBye() {
		return "Goodbye " + name + "!";
	}

}
