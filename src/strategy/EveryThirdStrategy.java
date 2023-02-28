package strategy;

import java.util.List;

public class EveryThirdStrategy implements ListConverter {

	@Override
	public String listToString(List<String> list) {
		String result = "";
		for (int i = 0; i < list.size(); i++) {
			result += list.get(i);
			if ((i + 1) % 3 == 0) {
				result += "\n";
			}
		}
		return result;
	}

}
