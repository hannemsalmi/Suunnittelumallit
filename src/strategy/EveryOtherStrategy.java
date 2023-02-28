package strategy;

import java.util.List;

public class EveryOtherStrategy implements ListConverter {

	@Override
	public String listToString(List<String> list) {
		String result = "";
		String[] array = list.toArray(new String[list.size()]);
        
		for (int i = 0; i < array.length; i++) {
			result += array[i];
			if (i % 2 == 1) {
				result += "\n";
			}
		}
		return result;
	}
}
