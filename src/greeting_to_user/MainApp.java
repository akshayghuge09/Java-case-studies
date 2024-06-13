package greeting_to_user;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		Greeter[] greeters = new Greeter[1];
		for (int i = 0; i < greeters.length; i++) {
			System.out.println("Enter the greeter name");
			String name = sc.next();
			greeters[i] = new Greeter(name);
		}

		for (Greeter greeter : greeters) {
			System.out.println(greeter.sayHello());
		}

		Advisor advisor = new Advisor();
		System.out.println("Advice: " + advisor.getAdvice());

		for (int i = greeters.length - 1; i >= 0; i--) {
			System.out.println(greeters[i].sayGoodBye());
		}

		sc.close();
	}

}
