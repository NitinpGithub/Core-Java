package String;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacterFromString {

	public static void main(String[] args) {

		String s = "aaabcccdef";
		Map<Character, Integer> map = new HashMap<>();
		int counter = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				++counter;

				System.out.println(counter);
				if (counter == 1) {
					System.out.println(entry.getKey());
					break;
				}

			}
		}
	}

}
