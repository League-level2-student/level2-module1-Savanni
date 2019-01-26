package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> stringsList = new ArrayList<String>();
		// 2. Add five Strings to your list
		stringsList.add("doop");
		stringsList.add("shoop");
		stringsList.add("woop");
		stringsList.add("dee");
		stringsList.add("scoop");
		
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < stringsList.size(); i++) {
			String s = stringsList.get(i);
			// System.out.println("String at element " + i + " = " + s);
		}
		// 4. Print all the Strings using a for-each loop
		System.out.println("Here's an ArrayList");
		for (String s : stringsList) {
			// System.out.println(s);
		}

		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < stringsList.size(); i++) {

			if (i % 2 == 0) {
				// System.out.println(stringsList.get(i));
			}

		}
		// 6. Print all the Strings in reverse order.
		for (int i = stringsList.size() - 1; i >= 0; i--) {

		//	System.out.println(stringsList.get(i));
		}
		// 7. Print only the Strings that have the letter 'e' in them.
		
		for (int i = 0; i < stringsList.size(); i++) {
			if (stringsList.get(i).contains("c")) {
				System.out.println(stringsList.get(i));
			}
			
		}
	
	}
}
