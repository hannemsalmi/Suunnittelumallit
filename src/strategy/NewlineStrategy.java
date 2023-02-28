package strategy;

import java.util.Iterator;
import java.util.List;

public class NewlineStrategy implements ListConverter {

	@Override
	public String listToString(List<String> list) {
		String result = "";
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			result += iterator.next() + "\n";
		}
		return result;
	}

}
