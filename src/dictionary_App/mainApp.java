package dictionary_App;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class mainApp {
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in); 
		Map<Character,Map<String,List<String>>> dictionary = new HashMap<>();
		
		List<String> meaning = new ArrayList<>();
		char c;
		for (c='A';c<='Z';++c)
		{
			dictionary.put(c, null);
			
		}
		
		
		int ch ;
		do
		{
			System.out.println("******************************************************");
			System.out.println("===> MENU");
			System.out.println("1. Add word with meaning ");
			System.out.println("2. Search meaning of word ");
			System.out.println("0. Exit");
			System.out.println("******************************************************");
			System.out.println("Enter the choice : ");
			ch=sc.nextInt();
			
			switch (ch) {
			case 1:
			{
				System.out.println("enter the initial letter of the word");
				char letter = sc.next().charAt(0);
				for (Entry<Character, Map<String, List<String>>> entry : dictionary.entrySet()) {
					Character key = entry.getKey();
					Map val = entry.getValue();
					if(letter == key)
					{
						Map<String,List<String>> word = new HashMap<>();
						System.out.println("Enter the word");
						String w=sc.next();
						word.put(w, meaning);
						System.out.println("enter the no of meaning of word");
						int count = sc.nextInt(); ;
					    for (int i=count;i>0;i--)
						{
					    	 
					    	System.out.println("Enter the meaning");
					    	String mean = sc.next();
							meaning.add(mean);
							
						}
					   
					} 
				}
				
			}
				break;

			
			}
		}while(ch!=0);

	}
 
	
}
