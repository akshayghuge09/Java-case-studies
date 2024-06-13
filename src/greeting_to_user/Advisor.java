package greeting_to_user;

import java.util.Random;

public class Advisor {

	private String[] messages = { "Never say No", "Learn from your mistakes", "Take risks, but be calculated",
			"Stay positive and keep going", "Believe in yourself" };

	public Advisor() {
	}
	public String getAdvice() {
		Random random = new Random();
		int index = random.nextInt(messages.length);
		
		return messages[index];
	}

	
}
